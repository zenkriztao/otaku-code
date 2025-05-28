package com.zenkriztao.otaku.utils

import co.touchlab.kermit.BuildConfig


/**
 *   on July 22, 2021
 */

actual fun getStage(): EnvStage {
	if (BuildConfig.DEBUG) {
		return EnvStage.DEV
	}

	return EnvStage.RELEASE
}
