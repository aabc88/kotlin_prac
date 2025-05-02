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

val Test1.extensionData: Int
    get() = 20
