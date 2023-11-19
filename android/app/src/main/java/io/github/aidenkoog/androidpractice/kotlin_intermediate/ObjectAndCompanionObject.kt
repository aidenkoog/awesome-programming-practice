package io.github.aidenkoog.androidpractice.kotlin_intermediate

import io.github.aidenkoog.androidpractice.kotlin_intermediate.Book.CustomName.NAME
import io.github.aidenkoog.androidpractice.kotlin_intermediate.Counter.count

fun main() {

    // 지역 변수로 사용 불가능
    //const val test = 0

    // val 은 지역변수로 활용 가능
    val test2 = 0

    println(count)
    Counter.countUp()
    println(count)
    Counter.countUp()
    Counter.hello()

    println(NAME)
    println(Book.CustomName.NAME2)

    Book.create()
}

// 에러 코드 정의 때 자주 사용
object Counter : Hello() {
    init {
        println("초기화....")
    }

    var count = 0
    fun countUp() {
        count++
    }
}

// open 해줘야 상속 가능.
open class Hello() {
    fun hello() = println("hello world !!!!!!!")
}

// Companion object
class Book {
    // == object Companion
    // 추가로 const 붙이는 것과 안 붙이는 것 차이?
    // const val 은 컴파일 타임에 값이 결정, val은 런타임에 결정
    // 따라서 const val 은 클래스의 멤버 변수로 활용 불가능, 상수 타입 선언/정의만 가능
    companion object CustomName {
        val NAME = "hello"
        const val NAME2 = "name"

        // 빌더 패턴으로 사용도 가능
        fun create() = Book()
    }
}

// object
// 싱글톤 쉽게 생성, 생성자 사용 불가능
// 프로퍼티, 메소드, 초기화 블록 사용 가능
// 다른 클래스 또는 인터페이스 상속 가능

// companion object
// static 동일 역할
// 클래스 내 하나만 생성 가능