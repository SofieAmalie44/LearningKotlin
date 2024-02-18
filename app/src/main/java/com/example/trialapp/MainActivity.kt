package com.example.trialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import com.example.trialapp.ui.theme.TrialAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //
        super.onCreate(savedInstanceState)
        setContent {
            TrialAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrialAppTheme {
        Greeting("Android")
    }
}

fun main() {
    println("Hello World!")
    val firstName: String = "Sofie"
    var weight = 50                    // not always needed to specify the type reference
    val myVariable: Boolean = false
    val anotherVariable: Double = 2.5 // double is used for decimals
    // val = const  &&  var = let

    // combining operators
    val s1 = "Call me"
    val s2 = " maybe"
    val combined = s1 + s2
    println(combined)                // output "Call me maybe"

    val n1 = 9
    val n2 = 4
    val result = n1 + n2
    println(result)                 // output 13

    val myString = "KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2, 4))
    // Here we choose to print out the character on index 2 and up to index 4, but not index 4, therefore output is TL
    println("The string is $myString")  // output will be "The string is KOTLIN"

    val examScore = 88
    if (examScore > 70) {            // how to use an if statement
        println("You passed!")       // output is "You passed"
    }  else {
        println("You failed :(")     // output is "You failed :("
    }

    // Using collections
    val name1 = "Ali"
    val name2 = "Maya"
    val name3 = "Chen"
    // instead of many variables each containing a string, make a collection:
    val names = listOf("Ali", "Maya", "Chen")  // only one variable with a list of strings
    println(names[2])
    // by default collections in kotlin is not mutable
    // so if we want to change the content, need to make the list mutable like so:
    val names2 = mutableListOf("Ali", "Maya", "Chen")
    println(names2[2])
    names2.add("Sofie")             // adds the name "Sofie" to the mutable list names2
    // if we wanted to limit the type of values in the list we would add a type parameter like this:
    val names3 = mutableListOf<String>("Ali", "Maya", "Chen")
    println(names3[2])              // output "Chen"
    names3.add("Sofie")             // adds name to list like this "Ali, Maya, Chen, Sofie"
    //names3.add(80)                  // error saying, integer literal is not accepted in the list

    // for loops
    for (name in names) {
        println(name)  // prints out every element of the list one by one
    }
    // using for loop to print out something x amount of times:
    for (i in 1..5) {
        println(i)              // output: count from 1 to 5 one by one
    }
    // use for loop to count until 5
    for (i in 1 until 5) {
        println(i)             // output: count until 5, so only to 4
    }

    // Functions  (always use fun as the keyword)
    fun myFunction(name: String) {          //
        println("hello, $name")
    }

    fun main2() {
        myFunction("Sofie")  // call the function myFunction with a parameter value
    }
    main2()

    // Nullability
    // The concept of null is very important in Kotlin:
    fun nullability() {
        val instagramBio: String? = null  // has to allow a string value to be null
        // if we ran an iff statement not the output would just be empty.
        // we can't call any methods to something that is null, need to check is to get around that rule:
        val instaBio: String = "growth"
        if (instaBio != null) {    // check if variable is set to null
            println(instaBio.toUpperCase())     // output: "GROWTH"
        }
        // we can also use a shorter way of checking and printing out uppercase:
        println(instaBio?.toUpperCase())    // the ? checks and the the output is: "GROWTH"
        }
    nullability()

    println(result);
}


// Arrays

fun array(args: Array<String>) {
    println(args.contentToString())     // output: empty []
}

// Functions

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun result() {
    sum(3,5)
    println(result())
}












