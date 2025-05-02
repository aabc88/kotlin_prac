package org.example.ch5.section1_extension

class Test1 {
    val data: Int = 10
    fun myFun() {
        println("myFun")
    }
}

//확장위치 상관없고 다른 파일도가능

//프로퍼티 확장
//val Test1.ExtensionData = 10//error

//val Test1.extensionData
//    get() = field //error

var Test1.extensionData: Int
    get() = 20
    set(value) {
        //일반적으로 확장 대상이 되는 클래스에 선언된 다른 멤버 활용 로직
    }

//MutableList 클래스가 있다. 이 클래스로 마지막 항목을 추출하는 일이 빈번하다
//맨 마지막 항목을 지칭하는 프로퍼티가 있으면 좋겠다.

var <T> MutableList<T>.lastItem: T
    get() = this.last()
    set(value) {
        this[this.size - 1] = value
    }

fun Test1.extensionFun() {
    println("extensionFun")
}

fun main() {
    val obj = Test1()
    println("${obj.data}, ${obj.extensionData}")
    obj.myFun()
    obj.extensionFun()

    val list = mutableListOf(10,20)
    println(list.lastItem)
}
