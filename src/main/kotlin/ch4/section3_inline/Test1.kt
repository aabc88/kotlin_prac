package org.example.ch4.section3_inline

fun myFun1(argFun: (Int) -> Int): Int {
    return argFun(10)
}

inline fun myFun2(argFun: (Int) -> Int): Int {
    return argFun(10)
}

fun testFun() {
    myFun1 { it * 10 }
    myFun1 { it * 20 }
}

fun some1(fun1: (Int, Int) -> Int, fun2: (Int) -> Int): Int {
    val result1 = fun1(10, 20)
    val result2 = fun2(result1)
    println("some1")
    return result2
}

inline fun some2(fun1: (Int, Int) -> Int, fun2: (Int) -> Int): Int {
    val result1 = fun1(10, 20)
    val result2 = fun2(result1)
    println("some2")
    return result2
}

//나 자신을 리턴시켜라
fun localReturnTestFun() {
    var result = some1({ arg1, arg2 -> arg1 * arg2 }) { result ->
        if (result < 0) return@some1 0
        else return@some1 result + 10
    }
    println("some1 result : $result")

    result = some2({ arg1, arg2 -> arg1 * arg2 }) { result ->
        if (result < 0) return@some2 0
        else return@some2 result + 10
    }
    println("some2 result : $result")
}

fun nonLocalReturnTest(): Int {
    some1({ arg1, agr2 -> arg1 * agr2 }) { result ->
        if (result < 0) return@some1 0
        else return@some1 result + 10
    }

    some2({ arg1, agr2 -> arg1 * agr2 }) { result ->
        if (result < 0) return 0
        else return result + 10
    }
    return 0
}

fun main() {
    testFun()
    localReturnTestFun()
}
