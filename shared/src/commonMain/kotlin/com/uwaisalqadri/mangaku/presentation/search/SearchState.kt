package com.zenkriztao.otaku.presentation.search

import com.zenkriztao.otaku.domain.model.Manga

data class SearchState(
    val searchQuery: String = "",
    val mangas: List<Manga> = listOf(),
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val errorMessage: String = "",
)