package io.github.aidenkoog.androidpractice.coroutine.section1

import kotlinx.coroutines.flow.*

fun log2(msg: String) = println("[$(Thread.currentThread().name)] $msg")

fun simple2(): Flow<Int> = flow {
    log("flow started !")
    for (i in 1..10) {
        emit(i)
    }
}

//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.IO) {
//        io.github.aidenkoog.androidpractice.coroutine.section1.simple().collect {
//            value -> log("$value is to be logged!")
//        }
//    }
//}