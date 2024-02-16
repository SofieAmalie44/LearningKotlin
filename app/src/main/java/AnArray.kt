class AnArray {
}

fun main() {
    // making an array of integers
    val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50, 60);
    // looping through all the elements in the array
    for(number in numbers) {
        // printing out every element on separate lines
        println(number)
    }
    // making an array of integers
    val indexes: IntArray = intArrayOf(10, 20, 30, 40, 50, 60);
    // looping through all the elements in the array and choosing all integers on the first index in each element
    for(index in indexes.indices) {
        // printing out every element on the first index on separate lines
        println(index);
    }
}

