package io.github.aidenkoog.androidpractice.kotlin

fun main() {
    max(10, 3)
    isHoliday("금")
}

fun max(a: Int, b: Int) {
    // 코틀린에서는 식으로서 사용가능
    // 결과값으로 방출 가능, Expression으로 사용 가능
    // 자바에서는 조건식이 조건문으로 Statement
    // 코틀린에서는 자체가 식이고 Expression으로 값을 꺼낼수 있음

    val result = if (a > b) {
        println(a)
    } else {
        println(b)
    }
    // kotlin.Unit
    println(result)
    val result2 = if (a > b) {
        a
    } else {
        b
    }
    println(result2)
}

// 월 화 수 목 금 토 일
// Expression 식으로 사용할 때는 반드시 else 사용 필요
fun isHoliday(dayOfWeek: Any) {
    when (dayOfWeek) {
        "토", "일" -> if (dayOfWeek == "토") "Good" else "So good"
        in 2..4 -> {}
        in listOf("월", "화") -> {}
        else -> "Bad"
    }
}