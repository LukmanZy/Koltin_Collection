package app

fun main() {

    val map: Map<String, String> = mapOf(
        "a" to "Lukman",
        "b" to "Zyan",
        "c" to "hakim"
    )

    println(map.size)
    for ((key, value ) in map){
        println("$key to $value")
    }

    val mapMutable: MutableMap<String, String> = mutableMapOf()
    mapMutable.put("a", "Lukman")
    mapMutable["b"] = "zyan"
    mapMutable["c"] = "hakim"

    mapMutable.remove("b")

    println(mapMutable["a"])
    for ((key, value ) in mapMutable){
        println(" $key to $value")
    }

    println(map.getOrDefault("d","maaf tidak ada"))
}