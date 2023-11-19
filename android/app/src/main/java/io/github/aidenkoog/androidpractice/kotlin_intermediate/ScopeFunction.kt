package io.github.aidenkoog.androidpractice.kotlin_intermediate

fun main() {
    // let, run, apply, also, with
    // 1. let
    val a = 3
    a.let { }
    val user = User("hhh", 10, true)

    // 수신 객체.let { it -> // user ->
    //
    // 마지막 줄 리턴값
    // }
    val result = user.let { user ->
        user.name
    }
    println("user: $result")

    var user2: User? = User("ddhjd", 10000, false)
    val age = user2?.let {
        it.age
    }
    println(age)
    user2 = null
    println(user2)

    // run
    // receiver object. run { this ->
    //
    // 마지막 줄 리턴
    // }
    val kid = User("dhfjdhf", 4, false)
    val kidAge = kid.run {
        this.age // this 생략 가능, 4 print
    }
    println(kidAge)

    // apply
    // receiver. apply { this ->
    //
    // }
    // 리턴값이 수신 객체 자기 자신
    val kidName = kid.apply {
        name // io.github.aidenkoog.androidpractice.kotlin_intermediate.User@3b6eb2ec
    }
    println(kidName)

    val female = User("dhjfdhj", 232, true, true)
    println(female)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println(femaleValue)
    println(femaleValue.hasGlasses)

    // also
    // receiver.also { it -> } // local variable로 선언 가능
    // 수신 객체 자기 자신 리턴
    // apply, also 는 유사
    // also 는 로컬 변수 사용을 하므로 굳이 초기화때는 사용하지 않음 (로그가 필요할 때 사용)
    val male = User("dhfdjfh", 19, false, true)
    val maleValue = male.also { user ->
        user.name
        user.hasGlasses = false
    }
    println(maleValue)

    // with
    // with(수신객체) { this ->
    // ---
    // 마지막 줄 리턴
    // }
    val result2 = with(male) {
        hasGlasses = false
        true
    }
    println(result2)

}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean, // true = female
    var hasGlasses: Boolean = true,
)