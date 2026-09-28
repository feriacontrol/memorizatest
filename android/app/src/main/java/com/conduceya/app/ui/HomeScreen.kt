package com.conduceya.app.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.conduceya.app.R

private val BrandBlue = Color(0xFF20A4FF)
private val CardBlue = Color(0xFF2B8CFF)
private val CardGreen = Color(0xFF2ED0B3)
private val CardOrange = Color(0xFFFFB13B)
private val CardPurple = Color(0xFF9C6BFF)

@Composable
fun HomeScreen(
    onStartTest: () -> Unit,
    onOpenTopics: () -> Unit,
    onOpenMistakes: () -> Unit,
    onOpenStatistics: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
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
                            Color(0x77000000),
                            Color(0x55000000),
                            Color(0xAA000000)
                        )
                    )
                )
        )

        BoxWithConstraints(
            modifier = Modifier.fillMaxSize()
        ) {
            val isTablet = maxWidth >= 700.dp
            val horizontalPadding = if (isTablet) 42.dp else 20.dp
            val gap = 16.dp

            val panelWidth =
                if (isTablet) {
                    (maxWidth - horizontalPadding * 2) * 0.76f
                } else {
                    maxWidth - horizontalPadding * 2
                }

            val tileHeight =
                if (isTablet) 178.dp else 155.dp

            val tileWidth =
                if (isTablet) {
                    (panelWidth - gap) / 2
                } else {
                    panelWidth
                }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(
                        horizontal = horizontalPadding,
                        vertical = 46.dp
                    )
            ) {
                HeaderWithPermitMenu(
                    isTablet = isTablet
                )

                Spacer(
                    modifier = Modifier.height(
                        if (isTablet) 28.dp else 24.dp
                    )
                )

                if (isTablet) {
                    Row(
                        modifier = Modifier.width(panelWidth),
                        horizontalArrangement = Arrangement.spacedBy(gap)
                    ) {
                        HomeTile(
                            modifier = Modifier.width(tileWidth),
                            title = "Tests\npor temas",
                            subtitle = "Practica lo que más te cuesta",
                            iconRes = R.drawable.icon_topics,
                            accent = CardBlue,
                            height = tileHeight,
                            onClick = onOpenTopics
                        )

                        HomeTile(
                            modifier = Modifier.width(tileWidth),
                            title = "Simulación\nde examen",
                            subtitle = "30 preguntas como en el examen real",
                            iconRes = R.drawable.icon_exam,
                            accent = CardGreen,
                            height = tileHeight,
                            onClick = onStartTest
                        )
                    }

                    Spacer(modifier = Modifier.height(gap))

                    Row(
                        modifier = Modifier.width(panelWidth),
                        horizontalArrangement = Arrangement.spacedBy(gap)
                    ) {
                        HomeTile(
                            modifier = Modifier.width(tileWidth),
                            title = "Mis fallos",
                            subtitle = "Repasa las preguntas que has fallado",
                            iconRes = R.drawable.icon_mistakes,
                            accent = CardOrange,
                            height = tileHeight,
                            onClick = onOpenMistakes
                        )

                        HomeTile(
                            modifier = Modifier.width(tileWidth),
                            title = "Estadísticas",
                            subtitle = "Comprueba tu evolución",
                            iconRes = R.drawable.icon_stats,
                            accent = CardPurple,
                            height = tileHeight,
                            onClick = onOpenStatistics
                        )
                    }
                } else {
                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Tests por temas",
                        subtitle = "Practica lo que más te cuesta",
                        iconRes = R.drawable.icon_topics,
                        accent = CardBlue,
                        height = tileHeight,
                        onClick = onOpenTopics
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Simulación de examen",
                        subtitle = "30 preguntas como en el examen real",
                        iconRes = R.drawable.icon_exam,
                        accent = CardGreen,
                        height = tileHeight,
                        onClick = onStartTest
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Mis fallos",
                        subtitle = "Repasa las preguntas que has fallado",
                        iconRes = R.drawable.icon_mistakes,
                        accent = CardOrange,
                        height = tileHeight,
                        onClick = onOpenMistakes
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    HomeTile(
                        modifier = Modifier.fillMaxWidth(),
                        title = "Estadísticas",
                        subtitle = "Comprueba tu evolución",
                        iconRes = R.drawable.icon_stats,
                        accent = CardPurple,
                        height = tileHeight,
                        onClick = onOpenStatistics
                    )
                }

                Spacer(modifier = Modifier.height(22.dp))

                Box(
                    modifier = Modifier.width(panelWidth)
                ) {
                    StartExamButton(
                        onClick = onStartTest
                    )
                }

                Spacer(modifier = Modifier.height(26.dp))
            }
        }
    }
}

@Composable
private fun HeaderWithPermitMenu(
    isTablet: Boolean
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            BrandHeader(
                isTablet = isTablet
            )
        }

        Box(
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            PermitMenu()
        }
    }
}

