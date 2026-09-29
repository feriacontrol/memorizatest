package com.conduceya.app.ui

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
import com.conduceya.app.model.TestQuestion

private val ReviewBlue = Color(0xFF28A9FF)
private val ReviewGreen = Color(0xFF37D6AD)
private val ReviewRed = Color(0xFFFF6B6B)

@Composable
fun ReviewScreen(
    questions: List<TestQuestion>,
    answers: List<Int?>,
    onBack: () -> Unit
) {
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
                    .widthIn(max = 900.dp)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .verticalScroll(rememberScrollState())
                    .padding(
                        horizontal = if (isTablet) 30.dp else 18.dp,
                        vertical = if (isTablet) 28.dp else 20.dp
                    )
            ) {

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(14.dp))
                        .clickable { onBack() }
                        .padding(vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(ReviewBlue.copy(alpha = 0.12f))
                            .border(
                                1.dp,
                                ReviewBlue.copy(alpha = 0.32f),
                                CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "‹",
                            color = Color.White,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.width(9.dp))

                    Text(
                        text = "Resultado",
                        color = Color.White.copy(alpha = 0.78f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "REVISIÓN",
                    color = ReviewBlue,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Revisar respuestas",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Comprueba qué has acertado y entiende cada fallo.",
                    color = Color.White.copy(alpha = 0.54f),
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(22.dp))

                questions.forEachIndexed { index, question ->

                    val selected = answers[index]
                    val isCorrect = selected == question.correctAnswer
                    val accent = if (isCorrect) ReviewGreen else ReviewRed

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(23.dp))
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        accent.copy(alpha = 0.08f),
                                        Color(0xE613202F)
                                    )
                                )
                            )
                            .border(
                                1.dp,
                                accent.copy(alpha = 0.25f),
                                RoundedCornerShape(23.dp)
                            )
                            .padding(18.dp)
                    ) {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(38.dp)
                                    .clip(CircleShape)
                                    .background(accent.copy(alpha = 0.14f))
                                    .border(
                                        1.dp,
                                        accent.copy(alpha = 0.40f),
                                        CircleShape
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = if (isCorrect) "✓" else "✕",
                                    color = accent,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Black
                                )
                            }

                            Spacer(modifier = Modifier.width(11.dp))

                            Column(
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = if (isCorrect) "CORRECTA" else "INCORRECTA",
                                    color = accent,
                                    fontSize = 11.sp,
                                    letterSpacing = 1.1.sp,
                                    fontWeight = FontWeight.Black
                                )

                                Text(
                                    text = "Pregunta ${index + 1}",
                                    color = Color.White.copy(alpha = 0.46f),
                                    fontSize = 10.5.sp
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = question.text,
                            color = Color.White,
                            fontSize = 18.sp,
                            lineHeight = 25.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        AnswerReviewBox(
                            label = "Tu respuesta",
                            text = selected?.let {
                                question.answers[it]
                            } ?: "Sin responder",
                            accent = if (isCorrect) ReviewGreen else ReviewRed
                        )

                        if (!isCorrect) {
                            Spacer(modifier = Modifier.height(10.dp))

                            AnswerReviewBox(
                                label = "Respuesta correcta",
                                text = question.answers[question.correctAnswer],
                                accent = ReviewGreen
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(17.dp))
                                .background(Color.White.copy(alpha = 0.045f))
                                .border(
                                    1.dp,
                                    Color.White.copy(alpha = 0.07f),
                                    RoundedCornerShape(17.dp)
                                )
                                .padding(14.dp)
                        ) {
                            Text(
                                text = "EXPLICACIÓN",
                                color = ReviewBlue,
                                fontSize = 10.sp,
                                letterSpacing = 1.sp,
                                fontWeight = FontWeight.Black
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text(
                                text = question.explanation,
                                color = Color.White.copy(alpha = 0.78f),
                                fontSize = 13.5.sp,
                                lineHeight = 20.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(13.dp))

                        Text(
                            text = question.topic,
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = question.reference,
                            color = Color.White.copy(alpha = 0.30f),
                            fontSize = 10.5.sp,
                            lineHeight = 14.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(13.dp))
                }

                Spacer(modifier = Modifier.height(8.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(
                            Brush.horizontalGradient(
                                listOf(
                                    ReviewBlue,
                                    Color(0xFF347AF5)
                                )
                            )
                        )
                        .clickable { onBack() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Volver al resultado",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black
                    )
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Composable
private fun AnswerReviewBox(
    label: String,
    text: String,
    accent: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(accent.copy(alpha = 0.07f))
            .border(
                1.dp,
                accent.copy(alpha = 0.22f),
                RoundedCornerShape(16.dp)
            )
            .padding(13.dp)
    ) {
        Text(
            text = label.uppercase(),
            color = accent,
            fontSize = 9.5.sp,
            letterSpacing = 0.9.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            lineHeight = 19.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
