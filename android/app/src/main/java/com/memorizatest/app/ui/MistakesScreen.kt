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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memorizatest.app.data.MistakesStore
import com.memorizatest.app.data.QuestionBank

private val MistakesBlue = Color(0xFF28A9FF)
private val MistakesRed = Color(0xFFFF6B6B)

@Composable
fun MistakesScreen(
    onBack: () -> Unit,
    onPracticeMistakes: (Set<Int>) -> Unit
) {
    val context = LocalContext.current
    val mistakeCounts = MistakesStore.getMistakeCounts(context)

    val questionsWithMistakes = QuestionBank.questions
        .filter {
            it.active && mistakeCounts.containsKey(it.id)
        }
        .sortedByDescending {
            mistakeCounts[it.id] ?: 0
        }

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
                            .background(MistakesBlue.copy(alpha = 0.12f))
                            .border(
                                1.dp,
                                MistakesBlue.copy(alpha = 0.32f),
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
                        text = "Inicio",
                        color = Color.White.copy(alpha = 0.78f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "MIS FALLOS",
                    color = MistakesRed,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Repasa lo que más te cuesta",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = if (questionsWithMistakes.isEmpty()) {
                        "Todavía no tienes errores guardados."
                    } else {
                        "${questionsWithMistakes.size} preguntas necesitan repaso"
                    },
                    color = Color.White.copy(alpha = 0.54f),
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(22.dp))

                if (questionsWithMistakes.isEmpty()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(23.dp))
                            .background(Color.White.copy(alpha = 0.045f))
                            .border(
                                1.dp,
                                Color.White.copy(alpha = 0.08f),
                                RoundedCornerShape(23.dp)
                            )
                            .padding(20.dp)
                    ) {
                        Text(
                            text = "Aquí aparecerán tus errores",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Cuando termines un test guardaremos automáticamente las preguntas que hayas fallado.",
                            color = Color.White.copy(alpha = 0.52f),
                            fontSize = 13.sp,
                            lineHeight = 19.sp
                        )
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(58.dp)
                            .clip(RoundedCornerShape(18.dp))
                            .background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MistakesBlue,
                                        Color(0xFF347AF5)
                                    )
                                )
                            )
                            .clickable {
                                onPracticeMistakes(
                                    questionsWithMistakes
                                        .map { it.id }
                                        .toSet()
                                )
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Practicar mis fallos",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Black
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    questionsWithMistakes.forEach { question ->
                        val count = mistakeCounts[question.id] ?: 0

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(21.dp))
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
                                    RoundedCornerShape(21.dp)
                                )
                                .padding(16.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = question.topic.uppercase(),
                                    color = MistakesBlue,
                                    fontSize = 10.sp,
                                    letterSpacing = 0.9.sp,
                                    fontWeight = FontWeight.Black,
                                    modifier = Modifier.weight(1f)
                                )

                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(MistakesRed.copy(alpha = 0.12f))
                                        .border(
                                            1.dp,
                                            MistakesRed.copy(alpha = 0.30f),
                                            RoundedCornerShape(12.dp)
                                        )
                                        .padding(
                                            horizontal = 10.dp,
                                            vertical = 5.dp
                                        )
                                ) {
                                    Text(
                                        text = if (count == 1) {
                                            "1 fallo"
                                        } else {
                                            "$count fallos"
                                        },
                                        color = MistakesRed,
                                        fontSize = 10.5.sp,
                                        fontWeight = FontWeight.Black
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = question.text,
                                color = Color.White,
                                fontSize = 15.sp,
                                lineHeight = 21.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Spacer(modifier = Modifier.height(11.dp))
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}
