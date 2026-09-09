package com.conduceya.app.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val TestBlue = Color(0xFF0969F6)
private val SuccessGreen = Color(0xFF178A52)
private val ErrorRed = Color(0xFFC93C3C)

private data class TestQuestion(
    val text: String,
    val answers: List<String>,
    val correctAnswer: Int,
    val explanation: String,
    val topic: String,
    val reference: String
)

private val sampleQuestions = listOf(
    TestQuestion(
        text = "¿Qué debe hacer un conductor cuando el semáforo está en rojo?",
        answers = listOf(
            "Detenerse antes de la línea de detención.",
            "Continuar si no viene ningún vehículo.",
            "Reducir la velocidad sin detenerse."
        ),
        correctAnswer = 0,
        explanation = "La luz roja no intermitente prohíbe el paso. El vehículo debe detenerse antes de la línea de detención.",
        topic = "Semáforos",
        reference = "Reglamento General de Circulación"
    ),
    TestQuestion(
        text = "¿Qué indica, con carácter general, una señal triangular con borde rojo?",
        answers = listOf(
            "Una obligación.",
            "Una advertencia de peligro.",
            "Una zona de estacionamiento."
        ),
        correctAnswer = 1,
        explanation = "Las señales triangulares con borde rojo advierten de la proximidad de un peligro.",
        topic = "Señales",
        reference = "Reglamento General de Circulación"
    ),
    TestQuestion(
        text = "Antes de realizar un adelantamiento, ¿qué debe comprobar el conductor?",
        answers = listOf(
            "Que puede hacerlo sin peligro.",
            "Que circula a la velocidad máxima permitida.",
            "Que el vehículo de delante está frenando."
        ),
        correctAnswer = 0,
        explanation = "Antes de adelantar hay que comprobar que existe espacio suficiente y que la maniobra puede realizarse sin peligro.",
        topic = "Adelantamientos",
        reference = "Reglamento General de Circulación"
    ),
    TestQuestion(
        text = "¿Es obligatorio utilizar el cinturón de seguridad cuando el vehículo dispone de él?",
        answers = listOf(
            "Solo en carretera.",
            "Sí, con las excepciones previstas legalmente.",
            "Solo para el conductor."
        ),
        correctAnswer = 1,
        explanation = "El cinturón debe utilizarse tanto en vías urbanas como interurbanas, salvo las excepciones previstas legalmente.",
        topic = "Seguridad",
        reference = "Reglamento General de Circulación"
    ),
    TestQuestion(
        text = "Si un conductor está cansado, ¿qué es lo más adecuado?",
        answers = listOf(
            "Aumentar la velocidad para llegar antes.",
            "Abrir la ventanilla y continuar.",
            "Detenerse en un lugar seguro y descansar."
        ),
        correctAnswer = 2,
        explanation = "La fatiga reduce la atención y aumenta el tiempo de reacción. Lo adecuado es detenerse en un lugar seguro y descansar.",
        topic = "Conducción segura",
        reference = "Contenido formativo de seguridad vial"
    )
)

@Composable
fun TestScreen(
    onBack: () -> Unit
) {
    var questionIndex by remember { mutableIntStateOf(0) }
    var finished by remember { mutableStateOf(false) }
    var reviewing by remember { mutableStateOf(false) }

    val answers = remember {
        mutableStateListOf<Int?>().apply {
            repeat(sampleQuestions.size) {
                add(null)
            }
        }
    }

    if (reviewing) {
        ReviewScreen(
            answers = answers,
            onBack = {
                reviewing = false
            }
        )
        return
    }

    if (finished) {
        ResultScreen(
            answers = answers,
            onReview = {
                reviewing = true
            },
            onRepeat = {
                for (i in answers.indices) {
                    answers[i] = null
                }

                questionIndex = 0
                finished = false
            },
            onBackHome = onBack
        )
        return
    }

    val question = sampleQuestions[questionIndex]
    val selectedAnswer = answers[questionIndex]

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
                onClick = onBack
            ) {
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
                text = "Pregunta ${questionIndex + 1} de ${sampleQuestions.size}",
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
                        .fillMaxWidth(
                            (questionIndex + 1).toFloat() /
                                sampleQuestions.size.toFloat()
                        )
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
                        answers[questionIndex] = index
                    }
                )

                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if (questionIndex < sampleQuestions.lastIndex) {
                        questionIndex++
                    } else {
                        finished = true
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
                    text = if (questionIndex < sampleQuestions.lastIndex) {
                        "Siguiente"
                    } else {
                        "Finalizar test"
                    },
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
private fun ResultScreen(
    answers: List<Int?>,
    onReview: () -> Unit,
    onRepeat: () -> Unit,
    onBackHome: () -> Unit
) {
    val correctAnswers = sampleQuestions.indices.count { index ->
        answers[index] == sampleQuestions[index].correctAnswer
    }

    val errors = sampleQuestions.size - correctAnswers

    val passed = if (sampleQuestions.size == 30) {
        errors <= 3
    } else {
        correctAnswers.toFloat() / sampleQuestions.size >= 0.9f
    }

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
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
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
                        color =
                            if (passed) SuccessGreen
                            else ErrorRed
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "$correctAnswers de ${sampleQuestions.size} correctas",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF111827)
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
                    containerColor = TestBlue
                )
            ) {
                Text(
                    text = "Revisar respuestas",
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
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

            Spacer(modifier = Modifier.height(10.dp))

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

@Composable
private fun ReviewScreen(
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

            TextButton(
                onClick = onBack
            ) {
                Text(
                    text = "‹ Resultado",
                    color = TestBlue
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Revisar respuestas",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Comprueba tus respuestas y aprende de los errores.",
                fontSize = 15.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(24.dp))

            sampleQuestions.forEachIndexed { index, question ->

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
                            text = if (isCorrect) {
                                "✓ Correcta"
                            } else {
                                "✕ Incorrecta"
                            },
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color =
                                if (isCorrect) SuccessGreen
                                else ErrorRed
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "${index + 1}. ${question.text}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            lineHeight = 24.sp,
                            color = Color(0xFF111827)
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
                                if (isCorrect) SuccessGreen
                                else ErrorRed
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
                                color = SuccessGreen
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFF3F6FA),
                                    shape = RoundedCornerShape(14.dp)
                                )
                                .padding(14.dp)
                        ) {
                            Column {

                                Text(
                                    text = "Explicación",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF374151)
                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = question.explanation,
                                    fontSize = 14.sp,
                                    lineHeight = 20.sp,
                                    color = Color(0xFF4B5563)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Text(
                            text = "Tema: ${question.topic}",
                            fontSize = 13.sp,
                            color = Color(0xFF6B7280)
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "Fuente: ${question.reference}",
                            fontSize = 12.sp,
                            color = Color(0xFF9CA3AF)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = onBack,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = TestBlue
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
            .heightIn(min = 76.dp),
        shape = RoundedCornerShape(18.dp),
        border = BorderStroke(
            width = if (selected) 2.dp else 1.dp,
            color =
                if (selected) TestBlue
                else Color(0xFFD1D5DB)
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
            text = if (selected) {
                "✓  $letter   $text"
            } else {
                "$letter   $text"
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            fontSize = 15.sp,
            lineHeight = 21.sp,
            fontWeight =
                if (selected) FontWeight.Bold
                else FontWeight.Normal
        )
    }
}
