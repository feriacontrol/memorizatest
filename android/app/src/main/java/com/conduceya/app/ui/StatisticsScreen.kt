package com.conduceya.app.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.conduceya.app.data.ExamHistoryStore
import java.util.Locale

private val StatsBlue = Color(0xFF0969F6)
private val StatsGreen = Color(0xFF178A52)
private val StatsRed = Color(0xFFC93C3C)

@Composable
fun StatisticsScreen(
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val stats = ExamHistoryStore.getStats(context)

    val preparationText = when {
        stats.totalTests == 0 ->
            "Haz tu primer simulacro"

        stats.totalTests < 3 ->
            "Necesitamos al menos 3 simulacros"

        stats.recentErrors
            .take(5)
            .isNotEmpty() &&
            stats.recentErrors
                .take(5)
                .all { it <= 3 } ->
            "Objetivo de examen alcanzado en tus últimas prácticas"

        stats.averageErrors <= 4.0 ->
            "Estás cerca del objetivo"

        else ->
            "Sigue practicando"
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
                    color = StatsBlue
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Estadísticas",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111827)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Tu evolución en simulacros completos.",
                fontSize = 15.sp,
                color = Color(0xFF6B7280)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEAF2FF)
                )
            ) {
                Column(
                    modifier = Modifier.padding(22.dp)
                ) {
                    Text(
                        text = "Nivel de preparación",
                        fontSize = 14.sp,
                        color = Color(0xFF4B5563)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = preparationText,
                        fontSize = 21.sp,
                        lineHeight = 27.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF111827)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            StatCard(
                title = "Simulacros realizados",
                value = stats.totalTests.toString()
            )

            Spacer(modifier = Modifier.height(10.dp))

            StatCard(
                title = "Aprobados",
                value = stats.passedTests.toString(),
                valueColor = StatsGreen
            )

            Spacer(modifier = Modifier.height(10.dp))

            StatCard(
                title = "Suspendidos",
                value = stats.failedTests.toString(),
                valueColor = StatsRed
            )

            Spacer(modifier = Modifier.height(10.dp))

            StatCard(
                title = "Media de fallos",
                value = if (stats.totalTests == 0) {
                    "—"
                } else {
                    String.format(
                        Locale.getDefault(),
                        "%.1f",
                        stats.averageErrors
                    )
                }
            )

            Spacer(modifier = Modifier.height(10.dp))

            StatCard(
                title = "Tests aprobados",
                value = if (stats.totalTests == 0) {
                    "—"
                } else {
                    "${stats.passRate}%"
                }
            )

            if (stats.recentErrors.isNotEmpty()) {

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Últimos simulacros",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF111827)
                )

                Spacer(modifier = Modifier.height(12.dp))

                stats.recentErrors
                    .take(10)
                    .forEachIndexed { index, errors ->

                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(17.dp),
                                horizontalArrangement =
                                    Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Simulacro ${index + 1}",
                                    fontWeight = FontWeight.Bold
                                )

                                Text(
                                    text = if (errors <= 3) {
                                        "✓ $errors fallos"
                                    } else {
                                        "✕ $errors fallos"
                                    },
                                    fontWeight = FontWeight.Bold,
                                    color = if (errors <= 3) {
                                        StatsGreen
                                    } else {
                                        StatsRed
                                    }
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(9.dp))
                    }
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
private fun StatCard(
    title: String,
    value: String,
    valueColor: Color = Color(0xFF111827)
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            horizontalArrangement =
                Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                fontSize = 15.sp,
                color = Color(0xFF6B7280)
            )

            Text(
                text = value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = valueColor
            )
        }
    }
}
