package com.zenkriztao.otaku.utils

/**
 *   on July 22, 2021
 */

actual fun getStage(): EnvStage {
	return stageIos ?: EnvStage.DEV
}

var stageIos: EnvStage? = null