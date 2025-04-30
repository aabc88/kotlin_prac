package org.example.ch4.section1_lambda

//동일한 함수 타입이 여러번 사용이 된다면 편의성을 위해 타입 정의
typealias MyFunType= (Int) -> Boolean
typealias MyInt = Int

fun main() {
    var some = {no: Int -> println("some > $no")}
    some(10)
    //some = {arg: String -> println("some > $arg")}

    val some2 = {arg1: Int, arg2: Int ->
        println("some2 > $arg1, $arg2")
    }

    println(some2(20, 10))
    
    val some3= {
        println("some3")
        10*10
        10*10
    }

    some3()

    val some4: (Int, Int) -> Boolean = {arg1: Int, arg2: Int ->
        arg1 > arg2
    }

    val some5: MyFunType = {it > 10}
    var some6: (Int) -> Int = {arg1 -> arg1 * 10
    }


    class User(val name: String, val age: Int)
    val some8: (User) -> Int = {it.age}
}
