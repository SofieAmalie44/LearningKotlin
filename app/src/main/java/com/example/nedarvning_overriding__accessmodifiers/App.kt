package com.example.nedarvning_overriding__accessmodifiers

class App {
}

fun main() {
    val loseYourself: Song = Song("LooseYourself", "Eminem", 5000);
    val crazyKids: Song = Song("Crazy kids", "Kesha", 3000);
    val easyOnMe: Song = Song("Easy on me", "Abel", 4500)
    println(loseYourself);

    val listAllSongs: List<Song> = listOf(loseYourself, crazyKids, easyOnMe);

    //for(song in listAllSongs)
}