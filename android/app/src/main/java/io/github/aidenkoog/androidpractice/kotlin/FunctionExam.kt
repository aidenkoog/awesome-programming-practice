package io.github.aidenkoog.androidpractice.kotlin

// ctrl + shift + R
fun main() {
    println("Hello world!!")
    val result = test(1, c = 5)
    test2(name = "AidenKooG", nickname = "Aiden", id = "AidenKooG")
    println(result)
    println(times(1, 3))
    println(times2(1, 3))
}

// Function
// unnecessary overloading function.
// can omit Unit type.
fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a + b)
    return a + b
}

// Single expression.
fun test2(name: String, nickname: String, id: String) = println(name + nickname + id)

fun times(a: Int, b: Int) = a * b
fun times2(a: Int, b: Int): Int {
    return a * b
}