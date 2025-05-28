package com.zenkriztao.otaku.domain.usecase.mymanga

import com.zenkriztao.otaku.domain.UseCase
import com.zenkriztao.otaku.domain.executing
import com.zenkriztao.otaku.domain.model.Manga
import com.zenkriztao.otaku.domain.repository.MangaRepository
import kotlinx.coroutines.flow.Flow

class GetMyMangaUseCase(private val repository: MangaRepository) : UseCase<Unit, List<Manga>> {
    override fun execute(parameter: Unit): Flow<List<Manga>> {
        return executing {
            repository.getFavoriteManga()
        }
    }
}