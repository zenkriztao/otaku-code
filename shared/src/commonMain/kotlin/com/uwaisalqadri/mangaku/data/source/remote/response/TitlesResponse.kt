package com.zenkriztao.otaku.data.source.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class TitlesResponse(
    var en: String? = "",
    var en_jp: String? = "",
    var en_us: String? = "",
    var ja_jp: String? = ""
)