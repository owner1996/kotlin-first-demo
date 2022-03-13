package topics

fun main() {
    println(sum1(4, 20));
    println(sum2(4, 20));
    println(sum3(4, 20));
    println("------------")

    sumPrint(4, 25)
    println(testString(3))

    testNamedArguments(1, 3, 5)
    println("------------")

    testDefaultArguments()
    testDefaultArguments(y = 3)
    testDefaultArguments(3)
    println("------------")

    printEvent(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printEvent(1,*intArrayOf(2,3,4,5,6),7,8)
}

// следующие три метода идентичны
fun sum1(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int): Int = x + y
fun sum3(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun sumPrint(x: Int, y: Int) {
    println(x + y)
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 3, y: Int = 5) {
    println(x + y)
}

fun printEvent(vararg nums: Int) {
    nums.forEach { n -> if (n % 2 == 0) println(n) }
}