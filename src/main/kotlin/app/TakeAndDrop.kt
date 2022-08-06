package app

fun main() {

    val chars = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'r' })
    println(chars.takeLastWhile { it > 'x' })
    println("----------------------")

    println(chars.drop(3))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLast(3))
    println(chars.dropLastWhile { it > 'w' })

}