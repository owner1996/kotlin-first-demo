package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { x -> println(x) }
    println(a.map { x -> x * 2 })
    a.forEach { x -> println(x) }

    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sumq, e -> sumq + e })

    val nums = listOf(1,-2,3,-4,5,-6,7)

    val (positive, negative) = nums.partition { it > 0 }

    println(positive)
    println(negative)
}