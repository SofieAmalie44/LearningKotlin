package com.example.nedarvning_overriding__accessmodifiers

open class Animal(name: String, nrOfLegs: Int, isMammel: Boolean) {
    val name: String = name;
    val nrOfLegs: Int = nrOfLegs;
    val isMammel: Boolean = isMammel;

    open fun makeSound(){
        println("I am an animal - i make sound");
    }

    override fun toString(): String {
        return super.toString() + " " + this.name + " " + this.nrOfLegs + " " + this.isMammel;
    }

}