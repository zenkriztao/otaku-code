package com.zenkriztao.otaku.presentation.browse

sealed class BrowseEvent {
    data object GetMangas: BrowseEvent()
}