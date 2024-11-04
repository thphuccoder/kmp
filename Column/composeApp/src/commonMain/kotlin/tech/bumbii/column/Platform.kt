package tech.bumbii.column

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform