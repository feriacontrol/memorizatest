package com.memorizatest.app.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memorizatest.app.R

private val BrandBlue = Color(0xFF28A9FF)
private val ExamGreen = Color(0xFF36D4AD)
private val TopicsBlue = Color(0xFF398EFF)
private val MistakesOrange = Color(0xFFFFAD42)
private val StatsPurple = Color(0xFF9B72FF)

private val PanelDark = Color(0xE6172435)
private val PanelDark2 = Color(0xE6101927)

@Composable
fun HomeScreen(
    onStartTest: () -> Unit,
    onOpenTopics: () -> Unit,
    onOpenMistakes: () -> Unit,
    onOpenStatistics: () -> Unit,
    onRemoveAds: () -> Unit
) {
    val uriHandler = LocalUriHandler.current
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(R.drawable.bg_home_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xAA06101B),
                            Color(0xC20A1420),
                            Color(0xF0060D16)
                        )
                    )
                )
        )

        BoxWithConstraints(
            modifier = Modifier.fillMaxSize()
        ) {
            val isTablet = maxWidth >= 700.dp
            val contentWidth = if (isTablet) 920.dp else maxWidth
            val horizontalPadding = if (isTablet) 30.dp else 18.dp

            Column(
                modifier = Modifier
                    .widthIn(max = contentWidth)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .verticalScroll(rememberScrollState())
                    .padding(
                        horizontal = horizontalPadding,
                        vertical = if (isTablet) 32.dp else 20.dp
                    )
            ) {

                HeaderWithPermitMenu(isTablet, onRemoveAds)

                Spacer(
                    modifier = Modifier.height(
                        if (isTablet) 28.dp else 20.dp
                    )
                )

                Text(
                    text = "PREPÁRATE PARA APROBAR",
                    color = BrandBlue,
                    fontSize = 11.sp,
                    letterSpacing = 1.6.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "¿Qué quieres hacer hoy?",
                    color = Color.White,
                    fontSize = if (isTablet) 29.sp else 25.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Practica, revisa tus fallos y comprueba tu progreso.",
                    color = Color.White.copy(alpha = 0.64f),
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(22.dp))

                StartExamButton(
                    isTablet = isTablet,
                    onClick = onStartTest
                )

                Spacer(modifier = Modifier.height(24.dp))

                SectionTitle(
                    title = "Practicar y mejorar",
                    subtitle = "Elige cómo quieres entrenar"
                )

                Spacer(modifier = Modifier.height(13.dp))

                if (isTablet) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        HomeTile(
                            modifier = Modifier.weight(1f),
                            title = "Tests por temas",
                            subtitle = "Practica exactamente lo que necesitas.",
                            iconRes = R.drawable.icon_topics,
                            accent = TopicsBlue,
                            onClick = onOpenTopics
                        )

                        HomeTile(
                            modifier = Modifier.weight(1f),
                            title = "Mis fallos",
                            subtitle = "Vuelve a intentar las preguntas falladas.",
                            iconRes = R.drawable.icon_mistakes,
                            accent = MistakesOrange,
                            onClick = onOpenMistakes
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        HomeTile(
                            modifier = Modifier.weight(1f),
                            title = "Estadísticas",
                            subtitle = "Comprueba cómo estás evolucionando.",
                            iconRes = R.drawable.icon_stats,
                            accent = StatsPurple,
                            onClick = onOpenStatistics
                        )

                        HomeTile(
                            modifier = Modifier.weight(1f),
                            title = "Simulación",
                            subtitle = "Haz otro examen completo de 30 preguntas.",
                            iconRes = R.drawable.icon_exam,
                            accent = ExamGreen,
                            onClick = onStartTest
                        )
                    }
                } else {
                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Tests por temas",
                        subtitle = "Practica exactamente lo que necesitas.",
                        iconRes = R.drawable.icon_topics,
                        accent = TopicsBlue,
                        onClick = onOpenTopics
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Mis fallos",
                        subtitle = "Vuelve a intentar las preguntas falladas.",
                        iconRes = R.drawable.icon_mistakes,
                        accent = MistakesOrange,
                        onClick = onOpenMistakes
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Estadísticas",
                        subtitle = "Comprueba cómo estás evolucionando.",
                        iconRes = R.drawable.icon_stats,
                        accent = StatsPurple,
                        onClick = onOpenStatistics
                    )
                }

                Text(text = "Legal y privacidad", color = Color.White.copy(alpha = 0.55f), fontSize = 12.sp, modifier = Modifier.clickable { uriHandler.openUri("https://feriacontrol.github.io/memorizatest/") }.padding(vertical = 10.dp))

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Composable
private fun RemoveAdsCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .height(62.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF2A2142),
                        Color(0xFF1C1730)
                    )
                )
            )
            .border(
                1.4.dp,
                StatsPurple.copy(alpha = 0.75f),
                RoundedCornerShape(20.dp)
            )
            .clickable { onClick() }
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(StatsPurple.copy(alpha = 0.28f))
                .border(
                    1.dp,
                    StatsPurple.copy(alpha = 0.65f),
                    RoundedCornerShape(14.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "✦",
                color = StatsPurple,
                fontSize = 20.sp,
                fontWeight = FontWeight.Black
            )
        }

        Spacer(modifier = Modifier.width(13.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Sin anuncios",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Black
            )

            Text(
                text = "2,99 € / año",
                color = Color(0xFFC6B5FF),
                fontSize = 12.sp,
                fontWeight = FontWeight.Black
            )
        }

        Text(
            text = "›",
            color = StatsPurple,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun HeaderWithPermitMenu(
    isTablet: Boolean,
    onRemoveAds: () -> Unit
) {
    if (isTablet) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BrandHeader(isTablet = true)

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                RemoveAdsCard(
                    modifier = Modifier.width(220.dp),
                    onClick = onRemoveAds
                )

                PermitMenu(
                    modifier = Modifier.width(220.dp)
                )
            }
        }
    } else {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            BrandHeader(isTablet = false)

            Spacer(modifier = Modifier.height(10.dp))

            RemoveAdsCard(
                modifier = Modifier.fillMaxWidth(),
                onClick = onRemoveAds
            )

            Spacer(modifier = Modifier.height(8.dp))

            PermitMenu(
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
private fun BrandHeader(
    isTablet: Boolean
) {
    Image(
        painter = painterResource(R.drawable.logo_memorizatest),
        contentDescription = "MemorizaTest",
        modifier = Modifier
            .width(if (isTablet) 320.dp else 235.dp)
            .height(if (isTablet) 78.dp else 62.dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.CenterStart
    )
}

@Composable
private fun PermitMenu(
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    Box(modifier = modifier) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            Color(0xF0192739),
                            Color(0xF0101B29)
                        )
                    )
                )
                .border(
                    1.dp,
                    BrandBlue.copy(alpha = 0.45f),
                    RoundedCornerShape(18.dp)
                )
                .clickable { expanded = true }
                .padding(horizontal = 11.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(13.dp))
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                Color(0xFF32B4FF),
                                Color(0xFF1971E8)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "B",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black
                )
            }

            Spacer(modifier = Modifier.width(11.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "PERMISO ACTUAL",
                    color = Color.White.copy(alpha = 0.46f),
                    fontSize = 9.sp,
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "B · Coche",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "⌄",
                color = BrandBlue,
                fontSize = 20.sp,
                fontWeight = FontWeight.Black
            )
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .width(270.dp)
                .background(Color(0xFF101A29))
        ) {
            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            "B · Coche",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            "Permiso actual",
                            color = BrandBlue,
                            fontSize = 11.sp
                        )
                    }
                },
                onClick = { expanded = false }
            )

            listOf(
                "A · Moto",
                "C · Camión",
                "D · Autobús",
                "AM · Ciclomotor"
            ).forEach { name ->
                DropdownMenuItem(
                    text = {
                        Column {
                            Text(
                                name,
                                color = Color.White.copy(alpha = 0.45f)
                            )
                            Text(
                                "Próximamente",
                                color = Color.White.copy(alpha = 0.25f),
                                fontSize = 10.sp
                            )
                        }
                    },
                    onClick = {},
                    enabled = false
                )
            }
        }
    }
}

