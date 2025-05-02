/*
package org.example.ch5.section2_generic

//클래스를 선언한다 형식 타입으로
class MyClass<T, A>() {
    var data: A? = null
    fun myFun(arg: T): A? {
        return data
    }
}

//함수 선언시 형식타입
fun <T> someFun(arg: T): T? {
    return null
}

fun main() {
    val obj: MyClass<String, Int> = MyClass()
    obj.data = 10
    obj.myFun("Hello")?.plus(20)

    someFun(20)
    someFun("Hello")
}
*/
