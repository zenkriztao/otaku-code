package com.zenkriztao.otaku.presentation.detail

sealed class DetailEvent {
    data class GetManga(val id: String): DetailEvent()
}