package com.example.nedarvning_overriding__accessmodifiers

class MainCourse(name: String, description: String, price: Double, spicinessLevel: Int) : FoodItems(name, description, price) {
    val spicinessLevel: Int = spicinessLevel;

    override fun cook() {
        println("The main course $name is cooking and the spiciness level is: $spicinessLevel");
    }

}