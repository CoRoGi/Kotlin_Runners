import DataStructures_and_Algorithms.Queues.ComparablePriorityQueue
import DataStructures_and_Algorithms.Queues.ComparatorPriorityQueue

fun main() {

    val priorityQueue1 = ComparablePriorityQueue<Int>()

    arrayListOf(1, 12, 3, 4, 1, 6, 8, 7).forEach {

        priorityQueue1.enqueue(it)

    }

    while (!priorityQueue1.isEmpty) {

        println("Comparable Priority Queue")
        println(priorityQueue1.dequeue())

    }

    val stringLengthComparator = object : Comparator<String> {

        override fun compare(o1: String?, o2: String?): Int {

            val length1 = o1?.length ?: -1
            val length2 = o2?.length ?: -1
            return length1 - length2

        }

    }

    val priorityQueue2 =
        ComparatorPriorityQueue(stringLengthComparator)

    arrayListOf("one", "two", "three", "forty", "five", "six",
    "seven", "eight", "nine").forEach {
            
        priorityQueue2.enqueue(it)

    }

    while (!priorityQueue2.isEmpty) {

        println(priorityQueue2.dequeue())

    }

}
