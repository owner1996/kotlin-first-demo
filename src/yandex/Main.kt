package yandex

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val jobs = List(100_000){
        launch {
            delay(1000)
            println(".")
        }
    }
    jobs.forEach{ it.join() }
}