package com.example.xapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform