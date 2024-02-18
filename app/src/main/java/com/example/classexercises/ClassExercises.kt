package com.example.classexercises


class ClassExercises {
}


fun main() {
    println("Hello World");

    threeNumber(3, 4, 5);

    //stringInput()

    //println(returnSum())

    println(greaterThanZero(40, 20))
    println(filterWithLambda())

    println(returnArrayOfStringLength())
}

// A) Write a function that receives 3 numbers as arguments and returns the largest of the numbers
fun threeNumber(a:Int, b:Int, c:Int) {
    var max = 0;
    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }
    println(max)
}

// B)
//Write a program that takes a String input from the user and outputs whether it is a palindrome or not
// The string should not contain whitespaces

 fun stringInput() {
    println("Hello! Please enter a palindrome")

    val input = readln().toString()
    val validInput = input.toString()
    if (validInput.reversed() == validInput) {
        println("Great palindrome: $validInput")
    } else {
        println("Very bad word")
    }
}

// C)
//Write a function that given 3 int values, a b c, return their sum.
//If one of the values is the same as another of the values, it does not count towards the sum.
//The numbers are provided by the user

fun returnSum(): Int {
    println("Hi! Please enter three numbers")

    val inputA = readln().toInt()
    val inputB = readln().toInt()
    val inputC = readln().toInt()
    val list: List<Int> = mutableListOf(inputA, inputB, inputC)
    var listOfUsedNumbers: MutableList<Int> = mutableListOf()
    var sum = 0;


    for(number:Int in list) {
        if (!(listOfUsedNumbers.contains(number)))
        sum += number
        listOfUsedNumbers.add(number)
    }
     return sum;
}

// E)
//
//Write a function that receives 2 int values greater than 0.
// Return whichever value is nearest to 21 without going over. Return 0 if they both go over.

fun greaterThanZero(a:Int, b:Int): Int {
    var closestNumber = 0;

    if(a <= 21) {
        if (a > b) {
            closestNumber = a
        } else {
            if (b <= 21) {
                if (b > a) {
                    closestNumber = b
                }
            }
        }
    } else {
        if ((a and b) > 21) {
            return 0
        }
    }
    return closestNumber;
}

// A)
//Write a function that uses the filter function to filter all numbers of a list greater than 10
/*
fun filterWithFunction(): Unit {
    val list: List<Int> = listOf(1, 22,33,4,5,16,7,18,9);
    val filteredList: List<Int> = list.filter(::howToFilter)
    println(filteredList);
}

fun howToFilter(number: Int): Int {
    val newList: List<Int> = mutableListOf()
    number
} */

//Filtering a list of numbers with an anonymous lambda function
fun filterWithLambda(): List<Int> {
    val list: List<Int> = listOf(1, 22, 33, 14, 5, 16, 7, 18, 9);
    return list.filter { it > 10 }
}

// B)
// Write a function that takes an array of strings and returns an array with each strings length -
// if the strings has a length above 5 otherwise return 0 on the index.
// Hint: Use the map function.

fun returnArrayOfStringLength(): List<Int> {
    val list: List<String> = listOf("Hej", "Med", "Dig", "Hello", "Welcome");
    val mappedList: List<Int> = list.map{ word: String ->
        if (word.length > 5) {
            0
        } else {
            word.length
        }
    }
    return mappedList

}
