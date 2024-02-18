package com.example.nedarvning_overriding__accessmodifiers

open class Sound(sound: String) {
    var sound: String = sound;


   override fun toString(): String {
        return super.toString() + "I make the sound: $sound"
    }

}