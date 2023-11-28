package io.github.aidenkoog.androidpractice.coroutine.section1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.system.*

fun simple4(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

//fun main() = runBlocking<Unit> {
//    val time = measureTimeMillis {
//        io.github.aidenkoog.androidpractice.coroutine.section1.simple().collectLatest {
//            value -> println("started")
//            delay(300)
//            println(value)
//            println("completed")
//        }
//    }
//}