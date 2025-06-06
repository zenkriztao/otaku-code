package com.zenkriztao.otaku.android

import android.app.Application
import com.zenkriztao.otaku.android.di.*
import com.zenkriztao.otaku.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

/**
 *   on July 23, 2021
 */
class MangaKuApp: Application() {

	override fun onCreate() {
		super.onCreate()
		initKoin {
			androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
			androidContext(this@MangaKuApp)
			modules(featureModule)
		}
	}
}