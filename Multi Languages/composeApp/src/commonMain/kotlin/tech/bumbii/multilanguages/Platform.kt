package tech.bumbii.multilanguages

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform