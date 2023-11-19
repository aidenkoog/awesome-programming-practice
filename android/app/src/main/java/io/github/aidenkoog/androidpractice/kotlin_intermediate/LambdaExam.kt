package io.github.aidenkoog.androidpractice.kotlin_intermediate

fun main() {
    // 1. 익명 함수
    // 2. 변수처럼 사용되서, 함수의 아규먼트가 될수가 있고 리턴이 될수도 있음
    // 3. 한 번 사용되고, 재사용되지 않는 함수

    val a = fun() { println() }
    val b: (Int, Int) -> Int = { a, b -> a * b }
    // 맨 마지막 줄이 리턴값이 됨.
    val b2: (Int) -> Int = { it * 10 }
    val d = { i: Int, j: Int -> i * j }
    val f: (Int, String, Boolean) -> String = { _, b, _ -> b }

    println(a)
    println(b)
    println(b2)

    println(a())
    println(b(2, 3))
    println(b2(10))
    println(d(2, 2))
    println(f(2, "왜", true))

    val result = hello(10, b2)
    println(result)
    println(result(3))
}

fun hello(a: Int, b: (Int) -> Int): (Int) -> Int {
    println(a)
    println(b(20))
    return b
}