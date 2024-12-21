fun main() {
    // Using removeIf, modifies the list directly
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println("removeIf: "+ list) // Output: [1, 3, 5]

    //Using removeAll, returns a new list with elements satisfying the predicate removed
    val list2 = mutableListOf(1,2,3,4,5)
    val newList = list2.toMutableList().removeAll { it % 2 == 0 }
    println("removeAll: "+ list2) // Output: [1, 2, 3, 4, 5]
    println("New List: "+ newList) // Output: []
    
    //Correct usage of removeAll to modify the original list:
    val list3 = mutableListOf(1,2,3,4,5)
    list3.removeAll { it % 2 == 0 }
    println("removeAll (modifying original list): "+ list3) // Output: [1, 3, 5]
}