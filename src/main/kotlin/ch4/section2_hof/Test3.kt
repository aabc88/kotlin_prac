package org.example.ch4.section2_hof

fun main() {
    class User() {
        var name: String? = null
        var age: Int? = null

        constructor(name: String?, age: Int) : this() {
            this.name = name
            this.age = age
        }

        fun sayHello() = println("Hello, $name!")
        fun sayInfo() = println("name: $name, age: $age")
    }

    //User 객체의 멤버에 반복적으로 접근해야 한다
    val user = User()
    user.name = "Kim"
    user.age = 30
    user.sayHello()
    user.sayInfo()

    //run 이용 > 결과값을 그대로 받음
    val runResult = user.run {
        name = "lee"
        age = 40
        sayHello()
        sayInfo()
    }
    println(runResult.hashCode())
    println("-----------------------------------------------")

    //apply이용 > 결과값을 새로운 객체로 적용
    val applyResult = user.apply {
        name = "park"
        age = 50
        sayHello()
        sayInfo()
    }
    println(applyResult.hashCode())
    println("-----------------------------------------------")

    //with이용
    val withResult = with(user) {
        name = "lee"
        age = 40
        sayHello()
        sayInfo()
    }
    println(withResult.hashCode())
    println("-----------------------------------------------")
}
