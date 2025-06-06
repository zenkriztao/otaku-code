package com.zenkriztao.otaku.android.presentation.browse.composables

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zenkriztao.otaku.domain.model.Manga

@Composable
fun MangaTrending(
    modifier: Modifier = Modifier,
    trendingManga: List<Manga>,
    onMangaClick: (String) -> Unit
) {
    Column(
        modifier = modifier
            .animateContentSize()
    ) {
        trendingManga.forEach { manga ->
            MangaItem(
                manga = manga,
                modifier = Modifier
                    .height(197.dp)
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp)
            ) {
                onMangaClick(manga.id)
            }
        }
    }
}