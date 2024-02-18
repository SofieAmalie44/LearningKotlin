package com.example.nedarvning_overriding__accessmodifiers

open class FoodItems(name: String, description: String, price: Double) {
    val name: String = name;
    val description: String = description;
    val price: Double = price;

    open fun cook() {
        println("Something is cooking");
    }

    override fun toString(): String {
        return super.toString() + " " + this.name + " " + this.description + " " + this.price;
    }

}