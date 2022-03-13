package topics

fun main() {
    testWhen(55)
    testWhen(15)
    testWhen(5L)
}

fun testWhen(input: Any){
    when (input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        3 -> println("Тройка")
        in 10..30 -> println("От 10 до 30")
        is String -> println("Это строка ${input.length}")
        is Int -> println("Это число")
        else -> println("Что-то ещё")
    }
}