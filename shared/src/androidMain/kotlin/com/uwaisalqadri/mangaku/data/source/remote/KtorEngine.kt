package com.zenkriztao.otaku.data.source.remote

import io.ktor.client.engine.android.*
import org.koin.dsl.module

actual fun ktorEngineModule() = module {
    single { Android.create() }
}