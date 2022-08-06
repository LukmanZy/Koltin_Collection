package app

import data.Person

fun main() {

    val set: Set<Person> = setOf(
        Person("Lukman"), Person("zyan"), Person("hakim"), Person("zyan")
    )

    println(set.size)
    println(set.contains(Person("ucup")))

    for (i in set ){
        println(i)
    }

    println("================")


    for ((i, value) in set.withIndex()){
        println("$i. $value")
    }

    println("================")

    val setMutableSet: MutableSet<Person> = mutableSetOf(
        Person("Lukman"), Person("zyan")
    )

    setMutableSet.add(Person("Bapak kau"))

    println(setMutableSet)

    setMutableSet.removeAll(setMutableSet)
    for ((i, value) in setMutableSet.withIndex()){
        println("$i. $value")
    }

    println(setMutableSet.isEmpty())
}
