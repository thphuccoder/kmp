package tech.bumbii.shared_element_transitions

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform