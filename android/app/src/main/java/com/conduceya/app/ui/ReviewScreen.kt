package com.conduceya.app.ui

import androidx.compose.foundation.background
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
import com.conduceya.app.model.TestQuestion

private val ReviewBlue = Color(0xFF0969F6)
private val ReviewGreen = Color(0xFF178A52)
private val ReviewRed = Color(0xFFC93C3C)

@Composable
fun ReviewScreen(
    questions: List<TestQuestion>,
    answers: List<Int?>,
    onBack: () -> Unit
) {
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

            TextButton(onClick = onBack) {
                Text(
                    text = "‹ Resultado",
                    color = ReviewBlue
                )
            }

            Text(
                text = "Revisar respuestas",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            questions.forEachIndexed { index, question ->

                val selected = answers[index]
                val isCorrect = selected == question.correctAnswer

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {

                        Text(
                            text =
                                if (isCorrect) "✓ Correcta"
                                else "✕ Incorrecta",
                            fontWeight = FontWeight.Bold,
                            color =
                                if (isCorrect) ReviewGreen
                                else ReviewRed
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "${index + 1}. ${question.text}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            lineHeight = 24.sp
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        Text(
                            text = "Tu respuesta",
                            fontSize = 13.sp,
                            color = Color(0xFF6B7280)
                        )

                        Text(
                            text = selected?.let {
                                question.answers[it]
                            } ?: "Sin responder",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color =
                                if (isCorrect) ReviewGreen
                                else ReviewRed
                        )

                        if (!isCorrect) {

                            Spacer(modifier = Modifier.height(12.dp))

                            Text(
                                text = "Respuesta correcta",
                                fontSize = 13.sp,
                                color = Color(0xFF6B7280)
                            )

                            Text(
                                text = question.answers[question.correctAnswer],
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = ReviewGreen
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    Color(0xFFF3F6FA),
                                    RoundedCornerShape(14.dp)
                                )
                                .padding(14.dp)
                        ) {

                            Text(
                                text = "Explicación",
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp
                            )

                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = question.explanation,
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                color = Color(0xFF4B5563)
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Text(
                            text = "Tema: ${question.topic}",
                            fontSize = 13.sp,
                            color = Color(0xFF6B7280)
                        )

                        Text(
                            text = "Fuente: ${question.reference}",
                            fontSize = 12.sp,
                            color = Color(0xFF9CA3AF)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))
            }

            Button(
                onClick = onBack,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ReviewBlue
                )
            ) {
                Text(
                    text = "Volver al resultado",
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
