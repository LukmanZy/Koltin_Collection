package app


fun <T> displayListIterator(listIterator: ListIterator<T>){
    println("Display Next")
    while (listIterator.hasNext()) println(listIterator.next())
    println("Display Previous")
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun <T> displayMutableList(mutableListIterator: MutableListIterator<T>){
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}

fun removeIterator(mutableListIterator: MutableListIterator<Int>){
    while (mutableListIterator.hasNext()){
        val value = mutableListIterator.next()
        if (value % 2 == 1) mutableListIterator.remove()
    }
}



fun main() {

    displayListIterator(listOf("Lukman", "zyan", "hakim").listIterator())

    val objek = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    removeIterator(objek.listIterator())
    displayMutableList(objek.listIterator())


}