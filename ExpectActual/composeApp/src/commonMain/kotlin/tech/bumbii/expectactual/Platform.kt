package tech.bumbii.expectactual

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform