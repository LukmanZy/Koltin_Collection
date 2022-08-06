package app

fun main() {
    listOf("satu", "dua", "tiga").forEach{
        println(it)
    }

    listOf("empat", "lima", "enam").forEachIndexed { index, value ->
        println("$index : $value")
    }
}