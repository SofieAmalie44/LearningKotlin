package com.example.nedarvning_overriding__accessmodifiers

class Cooking {
}

fun main() {
    val meal1: Appetizer = Appetizer(
        "Stratiatella", "Very creamy cheese", 2.3, 4);
    val meal2: MainCourse = MainCourse(
        "Pizza", "Italian speciality", 8.4, 2);
    val meal3: Dessert = Dessert(
        "Triamisu", "Dessert with coffee and love", 2.0, false);

    val listOfFoodItems: List<FoodItems> = listOf(meal1, meal2, meal3);

    println(listOfFoodItems)

    meal1.cook()

}