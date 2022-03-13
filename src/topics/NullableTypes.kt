package topics

fun main() {
    var a: String = "Hello"
//    a = null // NPE исключен
    println(a.length)

    var b: String? = "Test"

    b = if ((0..10).random() > 5) "a" else null
    println(b?.length ?: -1)
    println(b!!.length)
}