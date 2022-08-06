package app

fun <T> displayMutbaleIterable(iterable: MutableIterable<T>){

//    for(value in iterable) println(value)

    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val result = iterator.next()
        println(result)
    }

}

fun main() {

    displayMutbaleIterable(mutableListOf("lukman","a","c"))

}