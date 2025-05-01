package org.example.ch4.section3_inline

inline fun test1(argFun1: (x: Int) -> Int, noinline argFun2: (x: Int) -> Int) {
    argFun1(10)
    argFun2(10)
}

open class TestClass {
    open fun some() {
    }
}

inline fun test2(crossinline argFun:() -> Unit){
    val obj = object : TestClass() {
        override fun some() = argFun()
    }
}

fun main() {
    test1({ it * 10 }, { it * 20 })
}
