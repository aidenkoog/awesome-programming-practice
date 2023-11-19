package io.github.aidenkoog.androidpractice.kotlin

// 코틀린
// Mutable, Immutable
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.addAll(listOf(7, 8, 9))
    println(list)

    val list1 = listOf(1, 2, 3, 4)
    println(list.joinToString("|"))
    val result = list1.map { it * 10 }.joinToString("/")
    println(result)

    val map = mapOf((1 to "Hello"), (2 to "Hello2"))
    val map1 = mutableMapOf((1 to "Hello"), (2 to "Hello2"))
    map1.put(3, "Hi")
    map1[4] = "Unknown"
    map1[100] = "HiHiHi"
    println(map1)

    val diverseList = listOf(1, "Hi", 1.789, true)

}

