package org.example.ch4.section2_hof

fun main() {
    //람다
    val fun1 = { x: Int ->
        println("hello, $x")
        //return x * 10//error
        x * 10
    }

    //익명함수
    val fun2 = fun(x: Int): Int {
        println("hello, $x")
        return x * 10 // ok
    }

    //한줄이라면 single expression function으로 선언 가능
    val fun3 = fun(x: Int): Int = x * 10

    //주로는 hof에서 이용
    fun hofFun(argFun: (Int) -> Int) {
        argFun(10)
    }

    hofFun(fun(x: Int): Int = x * 10)
}
