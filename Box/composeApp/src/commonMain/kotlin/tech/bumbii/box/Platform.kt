package tech.bumbii.box

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform