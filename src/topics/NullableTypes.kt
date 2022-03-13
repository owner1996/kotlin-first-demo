package topics

fun main() {
    var a: String = "Hello"
//    a = null // NPE исключен
    println(a.length)

    var b: String? = "Test"

    b = null;

    println(b?.length)
}