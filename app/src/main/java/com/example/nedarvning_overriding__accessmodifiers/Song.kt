package com.example.nedarvning_overriding__accessmodifiers

class Song(title: String, artist: String, lengthInMS: Int) {
    val title: String = title;
    val artist: String = artist;
    val lengthInMS: Int = lengthInMS;

    override fun toString(): String {
        return super.toString() + " " + this.title + " " + this.artist;
    }

}

