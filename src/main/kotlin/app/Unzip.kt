package app

fun main() {
    val list1: List<Pair<String, String>> = listOf(
        "Hello" to "Morning",
        "Lukman" to "Hakim",
        "Zyan" to "L"
    )
    val pair: Pair<List<String>, List<String>> = list1.unzip()
    println(pair.first)
    println(pair.second)
}