package com.zenkriztao.otaku.presentation.detail

import com.zenkriztao.otaku.domain.model.Manga

data class DetailState(
    val manga: Manga? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = ""
)