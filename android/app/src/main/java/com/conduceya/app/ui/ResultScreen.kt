package com.conduceya.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.conduceya.app.model.TestQuestion
import com.conduceya.app.model.ExamConfig

private val ResultBlue = Color(0xFF0969F6)
private val SuccessGreen = Color(0xFF178A52)
private val ErrorRed = Color(0xFFC93C3C)

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
        color = Color(0xFFF7F8FA)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 42.dp)
        ) {

            Text(
                text = "Resultado",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(28.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor =
                        if (passed) Color(0xFFEAF8F0)
                        else Color(0xFFFFEEEE)
                )
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {

                    Text(
                        text = if (passed) "APROBADO" else "SUSPENSO",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (passed) SuccessGreen else ErrorRed
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "$correctAnswers de ${questions.size} correctas",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "$errors fallos",
                        fontSize = 16.sp,
                        color = Color(0xFF6B7280)
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            Button(
                onClick = onReview,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ResultBlue
                )
            ) {
                Text(
                    text = "Revisar respuestas",
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedButton(
                onClick = onRepeat,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Repetir test",
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            TextButton(
                onClick = onBackHome,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Volver al inicio",
                    color = Color(0xFF6B7280)
                )
            }
        }
    }
}
