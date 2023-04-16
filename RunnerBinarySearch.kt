import DataStructures_and_Algorithms.Searches.binarySearch
import DataStructures_and_Algorithms.Sorts.*
import kotlin.random.*

fun main() {

//    val array = arrayListOf(1, 5, 15, 17, 19, 22, 24, 31, 105, 150)
    val array = arrayListOf<Int>()

    for (i in 0 until 50) {

        array.add((0..200).random())
        println(array[i])

    }

    array.quicksortDutchFlag(0, array.size - 1)
    var sortedArray = array.mergeSort()

    val binarySearch = sortedArray.binarySearch(22)

    println("Performing Binary Search:")
    println("$binarySearch")

}
