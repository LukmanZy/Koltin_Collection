package app

fun <T>displayCollection (collection: Collection <T>){
    for(element in collection){
        println(element)
    }
}

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection) println(element)
}

fun main() {

    displayMutableCollection(mutableListOf("a", "b"))
    displayMutableCollection(mutableMapOf("a" to "zyan").entries)

//    displayCollection(setOf("lukman", "Zyan"))
//    displayCollection(mapOf("lukman" to "Zyan").entries)
}