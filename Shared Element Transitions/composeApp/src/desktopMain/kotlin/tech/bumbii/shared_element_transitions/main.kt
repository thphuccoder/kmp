package tech.bumbii.shared_element_transitions

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Shared Element Transitions",
    ) {
        App()
    }
}