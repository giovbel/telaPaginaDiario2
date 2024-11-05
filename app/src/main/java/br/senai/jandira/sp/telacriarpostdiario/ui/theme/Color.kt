package br.senai.jandira.sp.telacriarpostdiario.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Definindo cores customizadas para o tema
val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// Definindo o Light Color Scheme
val lightColors = lightColorScheme(
    primary = Purple40,
    secondary = Pink40,
    background = Color.Transparent,   // Fundo geral transparente
    surface = Color.Transparent,      // Superfície transparente (para evitar o fundo cinza)
    onBackground = Color.Black,
    onSurface = Color.Black
)

val darkColors = darkColorScheme(
    primary = Purple80,
    secondary = Pink80,
    background = Color.Transparent,   // Fundo geral transparente
    surface = Color.Transparent,      // Superfície transparente
    onBackground = Color.Black,
    onSurface = Color.Black
)

