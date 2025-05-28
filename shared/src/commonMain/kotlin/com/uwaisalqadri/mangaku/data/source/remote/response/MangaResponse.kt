package com.zenkriztao.otaku.data.source.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class MangaResponse(
    val data: List<MangaItemResponse>
)