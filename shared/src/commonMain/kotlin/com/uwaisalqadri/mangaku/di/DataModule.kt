package com.zenkriztao.otaku.di

import com.zenkriztao.otaku.data.repository.MangaRepositoryImpl
import com.zenkriztao.otaku.data.source.remote.NetworkService
import com.zenkriztao.otaku.domain.repository.MangaRepository
import com.zenkriztao.otaku.utils.YamlResourceReader
import org.koin.dsl.module

val dataModule = module {
    single { NetworkService() }
    single { YamlResourceReader(get()) }
    single<MangaRepository> { MangaRepositoryImpl(get(), get()) }
}
