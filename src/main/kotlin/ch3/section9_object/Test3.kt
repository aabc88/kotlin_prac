package org.example.ch3.section9_object

interface SomeInterface{
    fun interfaceFun() {
        println("interfaceFun")
    }
}

open class SomeClass{
    fun someClassFun(){
        println("someClassFun")
    }
}

class Outer{
    //타입을 가지는 익명 클래스의 객체, 더이상 Any타입이 아니다
    //상위 타입 혹은 interface타입으로 이용하면 된다.
    val myInner: SomeClass = object: SomeClass(), SomeInterface{
        override fun interfaceFun() {
            super.interfaceFun()
        }
    }

    //객체명을 선언
    object MyObject {
        var no = 0
        fun myFun() {
            println("myFun")
        }
    }

    companion object MyObject2 {
        var no = 0
        fun myFun() {}
    }

    object AA: SomeClass() {

    }
}


fun main() {
    //타입을 가지는 익명클래스 객체
    val obj = Outer()
    obj.myInner.someClassFun()

    //객체명, 익명클래스 이용
    Outer.MyObject.no++
    Outer.MyObject.myFun()
    //Outer.MyObject 클래스가 아니고 객체임

    //companion
    Outer.no++
    Outer.myFun()




}
