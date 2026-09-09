package com.conduceya.app.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val TestBlue = Color(0xFF0969F6)

private data class TestQuestion(
    val text: String,
    val answers: List<String>
)

private val sampleQuestions = listOf(
    TestQuestion(
        text = "¿Qué debe hacer un conductor cuando el semáforo está en rojo?",
        answers = listOf(
            "Detenerse antes de la línea de detención.",
            "Continuar si no viene ningún vehículo.",
            "Reducir la velocidad sin detenerse."
        )
    ),
    TestQuestion(
        text = "¿Qué indica una señal triangular con borde rojo?",
        answers = listOf(
            "Una obligación.",
            "Una advertencia de peligro.",
            "Una prohibición."
        )
    ),
    TestQuestion(
        text = "Antes de realizar un adelantamiento, ¿qué debe comprobar el conductor?",
        answers = listOf(
            "Que puede hacerlo sin peligro.",
            "Que circula a velocidad máxima.",
            "Que el vehículo de delante frena."
        )
    )
)

@Composable
fun TestScreen(
    onBack: () -> Unit
) {
    var questionIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<Int?>(null) }

    val question = sampleQuestions[questionIndex]

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
                    text = "‹ Volver",
                    color = TestBlue
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Test de examen",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Pregunta ${questionIndex + 1} de 30",
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
                        .fillMaxWidth((questionIndex + 1) / 30f)
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
                lineHeight = 30.sp,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(28.dp))

            question.answers.forEachIndexed { index, answer ->

                AnswerButton(
                    letter = listOf("A", "B", "C")[index],
                    text = answer,
                    selected = selectedAnswer == index,
                    onClick = {
                        selectedAnswer = index
                    }
                )

                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if (questionIndex < sampleQuestions.lastIndex) {
                        questionIndex++
                        selectedAnswer = null
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
                    text = if (questionIndex < sampleQuestions.lastIndex)
                        "Siguiente"
                    else
                        "Finalizar prueba",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            TextButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Salir del test",
                    color = Color(0xFF6B7280)
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
            .height(76.dp),
        shape = RoundedCornerShape(18.dp),
        border = BorderStroke(
            width = if (selected) 2.dp else 1.dp,
            color = if (selected) TestBlue else Color(0xFFD1D5DB)
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
            text = if (selected)
                "✓  $letter   $text"
            else
                "$letter   $text",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 15.sp,
            fontWeight = if (selected)
                FontWeight.Bold
            else
                FontWeight.Normal
        )
    }
}
