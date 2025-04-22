package org.example.ch2.section3_function

fun main() {
    fun sayHello(name: String = "Lee", no: Int = 1) {
        println("Hello, $name! $no")
    }

    sayHello("Kotlin", 10)
    sayHello()
    sayHello(no = 100)
    sayHello("Hong")

    fun myFun(arg1: String, arg2: Int = 10, arg3: String = "hello", arg4: Int) {
        myFun("a", 20, "bb", 30)
        myFun(arg4 = 40, arg3 = "CC", arg1 = "dd", arg2 = 50)
        myFun("aa", arg4 = 20)
    }
}
