package io.github.aidenkoog.androidpractice.kotlin_intermediate

fun main() {
    //  기존에 정의되어 있는 클래스에 함수를 추가하는 기능
    Test().hello()
    val test = Test()
    test.hi() // 커스텀을 위한 상속이 불필요
}

fun Test.hi() = print("Hihihi")

open class Test() {
    fun hello() = println("안녕")
    fun bye() = println("Goodbye")
}

class CustomText: Test() {

}
