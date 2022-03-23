package topics

import java.time.LocalDate
import java.time.LocalDateTime

fun main() {
    val list1 = listOf("String", "Non", "Hello")
    val list2 = list1.stream()
        .filter { x -> x.length > 3 }
        .toList()

    list2.forEach { it ->
        println(it)
//        обновление в моей ветке
    }
}