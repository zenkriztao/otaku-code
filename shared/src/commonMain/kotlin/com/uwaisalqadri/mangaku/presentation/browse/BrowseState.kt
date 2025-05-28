package com.zenkriztao.otaku.presentation.browse

import com.zenkriztao.otaku.domain.model.Manga

data class BrowseState(
    val mangas: List<Manga> = listOf(),
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val errorMessage: String = ""
)