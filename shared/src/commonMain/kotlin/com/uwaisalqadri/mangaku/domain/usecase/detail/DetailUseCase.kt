package com.zenkriztao.otaku.domain.usecase.detail

import com.zenkriztao.otaku.domain.UseCase
import com.zenkriztao.otaku.domain.executing
import com.zenkriztao.otaku.domain.model.Manga
import com.zenkriztao.otaku.domain.repository.MangaRepository
import kotlinx.coroutines.flow.Flow

class DetailUseCase(private val repository: MangaRepository): UseCase<String, Manga> {
    override fun execute(parameter: String): Flow<Manga> {
        return executing {
            repository.getDetailManga(parameter)
        }
    }
}