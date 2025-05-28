package com.zenkriztao.otaku.di

import com.zenkriztao.otaku.domain.usecase.browse.BrowseUseCase
import com.zenkriztao.otaku.domain.usecase.browse.TrendingUseCase
import com.zenkriztao.otaku.domain.usecase.detail.DetailUseCase
import com.zenkriztao.otaku.domain.usecase.mymanga.AddMangaUseCase
import com.zenkriztao.otaku.domain.usecase.mymanga.DeleteMangaUseCase
import com.zenkriztao.otaku.domain.usecase.mymanga.GetMyMangaByIdUseCase
import com.zenkriztao.otaku.domain.usecase.mymanga.GetMyMangaUseCase
import com.zenkriztao.otaku.domain.usecase.search.SearchUseCase
import org.koin.dsl.module

val domainModule = module {
    single { BrowseUseCase(get()) }
    single { TrendingUseCase(get()) }
    single { DetailUseCase(get()) }
    single { SearchUseCase(get()) }
    single { AddMangaUseCase(get()) }
    single { DeleteMangaUseCase(get()) }
    single { GetMyMangaByIdUseCase(get()) }
    single { GetMyMangaUseCase(get()) }
}