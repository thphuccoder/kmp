package tech.bumbii.kmp

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    data object HomeScreen : Routes()

    @Serializable
    data object LessonScreen : Routes()

    @Serializable
    data object ProfileScreen : Routes()
}