package tech.bumbii.theme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform