fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will work because the list is mutable
    list.add(6)
    println(list)

    // Alternatively, create a new mutable list from the result of map
    val mutableDoubledList = doubledList.toMutableList()
    mutableDoubledList.add(6)
    println(mutableDoubledList)
}