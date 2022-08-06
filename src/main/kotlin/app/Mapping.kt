package app

fun main() {
    val list: List<String> = listOf("Lukman", "Hakim", "Kotlin")

//    Manual
//    val temp = mutableListOf<String>()
//    for (value in list){
//        temp.add(value.uppercase())
//    }

    val list2 = list.map { it.uppercase() }
    println(list2)

    val set= setOf("Lukman", "Hakim", "Kotlin")
    val set1 = set.map { it.lowercase() }
    println(set1)

    val namesIndex = listOf("Lukman", "Hakim", "Joko", "Kurniawan")
    val nameGanjil = namesIndex.mapIndexedNotNull{ index, name ->
        if (index % 2 == 0)  null
        else name
    }

    println(nameGanjil)

    val number = (1..100).toList()
    val numGanjil = number.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(numGanjil)

}