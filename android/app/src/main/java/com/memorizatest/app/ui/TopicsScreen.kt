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
import com.memorizatest.app.data.QuestionBank

private val TopicsBlue = Color(0xFF28A9FF)
private val TopicPanel = Color(0xE6172435)
private val TopicPanel2 = Color(0xE6101927)

private val topicOrder = listOf(
    "Señales",
    "Semáforos",
    "Prioridades",
    "Velocidades",
    "Adelantamientos",
    "Estacionamiento",
    "Alumbrado",
    "Seguridad",
    "Conducción segura",
    "Alcohol y drogas",
    "Documentación",
    "Usuarios vulnerables"
)

@Composable
fun TopicsScreen(
    onBack: () -> Unit,
    onSelectTopic: (String) -> Unit
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
                        vertical = if (isTablet) 30.dp else 20.dp
                    )
            ) {

                BackButton(onBack)

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "TESTS POR TEMAS",
                    color = TopicsBlue,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Elige qué quieres practicar",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Trabaja un bloque concreto y céntrate en lo que más necesitas mejorar.",
                    color = Color.White.copy(alpha = 0.58f),
                    fontSize = 13.sp,
                    lineHeight = 18.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                topicOrder.forEach { topic ->

                    val count = QuestionBank.questions.count {
                        it.topic == topic
                    }

                    val available = count > 0

                    TopicCard(
                        topic = topic,
                        count = count,
                        available = available,
                        onClick = {
                            if (available) {
                                onSelectTopic(topic)
                            }
                        }
                    )

                    Spacer(modifier = Modifier.height(11.dp))
                }

                Spacer(modifier = Modifier.height(26.dp))
            }
        }
    }
}

@Composable
private fun BackButton(
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(14.dp))
            .clickable { onBack() }
            .padding(
                horizontal = 4.dp,
                vertical = 6.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(CircleShape)
                .background(TopicsBlue.copy(alpha = 0.13f))
                .border(
                    1.dp,
                    TopicsBlue.copy(alpha = 0.35f),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "‹",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.width(9.dp))

        Text(
            text = "Inicio",
            color = Color.White.copy(alpha = 0.80f),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun TopicCard(
    topic: String,
    count: Int,
    available: Boolean,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(21.dp)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(92.dp)
            .clip(shape)
            .background(
                Brush.horizontalGradient(
                    listOf(
                        if (available) TopicPanel else Color(0xAA121923),
                        if (available) TopicPanel2 else Color(0xAA0D131C)
                    )
                )
            )
            .border(
                1.dp,
                if (available) {
                    Color.White.copy(alpha = 0.08f)
                } else {
                    Color.White.copy(alpha = 0.04f)
                },
                shape
            )
            .clickable(
                enabled = available
            ) {
                onClick()
            }
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    if (available) {
                        TopicsBlue.copy(alpha = 0.12f)
                    } else {
                        Color.White.copy(alpha = 0.04f)
                    }
                )
                .border(
                    1.dp,
                    if (available) {
                        TopicsBlue.copy(alpha = 0.28f)
                    } else {
                        Color.White.copy(alpha = 0.06f)
                    },
                    RoundedCornerShape(15.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = topic.take(1).uppercase(),
                color = if (available) {
                    TopicsBlue
                } else {
                    Color.White.copy(alpha = 0.25f)
                },
                fontSize = 18.sp,
                fontWeight = FontWeight.Black
            )
        }

        Spacer(modifier = Modifier.width(14.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = topic,
                color = if (available) {
                    Color.White
                } else {
                    Color.White.copy(alpha = 0.35f)
                },
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = if (available) {
                    "Practicar este tema"
                } else {
                    "Próximamente"
                },
                color = if (available) {
                    Color.White.copy(alpha = 0.50f)
                } else {
                    Color.White.copy(alpha = 0.22f)
                },
                fontSize = 11.5.sp
            )
        }

        if (available) {
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "$count",
                    color = TopicsBlue,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    text = "preguntas",
                    color = Color.White.copy(alpha = 0.40f),
                    fontSize = 9.5.sp
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(TopicsBlue.copy(alpha = 0.12f))
                    .border(
                        1.dp,
                        TopicsBlue.copy(alpha = 0.30f),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "›",
                    color = Color.White,
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
