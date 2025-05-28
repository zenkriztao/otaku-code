package com.zenkriztao.otaku.data.source.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class MangaDetailResponse(
    val data: MangaItemResponse?
)
