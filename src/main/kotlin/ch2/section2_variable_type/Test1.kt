package org.example.ch2.section2_variable_type.one


//변수선언과 초기화 테스트
//top level - 선언과 동시에 초기화 시켜야한다. default 초기화를 지원하지 않음.
//null safety
//경우에따라 변수를 선언하긴 하지만 초기값을 줄 수 없는 경우가 있다(lateinit, lazy)
val data1: Int = 1
var data2: Int = 2

class MyClass() {
    val data3: Int = 3
    var data4: Int = 4

    fun someFun() {
        //지역 변수에 한해선 선언과 동시에 초기화를 안해도됨
        //선언과 초기화를 다른 라인에서 가능
        val data5: Int
        var data6: Int


        data5 = 5
        data6 = 6
        val result = data5+data6
    }
}

fun main() {

}