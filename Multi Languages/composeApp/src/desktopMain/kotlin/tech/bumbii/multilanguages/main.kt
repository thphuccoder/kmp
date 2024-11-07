package tech.bumbii.multilanguages

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Multi Languages",
    ) {
        App()
    }
}