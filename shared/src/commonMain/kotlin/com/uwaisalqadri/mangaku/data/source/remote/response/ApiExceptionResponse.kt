package com.zenkriztao.otaku.data.source.remote.response

import com.zenkriztao.otaku.domain.model.ApiError
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiExceptionResponse(
    @SerialName("error")
    val errorTitle: String,
    @SerialName("error_description")
    val errorMessage: String
): Exception() {
    fun map(): ApiError {
        return ApiError(errorTitle, errorMessage)
    }
}