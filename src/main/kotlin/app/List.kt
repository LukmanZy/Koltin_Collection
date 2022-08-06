package app

fun main() {
    val list: List<String> = listOf("Lukman","zyan","ucup","hakim")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
    println(list.indexOf("Lukman"))
    println(list.indexOf("tidak ada"))
    println(list.contains("zyan"))
    println(list.contains("tidak ada"))
    println(list.containsAll(listOf("Lukman", "ucup")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}