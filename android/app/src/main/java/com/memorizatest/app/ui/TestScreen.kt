package com.memorizatest.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memorizatest.app.data.ExamHistoryStore
import com.memorizatest.app.data.MistakesStore
import com.memorizatest.app.data.QuestionBank
import com.memorizatest.app.ads.InterstitialAdManager
import com.memorizatest.app.model.ExamConfig
import kotlinx.coroutines.delay

private val TestBlue = Color(0xFF28A9FF)
private val TestGreen = Color(0xFF37D6AD)
private val TestRed = Color(0xFFFF6B6B)
private val TestPanel = Color(0xE6172435)
private val TestPanelDark = Color(0xE6101927)

@Composable
fun TestScreen(
    topic: String? = null,
    questionIds: Set<Int>? = null,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val activity = context as? android.app.Activity

    val questions = remember(topic, questionIds) {
        val source = when {
            questionIds != null -> {
                QuestionBank.questions.filter {
                    it.active && it.id in questionIds
                }
            }

            topic != null -> {
                QuestionBank.questions.filter {
                    it.active && it.topic == topic
                }
            }

            else -> {
                QuestionBank.questions.filter {
                    it.active
                }
            }
        }

        source
            .shuffled()
            .take(ExamConfig.QUESTION_COUNT)
    }

    var questionIndex by remember { mutableIntStateOf(0) }
    var finished by remember { mutableStateOf(false) }
    var reviewing by remember { mutableStateOf(false) }
    var showSummary by remember { mutableStateOf(false) }
    var mistakesSaved by remember { mutableStateOf(false) }
    var historySaved by remember { mutableStateOf(false) }

    fun finishTestWithAd() {
        showSummary = false

        val isFullExam =
            topic == null &&
                questionIds == null &&
                questions.size == ExamConfig.QUESTION_COUNT

        if (isFullExam && activity != null) {
            InterstitialAdManager.show(activity) {
                finished = true
            }
        } else {
            finished = true
        }
    }

    var secondsRemaining by remember {
        mutableIntStateOf(ExamConfig.DURATION_SECONDS)
    }

    val answers = remember(questions) {
        mutableStateListOf<Int?>().apply {
            repeat(questions.size) {
                add(null)
            }
        }
    }

    LaunchedEffect(finished) {
        while (!finished && secondsRemaining > 0) {
            delay(1000)
            secondsRemaining--
        }

        if (secondsRemaining <= 0) {
            if (!mistakesSaved) {
                MistakesStore.recordMistakes(
                    context = context,
                    questions = questions,
                    answers = answers
                )
                mistakesSaved = true
            }

            val isFullExam =
                topic == null &&
                    questionIds == null &&
                    questions.size == ExamConfig.QUESTION_COUNT

            if (isFullExam && !historySaved) {
                val errors = questions.indices.count { index ->
                    answers.getOrNull(index) !=
                        questions[index].correctAnswer
                }

                ExamHistoryStore.recordExam(
                    context = context,
                    errors = errors,
                    passed = errors <= ExamConfig.MAX_ERRORS
                )

                historySaved = true
            }

            finishTestWithAd()
        }
    }

    if (reviewing) {
        ReviewScreen(
            questions = questions,
            answers = answers,
            onBack = {
                reviewing = false
            }
        )
        return
    }

    if (finished) {
        ResultScreen(
            questions = questions,
            answers = answers,
            onReview = {
                reviewing = true
            },
            onRepeat = {
                for (i in answers.indices) {
                    answers[i] = null
                }

                questionIndex = 0
                secondsRemaining = ExamConfig.DURATION_SECONDS
                mistakesSaved = false
                historySaved = false
                finished = false
                showSummary = false
            },
            onBackHome = onBack
        )
        return
    }

    if (showSummary) {
        ExamSummaryScreen(
            answers = answers,
            onBackToExam = {
                showSummary = false
            },
            onGoToQuestion = { index ->
                questionIndex = index
                showSummary = false
            },
            onSubmit = {
                if (!mistakesSaved) {
                    MistakesStore.recordMistakes(
                        context = context,
                        questions = questions,
                        answers = answers
                    )
                    mistakesSaved = true
                }

                val isFullExam =
                    topic == null &&
                        questionIds == null &&
                        questions.size == ExamConfig.QUESTION_COUNT

                if (isFullExam && !historySaved) {
                    val errors = questions.indices.count { index ->
                        answers.getOrNull(index) !=
                            questions[index].correctAnswer
                    }

                    ExamHistoryStore.recordExam(
                        context = context,
                        errors = errors,
                        passed = errors <= ExamConfig.MAX_ERRORS
                    )

                    historySaved = true
                }

                finishTestWithAd()
            }
        )
        return
    }

    if (questions.isEmpty()) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF07111C)
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text(
                    text = "No hay preguntas disponibles",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Volver",
                    color = TestBlue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { onBack() }
                )
            }
        }
        return
    }

    val question = questions[questionIndex]
    val selectedAnswer = answers[questionIndex]

    val minutes = secondsRemaining / 60
    val seconds = secondsRemaining % 60

    val answeredCount = answers.count { it != null }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF07111C)
    ) {
        BoxWithConstraints(
            modifier = Modifier.fillMaxSize()
        ) {
            val isTablet = maxWidth >= 700.dp

            Column(
                modifier = Modifier
                    .widthIn(max = 920.dp)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .verticalScroll(rememberScrollState())
                    .padding(
                        horizontal = if (isTablet) 30.dp else 18.dp,
                        vertical = if (isTablet) 26.dp else 18.dp
                    )
            ) {

                ExamTopBar(
                    title = when {
                        questionIds != null -> "Mis fallos"
                        topic != null -> topic
                        else -> "Simulación de examen"
                    },
                    minutes = minutes,
                    seconds = seconds,
                    lowTime = minutes < 5,
                    onBack = onBack
                )

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "PREGUNTA ${questionIndex + 1}",
                            color = TestBlue,
                            fontSize = 11.sp,
                            letterSpacing = 1.4.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "${questionIndex + 1} de ${questions.size}",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "$answeredCount/${questions.size}",
                            color = TestGreen,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Black
                        )

                        Text(
                            text = "respondidas",
                            color = Color.White.copy(alpha = 0.42f),
                            fontSize = 10.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                ProgressBar(
                    progress =
                        (questionIndex + 1).toFloat() /
                            questions.size.toFloat()
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Ver todas las preguntas",
                    color = TestBlue,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .clickable {
                            showSummary = true
                        }
                        .padding(vertical = 7.dp)
                )

                Spacer(modifier = Modifier.height(14.dp))

                QuestionCard(
                    question = question.text,
                    isTablet = isTablet
                )

                Spacer(modifier = Modifier.height(16.dp))

                question.answers.forEachIndexed { index, answer ->
                    AnswerButton(
                        letter = listOf("A", "B", "C")[index],
                        text = answer,
                        selected = selectedAnswer == index,
                        onClick = {
                            answers[questionIndex] = index
                        }
                    )

                    Spacer(modifier = Modifier.height(11.dp))
                }

                Spacer(modifier = Modifier.height(10.dp))

                NavigationButtons(
                    canGoBack = questionIndex > 0,
                    isLast = questionIndex == questions.lastIndex,
                    onPrevious = {
                        if (questionIndex > 0) {
                            questionIndex--
                        }
                    },
                    onNext = {
                        if (questionIndex < questions.lastIndex) {
                            questionIndex++
                        } else {
                            showSummary = true
                        }
                    }
                )

                if (selectedAnswer == null) {
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Puedes dejarla sin responder y volver después.",
                        color = Color.White.copy(alpha = 0.42f),
                        fontSize = 11.5.sp
                    )
                }

                Spacer(modifier = Modifier.height(28.dp))
            }
        }
    }
}

@Composable
private fun ExamTopBar(
    title: String,
    minutes: Int,
    seconds: Int,
    lowTime: Boolean,
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.06f))
                .border(
                    1.dp,
                    Color.White.copy(alpha = 0.10f),
                    CircleShape
                )
                .clickable { onBack() },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "‹",
                color = Color.White,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )

            Text(
                text = "Permiso B",
                color = Color.White.copy(alpha = 0.40f),
                fontSize = 10.5.sp
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(
                    if (lowTime) {
                        TestRed.copy(alpha = 0.13f)
                    } else {
                        TestBlue.copy(alpha = 0.12f)
                    }
                )
                .border(
                    1.dp,
                    if (lowTime) {
                        TestRed.copy(alpha = 0.42f)
                    } else {
                        TestBlue.copy(alpha = 0.32f)
                    },
                    RoundedCornerShape(16.dp)
                )
                .padding(
                    horizontal = 14.dp,
                    vertical = 9.dp
                )
        ) {
            Text(
                text = "%02d:%02d".format(minutes, seconds),
                color = if (lowTime) TestRed else Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}

@Composable
private fun ProgressBar(
    progress: Float
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(7.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White.copy(alpha = 0.07f))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .fillMaxHeight()
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            TestBlue,
                            TestGreen
                        )
                    )
                )
        )
    }
}

