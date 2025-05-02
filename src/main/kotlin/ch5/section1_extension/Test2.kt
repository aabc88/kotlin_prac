package org.example.ch5.section1_extension

open class Super {
    open fun superFun() {
        println("superFun")
    }
}

class Sub: Super() {
    var data = 20
    override fun superFun() {
        println("superFun sub")
    }

    fun some1(data: Int) {
        this.data = data
        superFun()
        super.superFun()
    }
}

fun Sub.some2(data: Int) {
    this.data = data
}

fun Super.sayHello() {
    println("Hello")
}

fun Sub.sayHello() {
    println("Hello Sub")
}


fun main() {
    val obj: Super = Sub()
    obj.superFun()
    obj.sayHello()
}