@Composable
private fun PermitMenu() {
    var expanded by remember {
        mutableStateOf(false)
    }

    Box {
        Box(
            modifier = Modifier
                .width(245.dp)
                .height(72.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            Color(0xEE101B2B),
                            Color(0xDD17263A)
                        )
                    )
                )
                .border(
                    width = 1.2.dp,
                    color = BrandBlue.copy(alpha = 0.75f),
                    shape = RoundedCornerShape(20.dp)
                )
                .clickable {
                    expanded = true
                }
                .padding(
                    horizontal = 14.dp,
                    vertical = 10.dp
                )
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFF289FFF),
                                    Color(0xFF126BDF)
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "B",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Black
                    )
                }

                Spacer(
                    modifier = Modifier.width(13.dp)
                )

                Column {
                    Text(
                        text = "PERMISO",
                        color = Color.White.copy(alpha = 0.55f),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.3.sp
                    )

                    Spacer(
                        modifier = Modifier.height(2.dp)
                    )

                    Text(
                        text = "B · Coche",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Text(
                    text = "⌄",
                    color = BrandBlue,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Black
                )
            }
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            },
            modifier = Modifier
                .width(285.dp)
                .background(Color(0xFF101A29))
        ) {
            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            text = "B · Coche",
                            color = Color.White,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Permiso actual",
                            color = BrandBlue,
                            fontSize = 12.sp
                        )
                    }
                },
                onClick = {
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            text = "A · Moto",
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 16.sp
                        )

                        Text(
                            text = "Próximamente",
                            color = Color.White.copy(alpha = 0.30f),
                            fontSize = 11.sp
                        )
                    }
                },
                onClick = { },
                enabled = false
            )

            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            text = "C · Camión",
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 16.sp
                        )

                        Text(
                            text = "Próximamente",
                            color = Color.White.copy(alpha = 0.30f),
                            fontSize = 11.sp
                        )
                    }
                },
                onClick = { },
                enabled = false
            )

            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            text = "D · Autobús",
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 16.sp
                        )

                        Text(
                            text = "Próximamente",
                            color = Color.White.copy(alpha = 0.30f),
                            fontSize = 11.sp
                        )
                    }
                },
                onClick = { },
                enabled = false
            )

            DropdownMenuItem(
                text = {
                    Column {
                        Text(
                            text = "AM · Ciclomotor",
                            color = Color.White.copy(alpha = 0.50f),
                            fontSize = 16.sp
                        )

                        Text(
                            text = "Próximamente",
                            color = Color.White.copy(alpha = 0.30f),
                            fontSize = 11.sp
                        )
                    }
                },
                onClick = { },
                enabled = false
            )
        }
    }
}

@Composable
private fun BrandHeader(
    isTablet: Boolean
) {
    Image(
        painter = painterResource(
            id = R.drawable.logo_conduceya
        ),
        contentDescription = "ConduceYa",
        modifier = Modifier
            .width(if (isTablet) 430.dp else 310.dp)
            .height(if (isTablet) 115.dp else 85.dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.CenterStart
    )
}

@Composable
private fun HomeTile(
    modifier: Modifier,
    title: String,
    subtitle: String,
    icon: String = "",
    iconRes: Int? = null,
    accent: Color,
    height: androidx.compose.ui.unit.Dp,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(28.dp)

    Box(
        modifier = modifier
            .height(height)
            .clip(shape)
            .clickable { onClick() }
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xE625344A),
                        Color(0xD91A273A)
                    )
                )
            )
            .border(
                width = 1.3.dp,
                color = accent.copy(alpha = 1f),
                shape = shape
            )
            .padding(17.dp)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth(0.76f)
                .height(2.dp)
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            Color.Transparent,
                            accent,
                            Color.Transparent
                        )
                    )
                )
        )

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            if (iconRes != null) {
                Image(
                    painter = painterResource(iconRes),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .size(82.dp),
                    contentScale = ContentScale.Fit
                )
            } else {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .size(62.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = icon,
                        color = accent,
                        fontSize = if (icon == "▮▮▮") 22.sp else 30.sp,
                        fontWeight = FontWeight.Black
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart)
                    .padding(
                        start = 98.dp,
                        end = 54.dp
                    )
            ) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 18.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight.Black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = subtitle,
                    color = Color.White.copy(alpha = 0.84f),
                    fontSize = 12.sp,
                    lineHeight = 16.sp
                )
            }

            Box(
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                ArrowChip(accent = accent)
            }
        }
    }
}

@Composable
private fun ArrowChip(
    accent: Color
) {
    Box(
        modifier = Modifier
            .size(42.dp)
            .clip(CircleShape)
            .background(accent.copy(alpha = 0.28f))
            .border(
                width = 1.dp,
                color = accent.copy(alpha = 0.90f),
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "›",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
private fun StartExamButton(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp)
            .clip(RoundedCornerShape(36.dp))
            .clickable { onClick() }
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF0C8CFF),
                        Color(0xFF176FFF),
                        Color(0xFF0C8CFF)
                    )
                )
            )
            .border(
                width = 1.4.dp,
                color = Color.White.copy(alpha = 0.20f),
                shape = RoundedCornerShape(36.dp)
            )
            .padding(horizontal = 24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "▶",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Hacer test de 30 preguntas",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "›",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}
