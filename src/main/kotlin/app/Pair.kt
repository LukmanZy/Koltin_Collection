package app

fun main() {

    val pair1: Pair<String, String> = Pair("Lukkman", "Zyan")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Lukman" to "Zyan"
    println(pair2.first)
    println(pair2.second)

}