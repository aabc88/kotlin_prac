package org.example.ch2.section2_variable_type

import kotlin.random.Random

//java 의 변수는 field
//kotlin 의 변수는 property
//기본 getter setter가 내장되지만, 원한다면 커스텀가능
//custom accessor라고 부름

val valData: Int
    get() {//getter
        return Random.nextInt(0, 100)
    }

//상수변수는 const 예약어로, 초기값 변경 불가능하며 항상 동일값으로만 이용
//const는 val만 가능
const val myConst = 10

class MyClass {
    //클래스 멤버변수를 const로 선언 불가
    //const val myConst3: Int = 10
}

fun main() {
    println(valData)
    println(valData)

}