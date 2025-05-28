package com.zenkriztao.otaku.presentation.mymanga

import com.zenkriztao.otaku.domain.model.Manga

data class MyMangaState(
    val mangas: List<Manga> = listOf(),
    val isFavorite: Boolean = false,
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val errorMessage: String = ""
)