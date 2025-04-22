package org.example.ch2.section2_variable_type

fun main() {
    val data1 = 10
    // val data2: Double = data1 //error
    // val data2: Double = data1 as Int //error
    //Double과 Inte는 클래스이다. 상하위관계가 아님
    //캐스팅 각 클래스의 함수를 사용해야함
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    //Int, Double등 숫자타입으로 표현되는 클래스의 상위는 Number
    val data4: Number = data1 //암시적 캐스팅
    val data5: Int = data4 as Int //명시적 캐스팅

    //Int<->String
    val data6: String = data5.toString()
    val data7: Int = data6.toInt()

}
