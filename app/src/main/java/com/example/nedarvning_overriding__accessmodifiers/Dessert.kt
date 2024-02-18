package com.example.nedarvning_overriding__accessmodifiers

class Dessert(name: String, description: String, price: Double, isVegan: Boolean) : FoodItems(name, description, price) {
    val isVegan: Boolean = isVegan;

    override fun cook() {
        println("The dessert $name is cooking, vegan? $isVegan");
    }
}