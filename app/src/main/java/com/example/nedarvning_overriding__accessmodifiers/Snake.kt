package com.example.nedarvning_overriding__accessmodifiers

class Snake(name: String, nrOfLegs: Int, isMammel: Boolean) : Animal(name, nrOfLegs, isMammel) {

    override fun makeSound() {
        println("I am a Snake - I say Sssssh")
    }
}