package com.example.shared

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}

expect class Platform() {
    val platform: String
}