@Composable
private fun QuestionCard(
    question: String,
    isTablet: Boolean
) {
    val shape = RoundedCornerShape(24.dp)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(
                Brush.verticalGradient(
                    listOf(
                        TestPanel,
                        TestPanelDark
                    )
                )
            )
            .border(
                1.dp,
                Color.White.copy(alpha = 0.08f),
                shape
            )
            .padding(
                horizontal = if (isTablet) 24.dp else 18.dp,
                vertical = if (isTablet) 24.dp else 20.dp
            )
    ) {
        Text(
            text = question,
            color = Color.White,
            fontSize = if (isTablet) 24.sp else 21.sp,
            lineHeight = if (isTablet) 32.sp else 28.sp,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
private fun AnswerButton(
    letter: String,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val accent =
        if (selected) TestBlue
        else Color.White.copy(alpha = 0.10f)

    val shape = RoundedCornerShape(20.dp)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 72.dp)
            .clip(shape)
            .background(
                if (selected) {
                    Brush.horizontalGradient(
                        listOf(
                            Color(0xFF163E62),
                            Color(0xFF122C43)
                        )
                    )
                } else {
                    Brush.horizontalGradient(
                        listOf(
                            Color(0xD9152232),
                            Color(0xD9101926)
                        )
                    )
                }
            )
            .border(
                width = if (selected) 1.5.dp else 1.dp,
                color = accent,
                shape = shape
            )
            .clickable { onClick() }
            .padding(
                horizontal = 14.dp,
                vertical = 13.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(CircleShape)
                .background(
                    if (selected) {
                        TestBlue
                    } else {
                        Color.White.copy(alpha = 0.05f)
                    }
                )
                .border(
                    1.dp,
                    if (selected) {
                        TestBlue
                    } else {
                        Color.White.copy(alpha = 0.12f)
                    },
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = letter,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )
        }

        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = text,
            modifier = Modifier.weight(1f),
            color = Color.White,
            fontSize = 15.sp,
            lineHeight = 21.sp,
            fontWeight =
                if (selected) FontWeight.Bold
                else FontWeight.Medium
        )

        if (selected) {
            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "✓",
                color = TestGreen,
                fontSize = 18.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}

@Composable
private fun NavigationButtons(
    canGoBack: Boolean,
    isLast: Boolean,
    onPrevious: () -> Unit,
    onNext: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        if (canGoBack) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(56.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.White.copy(alpha = 0.05f))
                    .border(
                        1.dp,
                        Color.White.copy(alpha = 0.10f),
                        RoundedCornerShape(18.dp)
                    )
                    .clickable { onPrevious() },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Anterior",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .weight(if (canGoBack) 1.4f else 1f)
                .height(56.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            TestBlue,
                            Color(0xFF347AF5)
                        )
                    )
                )
                .clickable { onNext() },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text =
                    if (isLast) {
                        "Revisar antes de entregar"
                    } else {
                        "Siguiente"
                    },
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}
