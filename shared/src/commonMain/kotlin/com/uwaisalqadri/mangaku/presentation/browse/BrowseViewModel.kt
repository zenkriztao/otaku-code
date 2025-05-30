package com.zenkriztao.otaku.presentation.browse

import com.rickclephas.kmp.observableviewmodel.ViewModel
import com.rickclephas.kmp.observableviewmodel.launch
import com.zenkriztao.otaku.domain.usecase.browse.BrowseUseCase
import com.zenkriztao.otaku.domain.execute
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update

open class BrowseViewModel(
    private val browseUseCase: BrowseUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(BrowseState())
    val state: StateFlow<BrowseState> = _state.asStateFlow()

    fun send(event: BrowseEvent) {
        when (event) {
            BrowseEvent.GetMangas -> getTrendingManga()
        }
    }

    private fun getTrendingManga() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        browseUseCase.execute()
            .catch { cause ->
                _state.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = cause.message.orEmpty()
                    )
                }
            }
            .collect { result ->
                _state.update {
                    if (result.isEmpty()) {
                        BrowseState(isEmpty = true)
                    } else {
                        BrowseState(mangas = result)
                    }
                }
            }
    }
}