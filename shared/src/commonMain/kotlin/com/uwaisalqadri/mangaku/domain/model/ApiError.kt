package com.zenkriztao.otaku.domain.model

data class ApiError(
    val errorTitle: String,
    val errorMessage: String
): Exception()