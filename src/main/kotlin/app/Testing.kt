package app

fun main() {

    val list: List<String> = listOf("Helo","Lukman", "Hakim")
    val list1: List<String> = listOf()
    println(list.any { it.length > 4 }) // mengecek minimal ada satu data yang sesuai dengan kondisi
    println(list.none { it.length > 6 }) // mengecek tidak ada satupun data yang sesuai dengan kondisi
    println(list.all { it.length > 5 }) // mengecek semua data sesuai dengan kondisi
    println(list.any()) // mengecek collection memiliki data
    println(list.none()) // mengecek collection tidak memiliki data

}