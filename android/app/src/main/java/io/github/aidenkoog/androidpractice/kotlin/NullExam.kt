package io.github.aidenkoog.androidpractice.kotlin

fun main() {
    var name: String = "AidenKooG"
    var number: Int = 10

    var nickname: String? = "Hi"
    var secondNumber: Int? = null

    val result = if (nickname == null) {
        "Nodata"
    } else {
        nickname
    }

    val result2 = nickname ?: "Nodata"
    println(result2)

    nickname = null
    val size = nickname?.length
    println(size)
}