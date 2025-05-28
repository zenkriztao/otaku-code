package com.zenkriztao.otaku.data.source.local

import com.zenkriztao.otaku.db.MangaEntity

interface MangaDao {
    fun getAllManga(): List<MangaEntity>
    fun getMangaById(mangaId: String): List<MangaEntity>
    suspend fun addManga(manga: MangaEntity)
    suspend fun deleteManga(mangaId: String)
    suspend fun clearAllManga()
}