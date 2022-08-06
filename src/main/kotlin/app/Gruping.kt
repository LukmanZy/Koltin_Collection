package app

fun main() {

    val list = listOf("a", "c", "a", "b", "c", "b", "aa", "cc", "bb")
    val map: Map<String, List<String>> = list.groupBy { value -> value }
    println(map)
    val map2: Map<Int, List<String>> = list.groupBy { it.length }
    println(map2)

    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping)

}