package com.zenkriztao.otaku.utils

import kotlinx.serialization.Serializable

/**
 *   on July 22, 2021
 */
@Serializable
data class Configs(
	val baseUrl: String
)

enum class EnvStage(val file: String) {
	DEV("dev.yaml"),
	RELEASE("release.yaml")
}

expect fun getStage(): EnvStage