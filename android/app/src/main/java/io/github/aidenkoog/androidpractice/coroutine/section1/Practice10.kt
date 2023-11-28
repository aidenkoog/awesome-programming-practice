package io.github.aidenkoog.androidpractice.coroutine.section1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun simple(): Flow<String> = flow {
    for (i in 1..3) {
        println("emitting $i")
        emit(i)
    }
}.map {
    value -> check(value <= 1) { "crashed $value !!!"}
    "string $value"
}

fun main() = runBlocking<Unit> {
    try {
        simple().collect { value -> println(value) }
    } catch (e: Throwable) {
        println("caught $e")
    }
}