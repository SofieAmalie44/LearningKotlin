package com.example.streaming

interface Playable {
    fun play()
    fun stop()
}


class Movie(val length: Int, val title: String): Playable {
    override fun play() {
        println("I am a movie called $title")

    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}

class Series(val length: Int, val title: String, val episodes: MutableList<String>): Playable {
    override fun play() {
        TODO("Not yet implemented")

    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val inception: Playable = Movie(234, "Inception");
    inception.play()
}

