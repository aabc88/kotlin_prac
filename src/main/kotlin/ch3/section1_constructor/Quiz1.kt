package org.example.ch3.section1_constructor

class User {
    var name: String? = null
    var age: Int = 0

    constructor(name: String?, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String) : this(name, 0) {
        this.name = name
    }

    constructor() : this(null, 0)


    fun printUserInfo() {
        println("name: ${name}, age: ${age}")
    }
}

fun main() {
    val user = User()
    user.printUserInfo()

    val user2 = User("Kim")
    user2.printUserInfo()

    val user3 = User("Kim", 30)
    user3.printUserInfo()
}
