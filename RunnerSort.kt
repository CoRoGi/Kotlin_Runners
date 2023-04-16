import DataStructures_and_Algorithms.Sorts.*

fun main() {

    val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -8)

    println("Original: $list")
//    list.quicksortDutchFlag(0, list.size - 1)
    val sortedList = list.mergeSort()
    println("Sorted: $sortedList")

}
