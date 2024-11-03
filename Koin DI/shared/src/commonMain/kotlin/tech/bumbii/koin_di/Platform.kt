package tech.bumbii.koin_di

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform