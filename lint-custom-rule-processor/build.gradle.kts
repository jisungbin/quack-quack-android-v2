/*
 * Designed and developed by 2022 SungbinLand, Team Duckie
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/sungbinland/quack-quack/blob/main/LICENSE
 */

plugins {
    id(PluginEnum.JvmLibrary)
    id(PluginEnum.JvmKover)
    id(PluginEnum.JvmDokka)
}

dependencies {
    implementations(
        projects.lintCustomRuleAnnotation,
        libs.ksp.api,
    )
}