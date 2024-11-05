package tech.bumbii.text

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform