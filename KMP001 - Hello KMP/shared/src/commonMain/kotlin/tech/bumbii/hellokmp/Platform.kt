package tech.bumbii.hellokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform