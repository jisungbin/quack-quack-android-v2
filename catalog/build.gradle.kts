/*
 * Designed and developed by Duckie Team 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/quack-quack-android/blob/2.x.x/LICENSE
 */

@file:Suppress("INLINE_FROM_HIGHER_PLATFORM")

plugins {
    `buildlogic-android-application`
    `buildlogic-android-compose`
}

android {
    namespace = "team.duckie.quackquack.catalog"

    // https://github.com/Inconnu08/android-ratingreviews/issues/12#issuecomment-573385449
    configurations {
        implementation.get().exclude(group = "org.jetbrains", module = "annotations")
    }

    packaging {
        resources.excludes.add("META-INF/*")
    }
}

// https://github.com/Kotlin/kotlinx.coroutines/issues/2023#issuecomment-662996707
configurations.all {
    resolutionStrategy {
        exclude(group = "org.jetbrains.kotlinx", module = "kotlinx-coroutines-debug")
    }
}

dependencies {
    implementations(
        libs.compose.activity,
        libs.compose.material3,
        libs.kotlin.collections.immutable,
        projects.ui,
        projects.casaUi,
        projects.casaMaterial,
    )
}