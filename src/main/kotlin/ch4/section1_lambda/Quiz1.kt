package org.example.ch4.section1_lambda

typealias MyFun<T> = (Int, Int) -> T

class FunctionTest {
    val method1 = {
        println("method1 call")
    }

    val method2 = {
        "Hello World method2"
    }

    val method3: (Int) -> Int = {it ->
        (1..it).sum()
    }

    val method4: MyFun<Int> = { no1, no2 -> no1 + no2}

    val method5: MyFun<Int?> = { no1, no2 ->
        if(no2 == 0) null else (no1/no2)
    }
}


fun main() {
    val obj = FunctionTest()

    obj.method1()
    println(obj.method2())
    println(obj.method3(10))
    println(obj.method4(10, 20))
    println(obj.method5(10, 0))
    println(obj.method5(10, 2))
}
