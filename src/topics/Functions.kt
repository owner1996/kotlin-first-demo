package topics

fun main() {
    println(sum(4, 20));
    sumPrint(4, 20)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun testString (x: Int): String {
    return "String is $x"
}

fun sumPrint(x: Int, y: Int) {
    println(x + y)
}