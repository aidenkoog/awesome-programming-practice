package io.github.aidenkoog.androidpractice.kotlin_intermediate

fun main() {
    val person = Person("kdjfd", 15)
    val dog = Dog("dfjkddkjf", 15)

    println(person.toString())
    println(dog.toString()) // == println(dog)
    println(dog.copy(age = 3))
    println(dog) // toString 안해도 값 출력됨.

    // Cat이 abstract 가 아니고 sealed class 이면 else 불필요
    // 컴파일러는 cat이 어떤 자식들을 가지고 있는지 알 수 있으므로 else 불필요.
    // 그리고 상속받은 자식이 있는데 when에 작성하지 않으면 컴파일 에러를 낼수있음.
    // 리싸이클러뷰 뷰 타입 분기때도 자주 사용됨. 실제 내가 구현할 때도 자주 사용했었음.
    // 뷰 타입은 else가 의미가 없으므로.
    val cat: Cat = BlueCat()

    // Sealed class 는 when 과 함께 쓸때 장점.
    val result = when (cat) {
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        is WhiteCat -> "white"
//        else -> "none"
    }
    println(result)
}

class Person(
    val name: String,
    val age: Int,
)

// toString(), hashCode, equals, copy 메소드 자동 생성, 상속 불가, 1개 이상 프로퍼티 필요
// 자바로 변경해보면 final String name  이러한 식으로 구현됨
//class Cat
data class Dog(
    val name: String,
    val age: Int,
) {
    override fun toString(): String {
        return "Myself: $name, $age"
    }
}

// 상속이 불가능한 이유는 4가지 메소드가 자동으로 생성되는데 상속을 하게 되면 그 메소드를 어떻게 사용할지에 대해 알 수가 없기 때문.
// error
//data class Corgi(
//    val prety: Boolean = true
//) : Dog()

// sealed class (abstract class)
//abstract class Cat
sealed class Cat // <--- 에러 핸들링, 리사이클러뷰 뷰타입
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()