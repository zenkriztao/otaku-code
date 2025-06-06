package com.zenkriztao.otaku.data.source.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class PosterImageResponse(
    val large: String? = "",
    val medium: String? = "",
    val original: String? = "",
    val small: String? = "",
    val tiny: String? = ""
)