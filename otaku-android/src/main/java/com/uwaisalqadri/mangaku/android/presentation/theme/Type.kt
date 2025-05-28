package com.zenkriztao.otaku.android.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.zenkriztao.otaku.android.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_semibold, FontWeight.SemiBold),
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_medium, FontWeight.Medium)
)

private val MaShanZheng = FontFamily(
    Font(R.font.mashanzheng_regular, FontWeight.Medium)
)

private val SedgwickAve = FontFamily(
    Font(R.font.sedgwickavedisplay_regular, FontWeight.Medium)
)

val MangaTypography = Typography(
    h1 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold
    ),
    h2 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold
    ),
    h3 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    ),
    caption = TextStyle(
        fontFamily = MaShanZheng,
        fontWeight = FontWeight.Medium,
        fontSize = 40.sp
    ),
    overline = TextStyle(
        fontFamily = SedgwickAve,
        fontWeight = FontWeight.Medium,
        fontSize = 30.sp
    )
)










