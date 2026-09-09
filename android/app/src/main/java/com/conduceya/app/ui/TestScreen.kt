package com.conduceya.app.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.conduceya.app.data.QuestionBank
import com.conduceya.app.model.ExamConfig
import kotlinx.coroutines.delay

private val TestBlue = Color(0xFF0969F6)

@Composable
fun TestScreen(
    onBack: () -> Unit
) {
    val questions = remember {
        QuestionBank.questions
            .shuffled()
            .take(ExamConfig.QUESTION_COUNT)
    }

    var questionIndex by remember { mutableIntStateOf(0) }
    var finished by remember { mutableStateOf(false) }
    var reviewing by remember { mutableStateOf(false) }

    var secondsRemaining by remember {
        mutableIntStateOf(ExamConfig.DURATION_SECONDS)
    }

    val answers = remember {
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
            finished = true
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
                finished = false
            },
            onBackHome = onBack
        )
        return
    }

    val question = questions[questionIndex]
    val selectedAnswer = answers[questionIndex]

    val minutes = secondsRemaining / 60
    val seconds = secondsRemaining % 60

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF7F8FA)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 28.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextButton(
                    onClick = onBack
                ) {
                    Text(
                        text = "‹ Salir",
                        color = TestBlue
                    )
                }

                Text(
                    text = "%02d:%02d".format(minutes, seconds),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (minutes < 5) {
                        Color(0xFFC93C3C)
                    } else {
                        Color(0xFF111827)
                    },
                    modifier = Modifier.padding(top = 12.dp)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Test de examen",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Pregunta ${questionIndex + 1} de ${questions.size}",
                fontSize = 14.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .background(
                        Color(0xFFE5E7EB),
                        RoundedCornerShape(10.dp)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(
                            (questionIndex + 1).toFloat() /
                                questions.size.toFloat()
                        )
                        .height(6.dp)
                        .background(
                            TestBlue,
                            RoundedCornerShape(10.dp)
                        )
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = question.text,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 30.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            question.answers.forEachIndexed { index, answer ->

                AnswerButton(
                    letter = listOf("A", "B", "C")[index],
                    text = answer,
                    selected = selectedAnswer == index,
                    onClick = {
                        answers[questionIndex] = index
                    }
                )

                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if (questionIndex < questions.lastIndex) {
                        questionIndex++
                    } else {
                        finished = true
                    }
                },
                enabled = selectedAnswer != null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = TestBlue,
                    disabledContainerColor = Color(0xFFD1D5DB)
                )
            ) {
                Text(
                    text =
                        if (questionIndex < questions.lastIndex) {
                            "Siguiente"
                        } else {
                            "Finalizar test"
                        },
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun AnswerButton(
    letter: String,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 76.dp),
        shape = RoundedCornerShape(18.dp),
        border = BorderStroke(
            width = if (selected) 2.dp else 1.dp,
            color =
                if (selected) TestBlue
                else Color(0xFFD1D5DB)
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor =
                if (selected) TestBlue
                else Color.White,
            contentColor =
                if (selected) Color.White
                else Color(0xFF111827)
        )
    ) {
        Text(
            text =
                if (selected) {
                    "✓  $letter   $text"
                } else {
                    "$letter   $text"
                },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            fontSize = 15.sp,
            lineHeight = 21.sp,
            fontWeight =
                if (selected) FontWeight.Bold
                else FontWeight.Normal
        )
    }
}
