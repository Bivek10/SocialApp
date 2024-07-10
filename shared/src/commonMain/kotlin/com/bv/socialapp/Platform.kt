package com.bv.socialapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform