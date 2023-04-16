import DataStructures_and_Algorithms.Heaps.ComparableHeap
import DataStructures_and_Algorithms.Heaps.ComparatorHeap

fun main() {

    // val array = arrayListOf(1, 12, 3, 4, 1, 6, 8, 7)

    val array = arrayListOf<Int>()

    for (i in 0 until 20) {

        array.add((0..200).random())

    }

    /* //comparable maxHeap implementation
    val priorityQueue = ComparableHeap.create(array)
    while (!priorityQueue.isEmpty) {
        println(priorityQueue.remove())

    }
    */

    //comparator minHeap implementation
    val inverseComparator = object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int = 
        o2.compareTo(o1)
    }

    val minHeap = ComparatorHeap.create(array, inverseComparator)

    println("Inserting 16")
    minHeap.insert(14)
    println("Inserting 6")
    minHeap.insert(6)
//    while (!minHeap.isEmpty) {
  //      println(minHeap.remove())

    //}
}
