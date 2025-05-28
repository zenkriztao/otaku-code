package com.zenkriztao.otaku.utils

import org.koin.core.module.Module

interface ResourceReader {
    fun readResource(name: String): String
}

expect fun resourceReaderModule(): Module