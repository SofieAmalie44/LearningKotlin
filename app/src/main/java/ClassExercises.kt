import java.io.File

class ClassExercises {
}

fun main() {
    exerciseA()

    //exerciseB()

    //exerciseC()
}

// A)
// Write a function that takes an array of strings and returns the indices NOT the number of the top 2 longest strings of the array.
//You can assume the array has at least 2 elements.
//Hint: Could the return type be a data structure?
// making an array of integers
fun exerciseA() {
    val strings: MutableList<String> = mutableListOf("Hello", "How", "Are", "You", "Welcome");
    val sortedList = strings.sortedByDescending { it.length }
    println(sortedList)
// looping through all the elements in the array
    for (string in sortedList.indices) {
        if (string < 2) {
            println(string)
        }
    }
}

// B)
// Write a basic dictionary using a HashMap.
//The keys will represent words and the values will be descriptions of the words
//A HashMap example with country & number of citizens
fun exerciseB() {
    val myDictionary: HashMap<String, String> = HashMap<String, String>();

    myDictionary.put("Nicklas", "Is a teacher");
    myDictionary.put("Jakob", "Is a nurse");
    myDictionary.put("Behu", "Is a bartender");
    myDictionary.put("Kasper", "Is a scientist");

    println(myDictionary.get("Nicklas"))
}

// C)
// - Write a function that reads the file https://kea-fronter.itslearning.com/LearningToolElement/ViewLearningToolElement.aspx?LearningToolElementId=1239835
//Create an object for each of the lines in the file such that each line generates an object with the properties: id, countryName, capital, population, continent
//Write a hashmap such that: key -> Denmark and so on:
class Country(var id: Int, var countryName: String, var capital: String, var population: Long, var continent: String
) {
    override fun toString(): String {
        return "$id - $countryName - $capital - $population - $continent"
    }
}

fun exerciseC() {
    val text: File = File("app/src/main/java/countries.txt");

    val textAsList: List<String> = text.readLines();

    val countriesHashMap: HashMap<Int, Country> = HashMap()

    for (line in textAsList) {
        val lineAsList: List<String> = line.split(";");
        val currentCountry = Country(lineAsList[0].toInt(), lineAsList[1].toString(), lineAsList[2] ,lineAsList[3].toLong() , lineAsList[4].toString())

        println(lineAsList);

        countriesHashMap.put(lineAsList[0].toInt(), currentCountry)
    }
    println(countriesHashMap);
}

// D)


