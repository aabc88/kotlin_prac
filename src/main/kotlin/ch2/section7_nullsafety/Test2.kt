package org.example.ch2.section7_nullsafety

fun main() {
    //일반객체 테스트
    class User
    val user1 = User()
    val user2: User? = user1
    println("user1 == user2 : ${user1 == user2}")
    println("user1 === user2 : ${user1 === user2}")

    val data1: Int = 1000
    val data2: Int = 1000
    val data3: Int? = 1000
    val data4: Int? = 1000

    println("data1 == data2 : ${data1 == data2}")
    println("data1 === data2 : ${data1 === data2}")

    //기초타입, nullable == 값, ===객체 ㅣㅂ교
    //자바 변형시 Integer객체로 변경되기 때문. 이를 boxing이라고 한다
    println("data3 == data4 : ${data3 == data4}")
    println("data3 === data4 : ${data3 === data4}")
}
