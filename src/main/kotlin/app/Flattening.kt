package app

class Member (val name: String, val hobies: List<String>)

fun main() {
    val list1: List<List<String>> = listOf(
        listOf("Lukman", "Hakim", "Jaya"),
        listOf("Zyan", "Lenovo", "Wijaya")
    )

    val list2: List<String> = list1.flatten()
    println(list2)


    val member: List<Member> = listOf(
        Member("Lukman", listOf("Gaming", "Codding")),
        Member("Zyan", listOf("Reading", "Traveling"))
    )

//    val hobies = member.map { it.hobies }.flatten()
    val hobies: List<String> = member.flatMap { it.hobies }
    println(hobies)

}