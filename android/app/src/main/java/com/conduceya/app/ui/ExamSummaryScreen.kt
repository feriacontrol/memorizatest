package com.conduceya.app.ui

import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val SummaryBlue = Color(0xFF0969F6)
private val AnsweredGreen = Color(0xFF178A52)
private val PendingOrange = Color(0xFFB76A00)

@Composable
fun ExamSummaryScreen(
    answers: List<Int?>,
    onBackToExam: () -> Unit,
    onGoToQuestion: (Int) -> Unit,
    onSubmit: () -> Unit
) {
    val answered = answers.count { it != null }
    val pending = answers.size - answered

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
            TextButton(
                onClick = onBackToExam
            ) {
                Text(
                    text = "‹ Volver al examen",
                    color = SummaryBlue
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Revisar antes de entregar",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "$answered respondidas · $pending sin responder",
                fontSize = 16.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(24.dp))

            answers.forEachIndexed { index, answer ->

                val isAnswered = answer != null

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onGoToQuestion(index)
                        },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(17.dp)
                    ) {
                        Text(
                            text = "Pregunta ${index + 1}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF111827)
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = if (isAnswered) {
                                "✓ Respondida"
                            } else {
                                "● Sin responder"
                            },
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = if (isAnswered) {
                                AnsweredGreen
                            } else {
                                PendingOrange
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(9.dp))
            }

            Spacer(modifier = Modifier.height(18.dp))

            Button(
                onClick = onSubmit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = SummaryBlue
                )
            ) {
                Text(
                    text = "Entregar test",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
