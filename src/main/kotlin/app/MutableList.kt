package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf("Lukman")

    mutableList.add("zyan")
    mutableList.add("hakim")
    println(mutableList[0])
    println(mutableList)

    mutableList[0] = "ucup"
    println(mutableList)

    mutableList.remove("hakim")
    println(mutableList)
    mutableList.add("sks")
    mutableList.add("haduh")
    mutableList.add("ahh")
    mutableList.add("ingah")

    for((i, value) in mutableList.withIndex()){
        println(" $i. $value")
    }
}