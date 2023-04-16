import DataStructures_and_Algorithms.LinkedLists.LinkedList
import DataStructures_and_Algorithms.LinkedLists.DoublyLinkedList

fun main() {

    // val list: MutableCollection<Int> = LinkedList()
    val list = DoublyLinkedList<Int>()
    list.append(3)    
    list.append(2)    
    list.append(1)
    list.append(4)
    list.append(5)
    list.append(6)

    println(list)
    list.testInsert(7, 4)
    println(list)
    println("${list.removeIndex(4)}")
    println(list)

}
