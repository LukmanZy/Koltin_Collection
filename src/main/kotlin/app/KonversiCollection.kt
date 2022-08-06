package app

fun main() {

    val array = arrayOf(1,2,3,4,5)
    val arrayone = arrayOf(5,3,2,5,6,7,89)
    val sortedset = arrayone.toSortedSet()
    val range = 1..20

    val list = range.toList()
    val mutableList = array.toMutableList()

    val set = range.toSet()
    val mutbleSet = list.toMutableSet()

    println(set)
    println(mutableList)
    println(sortedset)
}