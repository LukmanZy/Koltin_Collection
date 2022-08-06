package app

fun main() {

    val list1 = listOf("Helo","Lukman", "Hakim")
    val list2 = list1 + "Mahmud"
    println(list2)
    val list3 = list1 + listOf("Programer", "Zaman", "Now")
    println(list3)
    val list4 = list3 - "Zaman"
    println(list4)
    val list5 = list1 - listOf("Helo", "Hakim")
    println(list5)

    val map1 = mapOf("a" to "Hello", "b" to "Lukman", "c" to "Hakim")
    val map2 = map1 + ("d" to "mamang")
    println(map2)
    val map3 = map1 - "a"
    println(map3)

}