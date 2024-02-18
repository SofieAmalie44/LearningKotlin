package com.example.nedarvning_overriding__accessmodifiers

class Appetizer(name: String, description: String, price: Double, servingSize: Int) : FoodItems(name, description, price) {
    val servingSize: Int = servingSize


    override fun cook() {
        println("The appetizer $name is cooking, the serving size is: $servingSize");
    }

}