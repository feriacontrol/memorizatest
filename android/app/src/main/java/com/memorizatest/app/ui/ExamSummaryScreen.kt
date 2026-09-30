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

private val SummaryBlue = Color(0xFF28A9FF)
private val AnsweredGreen = Color(0xFF37D6AD)
private val PendingOrange = Color(0xFFFFB14A)

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
                        .clickable { onBackToExam() }
                        .padding(vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(SummaryBlue.copy(alpha = 0.12f))
                            .border(
                                1.dp,
                                SummaryBlue.copy(alpha = 0.32f),
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
                        text = "Volver al examen",
                        color = Color.White.copy(alpha = 0.78f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "REVISIÓN FINAL",
                    color = SummaryBlue,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Revisar antes de entregar",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "$answered respondidas · $pending sin responder",
                    color = Color.White.copy(alpha = 0.54f),
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    SummaryStat(
                        modifier = Modifier.weight(1f),
                        value = answered.toString(),
                        label = "Respondidas",
                        accent = AnsweredGreen
                    )

                    SummaryStat(
                        modifier = Modifier.weight(1f),
                        value = pending.toString(),
                        label = "Pendientes",
                        accent = PendingOrange
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                answers.forEachIndexed { index, answer ->

                    val isAnswered = answer != null
                    val accent =
                        if (isAnswered) AnsweredGreen else PendingOrange

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(18.dp))
                            .background(
                                Brush.horizontalGradient(
                                    listOf(
                                        Color(0xE6172435),
                                        Color(0xE6101927)
                                    )
                                )
                            )
                            .border(
                                1.dp,
                                Color.White.copy(alpha = 0.08f),
                                RoundedCornerShape(18.dp)
                            )
                            .clickable {
                                onGoToQuestion(index)
                            }
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(accent.copy(alpha = 0.12f))
                                .border(
                                    1.dp,
                                    accent.copy(alpha = 0.28f),
                                    CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${index + 1}",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Black
                            )
                        }

                        Spacer(modifier = Modifier.width(13.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "Pregunta ${index + 1}",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(3.dp))

                            Text(
                                text = if (isAnswered) {
                                    "Respondida"
                                } else {
                                    "Sin responder"
                                },
                                color = accent,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Text(
                            text = "›",
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.height(9.dp))
                }

                Spacer(modifier = Modifier.height(18.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(58.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(
                            Brush.horizontalGradient(
                                listOf(
                                    SummaryBlue,
                                    Color(0xFF347AF5)
                                )
                            )
                        )
                        .clickable { onSubmit() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Entregar test",
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
private fun SummaryStat(
    modifier: Modifier,
    value: String,
    label: String,
    accent: Color
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(19.dp))
            .background(accent.copy(alpha = 0.07f))
            .border(
                1.dp,
                accent.copy(alpha = 0.20f),
                RoundedCornerShape(19.dp)
            )
            .padding(
                vertical = 16.dp,
                horizontal = 12.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            color = accent,
            fontSize = 22.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(3.dp))

        Text(
            text = label,
            color = Color.White.copy(alpha = 0.46f),
            fontSize = 10.5.sp
        )
    }
}
