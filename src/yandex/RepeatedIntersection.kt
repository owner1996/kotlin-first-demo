package yandex

import java.util.*

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 2, 0)
    val arr2 = intArrayOf(5, 1, 2, 7, 3, 2)
    println(repeat(arr1, arr2).contentToString())
}

fun repeat(arr1: IntArray, arr2: IntArray): IntArray {
    var result = mutableListOf<Int>();

    for (item in arr1) {
        if (item in arr2) {
            result.add(item)
        }
    }
    return result.toIntArray();
}

// commit 23:24