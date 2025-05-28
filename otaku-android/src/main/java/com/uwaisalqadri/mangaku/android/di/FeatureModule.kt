package com.zenkriztao.otaku.android.di

import com.zenkriztao.otaku.presentation.browse.BrowseViewModel
import com.zenkriztao.otaku.presentation.detail.DetailViewModel
import com.zenkriztao.otaku.presentation.mymanga.MyMangaViewModel
import com.zenkriztao.otaku.presentation.search.SearchViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val featureModule = module {
    viewModel { BrowseViewModel(get()) }
    viewModel { MyMangaViewModel(get(), get(), get(), get()) }
    viewModel { SearchViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}