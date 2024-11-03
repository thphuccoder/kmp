package tech.bumbii.koin_di

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Koin DI",
    ) {
        App()
    }
}