@Composable
private fun SectionTitle(
    title: String,
    subtitle: String
) {
    Column {
        Text(
            text = title,
            color = Color.White,
            fontSize = 17.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = subtitle,
            color = Color.White.copy(alpha = 0.50f),
            fontSize = 12.sp
        )
    }
}

@Composable
private fun HomeTile(
    modifier: Modifier,
    title: String,
    subtitle: String,
    iconRes: Int,
    accent: Color,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(22.dp)

    Row(
        modifier = modifier
            .height(112.dp)
            .clip(shape)
            .background(
                Brush.horizontalGradient(
                    listOf(
                        PanelDark,
                        PanelDark2
                    )
                )
            )
            .border(
                1.dp,
                Color.White.copy(alpha = 0.09f),
                shape
            )
            .clickable { onClick() }
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(19.dp))
                .background(accent.copy(alpha = 0.13f))
                .border(
                    1.dp,
                    accent.copy(alpha = 0.32f),
                    RoundedCornerShape(19.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(iconRes),
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.width(15.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = subtitle,
                color = Color.White.copy(alpha = 0.58f),
                fontSize = 11.5.sp,
                lineHeight = 15.sp
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        ArrowChip(accent)
    }
}

@Composable
private fun ArrowChip(
    accent: Color
) {
    Box(
        modifier = Modifier
            .size(34.dp)
            .clip(CircleShape)
            .background(accent.copy(alpha = 0.13f))
            .border(
                1.dp,
                accent.copy(alpha = 0.35f),
                CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "›",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun StartExamButton(
    isTablet: Boolean,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(26.dp)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(if (isTablet) 126.dp else 118.dp)
            .clip(shape)
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF17344C),
                        Color(0xFF142A3D),
                        Color(0xFF102231)
                    )
                )
            )
            .border(
                1.2.dp,
                ExamGreen.copy(alpha = 0.48f),
                shape
            )
            .clickable { onClick() }
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .align(Alignment.TopCenter)
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            Color.Transparent,
                            ExamGreen,
                            BrandBlue,
                            Color.Transparent
                        )
                    )
                )
        )

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(if (isTablet) 76.dp else 68.dp)
                    .clip(RoundedCornerShape(22.dp))
                    .background(ExamGreen.copy(alpha = 0.14f))
                    .border(
                        1.dp,
                        ExamGreen.copy(alpha = 0.5f),
                        RoundedCornerShape(22.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "30",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Black
                    )

                    Text(
                        text = "PREG.",
                        color = ExamGreen,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Black
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "SIMULACIÓN DE EXAMEN",
                    color = Color.White,
                    fontSize = if (isTablet) 20.sp else 17.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "30 preguntas · formato examen",
                    color = Color.White.copy(alpha = 0.62f),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "✓ Contenido DGT / BOE verificado",
                    color = ExamGreen,
                    fontSize = 10.5.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(ExamGreen.copy(alpha = 0.15f))
                    .border(
                        1.dp,
                        ExamGreen.copy(alpha = 0.45f),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "›",
                    color = Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
