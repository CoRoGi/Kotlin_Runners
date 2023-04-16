import DataStructures_and_Algorithms.Trees.TreeNode
import DataStructures_and_Algorithms.Trees.BinaryNode
import DataStructures_and_Algorithms.Trees.AVLNode
import DataStructures_and_Algorithms.Trees.BinarySearchTree
import DataStructures_and_Algorithms.Trees.AVLTree

fun main() {
    
//   val tree = makeBeverageTree()
   val bst = BinarySearchTree<Int>()
   val avl = AVLTree<Int>()
    
   (0..9).forEach {
    
        bst.insert(it)
        avl.insert(it)
    
   }
   //println(bst)
   println(avl)
//   tree.forEachDepthFirst {println(it.value)}
    
   (10..14).forEach {
    
        avl.insert(it)
    
   }
    
   println(avl)
    
   (15..19).forEach {
    
        avl.insert(it)
    
   }
    
   println(avl)
    
   (20..23).forEach {
    
        avl.insert(it)
    
   }
    
   println(avl)
    
}

fun makeBeverageTree(): TreeNode<String> {

    val tree = TreeNode("beverages")

    val hot = TreeNode("hot")
    val cold = TreeNode("cold")
    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("chocolate")
    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")
    val soda = TreeNode("soda")
    val milk = TreeNode("milk")
    val gingerAle = TreeNode("gingerAle")
    val bitterLemon = TreeNode("bitterLemon")

    tree.add(hot)
    tree.add(cold)
    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)
    cold.add(soda)
    cold.add(milk)
    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)
    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
    
}
