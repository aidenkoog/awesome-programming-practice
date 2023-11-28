package io.github.aidenkoog.androidpractice.coroutine.section1

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.delay
import kotlin.random.Random

suspend fun getRandom1(): Int {
    delay(1000L)
    return Random.nextInt(0, 500)
}

suspend fun getRandom2(): Int {
    delay(1000L)
    return Random.nextInt(0, 500)
}

//fun main() = runBlocking {
//    val elapsedTime = measureTimeMillis {
//        val value1 = io.github.aidenkoog.androidpractice.coroutine.section1.getRandom1()
//        val value2 = io.github.aidenkoog.androidpractice.coroutine.section1.getRandom2()
//        println("${value1} + ${value2} = ${value1 + value2}")
//    }
//    println(elapsedTime)
//}