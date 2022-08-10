package app

class PropertiesMap(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {

    val application = PropertiesMap(mapOf(
        "name" to "Kotlin App",
        "Version" to 1
    ))

    println(application.name)

}