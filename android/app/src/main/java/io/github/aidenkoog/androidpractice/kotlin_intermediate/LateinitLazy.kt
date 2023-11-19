package io.github.aidenkoog.androidpractice.kotlin_intermediate

lateinit var text: String

//lateinit var text3
lateinit var age: Integer  // Primitive 타입은 lateinit 사용 불가
val test: Int by lazy {
    println("initalizing..........")
    100
}

fun main() {
    var text2: String? = "name"
    text = "lateinitializing..."
//    text3 = "second_lateinitializing..."
//    age = 14  error 발생
    println(text)
    println(text2)

    println("lazy 테스트 !")
    println("initizligin...$test")
    println("second test: $test")
}