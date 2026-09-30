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
import com.memorizatest.app.data.ExamHistoryStore
import java.util.Locale

private val StatsBlue = Color(0xFF28A9FF)
private val StatsGreen = Color(0xFF37D6AD)
private val StatsRed = Color(0xFFFF6B6B)
private val StatsPurple = Color(0xFF9B72FF)

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
            "Objetivo de examen alcanzado"

        stats.averageErrors <= 4.0 ->
            "Estás cerca del objetivo"

        else ->
            "Sigue practicando"
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
                            .background(StatsBlue.copy(alpha = 0.12f))
                            .border(
                                1.dp,
                                StatsBlue.copy(alpha = 0.32f),
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
                    text = "ESTADÍSTICAS",
                    color = StatsPurple,
                    fontSize = 11.sp,
                    letterSpacing = 1.5.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Tu evolución",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Comprueba cómo progresas en los simulacros completos.",
                    color = Color.White.copy(alpha = 0.54f),
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(22.dp))

                PreparationCard(
                    text = preparationText,
                    totalTests = stats.totalTests
                )

                Spacer(modifier = Modifier.height(16.dp))

                if (isTablet) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Simulacros",
                            value = stats.totalTests.toString(),
                            accent = StatsBlue
                        )

                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Aprobados",
                            value = stats.passedTests.toString(),
                            accent = StatsGreen
                        )

                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Suspendidos",
                            value = stats.failedTests.toString(),
                            accent = StatsRed
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Media fallos",
                            value = if (stats.totalTests == 0) {
                                "—"
                            } else {
                                String.format(
                                    Locale.getDefault(),
                                    "%.1f",
                                    stats.averageErrors
                                )
                            },
                            accent = StatsPurple
                        )

                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Aprobados",
                            value = if (stats.totalTests == 0) {
                                "—"
                            } else {
                                "${stats.passRate}%"
                            },
                            accent = StatsGreen
                        )
                    }
                } else {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Simulacros",
                            value = stats.totalTests.toString(),
                            accent = StatsBlue
                        )

                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Aprobados",
                            value = stats.passedTests.toString(),
                            accent = StatsGreen
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Suspendidos",
                            value = stats.failedTests.toString(),
                            accent = StatsRed
                        )

                        StatCard(
                            modifier = Modifier.weight(1f),
                            title = "Media fallos",
                            value = if (stats.totalTests == 0) {
                                "—"
                            } else {
                                String.format(
                                    Locale.getDefault(),
                                    "%.1f",
                                    stats.averageErrors
                                )
                            },
                            accent = StatsPurple
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    StatCard(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Tests aprobados",
                        value = if (stats.totalTests == 0) {
                            "—"
                        } else {
                            "${stats.passRate}%"
                        },
                        accent = StatsGreen
                    )
                }

                if (stats.recentErrors.isNotEmpty()) {

                    Spacer(modifier = Modifier.height(26.dp))

                    Text(
                        text = "Últimos simulacros",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Tu rendimiento más reciente",
                        color = Color.White.copy(alpha = 0.42f),
                        fontSize = 11.5.sp
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    stats.recentErrors
                        .take(10)
                        .forEachIndexed { index, errors ->

                            val passed = errors <= 3
                            val accent =
                                if (passed) StatsGreen else StatsRed

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(18.dp))
                                    .background(Color.White.copy(alpha = 0.045f))
                                    .border(
                                        1.dp,
                                        Color.White.copy(alpha = 0.08f),
                                        RoundedCornerShape(18.dp)
                                    )
                                    .padding(15.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(38.dp)
                                        .clip(CircleShape)
                                        .background(accent.copy(alpha = 0.12f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = if (passed) "✓" else "✕",
                                        color = accent,
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Black
                                    )
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Text(
                                    text = "Simulacro ${index + 1}",
                                    modifier = Modifier.weight(1f),
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )

                                Text(
                                    text = "$errors fallos",
                                    color = accent,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Black
                                )
                            }

                            Spacer(modifier = Modifier.height(9.dp))
                        }
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Composable
private fun PreparationCard(
    text: String,
    totalTests: Int
) {
    val accent =
        if (totalTests == 0) StatsBlue else StatsPurple

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(
                Brush.horizontalGradient(
                    listOf(
                        accent.copy(alpha = 0.15f),
                        Color(0xE613202F)
                    )
                )
            )
            .border(
                1.dp,
                accent.copy(alpha = 0.30f),
                RoundedCornerShape(24.dp)
            )
            .padding(20.dp)
    ) {
        Text(
            text = "NIVEL DE PREPARACIÓN",
            color = accent,
            fontSize = 10.sp,
            letterSpacing = 1.1.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(7.dp))

        Text(
            text = text,
            color = Color.White,
            fontSize = 20.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
private fun StatCard(
    modifier: Modifier,
    title: String,
    value: String,
    accent: Color
) {
    Column(
        modifier = modifier
            .heightIn(min = 94.dp)
            .clip(RoundedCornerShape(19.dp))
            .background(Color.White.copy(alpha = 0.045f))
            .border(
                1.dp,
                Color.White.copy(alpha = 0.08f),
                RoundedCornerShape(19.dp)
            )
            .padding(14.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = value,
            color = accent,
            fontSize = 22.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,
            color = Color.White.copy(alpha = 0.46f),
            fontSize = 10.5.sp
        )
    }
}
