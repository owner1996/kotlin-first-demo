package yandex

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val singleSet = setOf("Hello")

    singleSet.forEach { println(it) }
}

// коммит 23:23