package com.zenkriztao.otaku.android.presentation.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val MangaDarkColors = darkColors(
    primary = Color(0xFF222222),
    primaryVariant = Color.Black,
    secondary = Color.White,
    error = Color.Red,
    surface = Color.Gray,
    onSurface = Color.Gray.copy(alpha = 0.3f),
    background = Color.DarkGray
)

val MangaLightColors = lightColors(
    primary = Color.White,
    primaryVariant = Color.White,
    secondary = Color.Black,
    error = Color.Red,
    surface = Color.LightGray,
    onSurface = Color.LightGray,
    background = Color.White
)