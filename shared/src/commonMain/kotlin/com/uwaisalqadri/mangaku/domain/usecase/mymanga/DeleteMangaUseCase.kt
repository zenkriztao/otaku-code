package com.zenkriztao.otaku.domain.usecase.mymanga

import com.zenkriztao.otaku.domain.executing
import com.zenkriztao.otaku.domain.repository.MangaRepository
import com.zenkriztao.otaku.domain.UseCase
import kotlinx.coroutines.flow.Flow

class DeleteMangaUseCase(private val repository: MangaRepository) : UseCase<String, Unit> {
    override fun execute(parameter: String): Flow<Unit> {
        return executing {
            repository.deleteMangaFavorite(parameter)
        }
    }
}