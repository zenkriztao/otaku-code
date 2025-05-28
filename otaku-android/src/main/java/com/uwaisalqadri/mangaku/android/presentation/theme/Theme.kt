package com.zenkriztao.otaku.android.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MangaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) MangaDarkColors else MangaLightColors,
        typography = MangaTypography,
        shapes = MangaShapes,
        content = content
    )
}