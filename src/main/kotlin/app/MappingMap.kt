package app

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "satu",
        2 to "dua",
        3 to "tiga"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValue = mapKeys.mapValues { it.value.uppercase() }
    println(mapValue)

}