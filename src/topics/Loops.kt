package topics

fun main() {
    val items = listOf("apple", "banana", "orange")
    mutableListOf<String>("apple", "banana", "orange")

    for (item in items) {
        println(item)
    }

    println()

    var index = 0;
    while (items.size > index) {
        println("Item at $index is ${items[index]} ")
        index++
    }

    println(5 in 3..10)

    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }
    println()
    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 100 downTo 0 step 10) {
        println(i)
    }
}