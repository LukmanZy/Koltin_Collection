package app

fun main() {
    val list1 = listOf("Eko", "Lukman", "Hakim")
    val list2 = list1.filter { it.length > 3 }
    println(list2)

    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4= listOf(null, 1, "Lukman", "Hakim", 2)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
}