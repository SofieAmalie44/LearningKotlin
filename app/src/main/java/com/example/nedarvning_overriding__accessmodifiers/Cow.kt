package com.example.nedarvning_overriding__accessmodifiers

class Cow(name: String, nrOfLegs: Int, isMammal: Boolean) : Animal(name,nrOfLegs,isMammal) {

    override fun makeSound() {
        println("I am a Cow I say Mooo");
    }
}