package org.example.ch3.section2_property

import org.example.ch2.section7_nullsafety.data2
import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("", {property, oldValue, newValue ->
        println("old : $oldValue -> new : $newValue")
    })
}
lateinit var data1: String

class T{
    lateinit var data2: String
    fun some() {
        //멤버변수를 이용해야한다. lateinit으로 선언되어있다.
        //초기화 된건지 확인하고 싶다.
        println(::data2.isInitialized)
    }

    //클래스 내부에 선언된 멤버변수가 lateinit으로 선언되어 있고
    //이 변수를 외부에서 이용한다면 외부에서 직접 초기화 된것인지 확인하는 방법은 없다.
    fun isData2Initialized(): Boolean = ::data1.isInitialized
}

fun main() {
    val user = User()
    user.name = "Kim"
    user.name = "Leo"

    val t = T()
    t.some()
    println(t.isData2Initialized())
    data1 = "hello"
    data2 = "world"
    println(t.isData2Initialized())
}
