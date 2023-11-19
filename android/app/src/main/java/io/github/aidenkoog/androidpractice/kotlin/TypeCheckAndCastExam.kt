package io.github.aidenkoog.androidpractice.kotlin

fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))

    cast("안녕")
    cast(10)

    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "몰라요"
        }
    }
}

// as, as? : 캐스팅 불가능 할 시 Null 반환
// ?: operation 활용도 가능
fun cast(a: Any) {
    val result = (a as? String) ?: "실패"
    println(result)
}

fun smartcast(a: Any): Int {
    return if (a is String) {
        a.length
    } else if (a is Int) {
        a.dec()
    } else {
        0
    }
}