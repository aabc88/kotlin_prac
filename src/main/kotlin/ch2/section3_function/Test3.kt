package org.example.ch2.section3_function

//함수를 중위 표현식으로 사용하려면
//infix 예약어로 선언되어야 하며
//객체의 멤버 함수이거나 확장함수만 가능하다

class MyClass() {
    infix fun myFun(a: Int) = println("MyClass.myFun : $a")
}

infix fun MyClass.myFun2(a: Int) = println("myFun2 : $a")
infix fun Int.myFun3(x: Int) = println("myFun3 : $x")

fun main() {
    val obj = MyClass()
    obj.myFun(10)
    obj myFun 10

    obj.myFun2(20)
    val no = 10
    no.myFun3(20)
    no myFun3 30

    //가변인수
    fun someFun(arg1:Int, vararg arg2:Int) {
        for (i in arg2) {
            println(i)
        }
    }
    someFun(10, 20, 30)
}
