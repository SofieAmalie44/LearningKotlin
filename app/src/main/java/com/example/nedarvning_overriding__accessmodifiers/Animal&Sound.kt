package com.example.nedarvning_overriding__accessmodifiers

fun main() {
    val cow: Animal = Animal("Cow", 4, true);
    val dog: Animal = Animal("Dog", 4, true);
    val cat: Animal = Animal("Cat", 4, true);
    val bird: Animal = Animal("Bird", 2, false);
    val snake: Animal = Animal("Snake", 0, false);

    val realCow: Cow = Cow("Maren", 4, true);
    val realSnake: Snake = Snake("Harry", 0, false);
    //realCow.makeSound()
    //realSnake.makeSound()

    val listOfAnimals: List<Animal> = listOf(cow, dog, cat, bird, snake);

    val listOfRealAnimals: List<Animal> = listOf(realCow, realSnake)
    for (animal: Animal in listOfRealAnimals) {
        println(animal.makeSound())
    }

    val cowSound: Sound = Sound("MMoo")

}