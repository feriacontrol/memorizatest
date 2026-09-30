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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memorizatest.app.model.ExamConfig
import com.memorizatest.app.model.TestQuestion

private val ResultBlue = Color(0xFF28A9FF)
private val SuccessGreen = Color(0xFF37D6AD)
private val ErrorRed = Color(0xFFFF6B6B)

@Composable
fun ResultScreen(
    questions: List<TestQuestion>,
    answers: List<Int?>,
    onReview: () -> Unit,
    onRepeat: () -> Unit,
    onBackHome: () -> Unit
) {
    val correctAnswers = questions.indices.count { index ->
        answers[index] == questions[index].correctAnswer
    }

    val errors = questions.size - correctAnswers
    val passed = errors <= ExamConfig.MAX_ERRORS

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
                    .widthIn(max = 820.dp)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .verticalScroll(rememberScrollState())
                    .padding(
                        horizontal = if (isTablet) 30.dp else 18.dp,
                        vertical = if (isTablet) 34.dp else 24.dp
                    )
            ) {

                Text(
                    text = "RESULTADO",
                    color = ResultBlue,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Así ha ido tu test",
                    color = Color.White,
                    fontSize = if (isTablet) 30.sp else 26.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(24.dp))

                ResultCard(
                    passed = passed,
                    correctAnswers = correctAnswers,
                    total = questions.size,
                    errors = errors
                )

                Spacer(modifier = Modifier.height(18.dp))

                ResultStats(
                    correct = correctAnswers,
                    errors = errors,
                    total = questions.size
                )

                Spacer(modifier = Modifier.height(24.dp))

                PrimaryAction(
                    text = "Revisar respuestas",
                    onClick = onReview
                )

                Spacer(modifier = Modifier.height(10.dp))

                SecondaryAction(
                    text = "Repetir test",
                    onClick = onRepeat
                )

                Spacer(modifier = Modifier.height(10.dp))

                HomeAction(
                    onClick = onBackHome
                )

                Spacer(modifier = Modifier.height(28.dp))
            }
        }
    }
}

@Composable
private fun ResultCard(
    passed: Boolean,
    correctAnswers: Int,
    total: Int,
    errors: Int
) {
    val accent = if (passed) SuccessGreen else ErrorRed
    val shape = RoundedCornerShape(28.dp)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(
                Brush.verticalGradient(
                    listOf(
                        accent.copy(alpha = 0.14f),
                        Color(0xE613202F)
                    )
                )
            )
            .border(
                1.2.dp,
                accent.copy(alpha = 0.45f),
                shape
            )
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(76.dp)
                .clip(CircleShape)
                .background(accent.copy(alpha = 0.16f))
                .border(
                    1.2.dp,
                    accent.copy(alpha = 0.55f),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (passed) "✓" else "!",
                color = accent,
                fontSize = 38.sp,
                fontWeight = FontWeight.Black
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = if (passed) "APROBADO" else "SUSPENSO",
            color = accent,
            fontSize = 27.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "$correctAnswers de $total correctas",
            color = Color.White,
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "$errors fallos",
            color = Color.White.copy(alpha = 0.55f),
            fontSize = 14.sp
        )
    }
}

@Composable
private fun ResultStats(
    correct: Int,
    errors: Int,
    total: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        StatBox(
            modifier = Modifier.weight(1f),
            value = correct.toString(),
            label = "Aciertos",
            accent = SuccessGreen
        )

        StatBox(
            modifier = Modifier.weight(1f),
            value = errors.toString(),
            label = "Fallos",
            accent = ErrorRed
        )

        StatBox(
            modifier = Modifier.weight(1f),
            value = total.toString(),
            label = "Total",
            accent = ResultBlue
        )
    }
}

@Composable
private fun StatBox(
    modifier: Modifier,
    value: String,
    label: String,
    accent: Color
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White.copy(alpha = 0.045f))
            .border(
                1.dp,
                Color.White.copy(alpha = 0.08f),
                RoundedCornerShape(20.dp)
            )
            .padding(
                vertical = 16.dp,
                horizontal = 8.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            color = accent,
            fontSize = 22.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = label,
            color = Color.White.copy(alpha = 0.46f),
            fontSize = 10.5.sp
        )
    }
}

@Composable
private fun PrimaryAction(
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(
                Brush.horizontalGradient(
                    listOf(
                        ResultBlue,
                        Color(0xFF347AF5)
                    )
                )
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
private fun SecondaryAction(
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.White.copy(alpha = 0.045f))
            .border(
                1.dp,
                Color.White.copy(alpha = 0.10f),
                RoundedCornerShape(18.dp)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun HomeAction(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Volver al inicio",
            color = Color.White.copy(alpha = 0.55f),
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
