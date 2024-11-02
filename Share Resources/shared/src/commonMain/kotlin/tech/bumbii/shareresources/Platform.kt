package tech.bumbii.shareresources

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform