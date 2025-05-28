package com.zenkriztao.otaku.domain.usecase.mymanga

import com.zenkriztao.otaku.domain.UseCase
import com.zenkriztao.otaku.domain.executing
import com.zenkriztao.otaku.domain.model.Manga
import com.zenkriztao.otaku.domain.repository.MangaRepository
import kotlinx.coroutines.flow.Flow

class AddMangaUseCase(private val repository: MangaRepository) : UseCase<Manga, Unit> {
    override fun execute(parameter: Manga): Flow<Unit> {
        return executing {
            repository.addMangaFavorite(parameter)
        }
    }
}