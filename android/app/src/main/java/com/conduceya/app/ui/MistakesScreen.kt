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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.conduceya.app.data.MistakesStore
import com.conduceya.app.data.QuestionBank

private val MistakesBlue = Color(0xFF0969F6)
private val MistakesRed = Color(0xFFC93C3C)

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
                    color = MistakesBlue
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Mis fallos",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(7.dp))

            Text(
                text = if (questionsWithMistakes.isEmpty()) {
                    "Todavía no tienes errores guardados."
                } else {
                    "${questionsWithMistakes.size} preguntas necesitan repaso"
                },
                fontSize = 15.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(24.dp))

            if (questionsWithMistakes.isEmpty()) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(22.dp)
                    ) {
                        Text(
                            text = "Aquí aparecerán tus errores",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Cuando termines un test guardaremos automáticamente las preguntas que hayas fallado.",
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            color = Color(0xFF6B7280)
                        )
                    }
                }
            } else {
                Button(
                    onClick = {
                        onPracticeMistakes(
                            questionsWithMistakes
                                .map { it.id }
                                .toSet()
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MistakesBlue
                    )
                ) {
                    Text(
                        text = "Practicar mis fallos",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(22.dp))

                questionsWithMistakes.forEach { question ->
                    val count = mistakeCounts[question.id] ?: 0

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp)
                        ) {
                            Text(
                                text = question.topic,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = MistakesBlue
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text(
                                text = question.text,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                lineHeight = 22.sp,
                                color = Color(0xFF111827)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = if (count == 1) {
                                    "Fallada 1 vez"
                                } else {
                                    "Fallada $count veces"
                                },
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MistakesRed
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
