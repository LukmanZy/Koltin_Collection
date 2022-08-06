package app

fun main() {

    val numbers = (0..100).toList()
    val list1 = numbers.slice(0..50) // INGAT 0..50 ADALAH INDEX
    println(list1)
    val list2 = numbers.slice(0..50 step 2)
    println(list2)
    val list3 = numbers.slice(50 downTo 0 step 2)
    println(list3)
}