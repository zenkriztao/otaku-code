package com.zenkriztao.otaku.presentation.mymanga

import com.zenkriztao.otaku.domain.model.Manga

sealed class MyMangaEvent {
    data object GetMyMangas: MyMangaEvent()
    data class CheckFavorite(val mangaId: String): MyMangaEvent()
    data class AddFavorite(val manga: Manga): MyMangaEvent()
    data class DeleteFavorite(val mangaId: String): MyMangaEvent()
    data object Empty: MyMangaEvent()
}