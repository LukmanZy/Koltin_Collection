package app

fun <T> displayIterable(iterable: Iterable<T>){

//    for(value in iterable) println(value)

    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val result = iterator.next()
        println(result)
    }

}

fun main() {

    displayIterable(listOf("lukman","a","c"))

}