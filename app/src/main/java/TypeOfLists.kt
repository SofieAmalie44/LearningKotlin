class TypeOfLists {
}

fun main() {

    // - List is the abstract data type. So list is the interface.
    // - ArrayList / LinkedList is the implementation.
    // - Differ in implementation but adheres to the same interface.
    // - Can be instantiated as mutable / immutable.

    // ArrayList (Implementation ADT)
    // - Pretty sophisticated algorithm working underneath the implementation of a simple array

    // LinkedList (Implementation ADT)
    // - head(Data-Next ->  Data-Next -> Data-Next)Done

    // this function is flexible since is can take all: ArrayList, LinkedList and List
    fun doSomethingWithLists(list: List<String>) {
        // list operations
    }
    // this function is as flexible since is can only take: ArrayList
    fun doSomethingWithLists2(list: ArrayList<String>) {
        // list operations
    }

    // HashMap
    // val hashMap: HashMap

    // Set - data structure

    // (set operations)
        // Creation a HashSet of strings
    val pulpFictionCast: HashSet<String> = hashSetOf(
        "John", "Uma", "Samual", "Quentin",
        "Bruce", "Harvey", "Tim", "Amanda"
    )
        // Creation a HashSet of strings
    val killBill: HashSet<String> = hashSetOf(
        "Uma", "Samuel", "Lucy",
        "Daryl", "Michael", "David", "Bruce", "Quentin"
    )

    // Finding the duplicates (Intersections)
    val intersect: Set<String> = pulpFictionCast.intersect(killBill);
    println(intersect); // output: [Bruce, Uma, Quentin]

}



