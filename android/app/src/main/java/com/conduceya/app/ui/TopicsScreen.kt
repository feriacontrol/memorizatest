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
import com.conduceya.app.data.QuestionBank

private val TopicsBlue = Color(0xFF0969F6)

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
                    text = "‹ Inicio",
                    color = TopicsBlue
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Tests por temas",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Practica exactamente lo que necesitas mejorar.",
                fontSize = 15.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(24.dp))

            topicOrder.forEach { topic ->

                val count = QuestionBank.questions.count {
                    it.topic == topic
                }

                val available = count > 0

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(
                            enabled = available
                        ) {
                            onSelectTopic(topic)
                        },
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor =
                            if (available) {
                                Color.White
                            } else {
                                Color(0xFFF0F1F3)
                            }
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {
                        Text(
                            text = topic,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color =
                                if (available) {
                                    Color(0xFF111827)
                                } else {
                                    Color(0xFF9CA3AF)
                                }
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text =
                                if (available) {
                                    "$count ${if (count == 1) "pregunta disponible" else "preguntas disponibles"}"
                                } else {
                                    "Añadiremos preguntas próximamente"
                                },
                            fontSize = 13.sp,
                            color =
                                if (available) {
                                    TopicsBlue
                                } else {
                                    Color(0xFF9CA3AF)
                                }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}
