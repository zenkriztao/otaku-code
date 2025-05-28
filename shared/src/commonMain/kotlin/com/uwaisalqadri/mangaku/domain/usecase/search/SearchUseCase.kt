package com.zenkriztao.otaku.domain.usecase.search

import com.zenkriztao.otaku.domain.UseCase
import com.zenkriztao.otaku.domain.executing
import com.zenkriztao.otaku.domain.model.Manga
import com.zenkriztao.otaku.domain.repository.MangaRepository
import kotlinx.coroutines.flow.Flow

class SearchUseCase(private val repository: MangaRepository) : UseCase<String, List<Manga>> {
    override fun execute(parameter: String): Flow<List<Manga>> {
        return executing {
            repository.getSearchManga(parameter)
        }
    }
}