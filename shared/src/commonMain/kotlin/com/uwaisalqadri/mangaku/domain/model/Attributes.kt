package com.zenkriztao.otaku.domain.model

data class Attributes(
    val ageRating: String,
    val ageRatingGuide: String,
    val averageRating: Double,
    val canonicalTitle: String,
    val chapterCount: Int,
    val coverImage: CoverImage? = null,
    val description: String,
    val endDate: String,
    val favoritesCount: Int,
    val mangaType: String,
    val nextRelease: String,
    val popularityRank: String,
    val posterImage: PosterImage? = null,
    val ratingRank: Int,
    val serialization: String,
    val slug: String,
    val startDate: String,
    val status: String,
    val subtype: String,
    val synopsis: String,
    val tba: String,
    val titles: Titles? = null,
    val userCount: Int,
    val volumeCount: Int
)