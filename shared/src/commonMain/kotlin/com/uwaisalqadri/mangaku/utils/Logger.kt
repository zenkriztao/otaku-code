package com.zenkriztao.otaku.utils

import co.touchlab.kermit.Logger as KermitLogger

fun logger(onMessage: () -> String) {
    KermitLogger.d(onMessage)
}