package app

fun main() {
    val list1: List<String> = listOf("Hello", "Lukman", "Hakim")
    val list2: List<String> = listOf("Morning", "Zyan", "L")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)

    val list4= list1.zip(list2){item1, item2 ->
        "$item1 $item2"
    }
    println(list4)

}