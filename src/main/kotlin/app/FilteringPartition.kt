package app

fun main() {

    val list: List<String> = listOf("Helo","Lukman", "Hakim")
    val (listMach, listNotMatch) = list.partition { it.length > 4 }
    println(list)
    println(listMach)
    println("Not Match : $listNotMatch")
}