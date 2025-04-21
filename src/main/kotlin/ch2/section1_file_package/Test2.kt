package org.example.ch2.section1_file_package

import org.example.ch2.section1_file_package.two.twoData
import org.example.ch2.section1_file_package.two.twoFun
import java.sql.Date
import java.sql.Date as Date2

fun main() {
    println(oneData)
    oneFun()

    println(twoData)
    twoFun()

    //아래처럼 Two.kt가 자바로 변형 시점에 TwoKt.class로 만들어지므로
    //아래처럼 사용 불가
    //TwoKt.twoData++;

    val date = Date2(System.currentTimeMillis())
    val date2 = Date(System.currentTimeMillis())
}