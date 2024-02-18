package com.example.streaming

interface Computer {
    val name: String;
    val price: Int;
    val location: Map<String, Double>;
    fun printLocation();
}

class Mobile(override val name: String, override val price: Int, override val location:  Map<String, Double>): Computer {
    override fun printLocation() {
        val makeLocation = (location.keys) + (location.values)
        println("The location is $makeLocation")

    }
}

class RaspberriPi(override val name: String, override val price: Int, override val location:  Map<String, Double>): Computer {
    override fun printLocation() {
        val makeLocation = (location.keys) + (location.values)
        println("The location is $makeLocation")
    }
}

fun main() {
    val mobile: Computer = Mobile("IPhone", 1000, mapOf("Guldbergsgade" to 2.0));
    val RaspberriPi: Computer = RaspberriPi("Mini computer", 800, mapOf("Studiestræde" to 22.0));

    mobile.printLocation()
    RaspberriPi.printLocation()
}