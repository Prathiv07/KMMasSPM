package com.kobil.kmmasspm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform