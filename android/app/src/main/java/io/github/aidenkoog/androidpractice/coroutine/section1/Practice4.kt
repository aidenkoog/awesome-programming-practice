package io.github.aidenkoog.androidpractice.coroutine.section1

import kotlin.random.Random
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun flowSomething2(): Flow<Int> = flow {
    repeat(10) {
        emit(Random.nextInt(0, 100))
        delay(10L)
    }
}

//fun main() {
//    runBlocking {
//        io.github.aidenkoog.androidpractice.coroutine.section1.flowSomething().collect {
//            value -> println(value)
//        }
//    }
//}