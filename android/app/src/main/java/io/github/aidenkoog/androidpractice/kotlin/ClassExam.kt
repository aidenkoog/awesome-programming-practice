package io.github.aidenkoog.androidpractice.kotlin

fun main() {
    val user = User("AIdenkoog")
    println(user.age)
    Kid("Child", 3, "male", "testExtra")
}

open class User(open val name: String, open var age: Int = 100)

class Kid(override val name: String, override var age: Int, var extra: String = "extra") : User(
    name, age
) {
    var gender: String = "female"

    // possible to be used when fragment has to be initialized.
    init {
        println("initializing...")
    }

    // secondary constructor.
    constructor(name: String, age: Int, extra: String, gender: String) : this(name, age, extra) {
        this.gender = gender
        println("secondary constructor.")
    }
}