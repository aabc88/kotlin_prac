package org.example.ch3.section2_property

//by - 예약어
//뭔가의 행위를 위임시킬 때 쓰는 예약어 delegation pattern 구현을 도와주기 위해 만든 예약어


class User1{
    val name: String by lazy {
        println("name init")
        "Kim"
    }
    val age: Int by lazy {
        println("age init")
        20
    }

    init{
        println("init")
    }
}


fun main() {
    val user1 = User1()
    println("name before : ${user1.name}")
    println("age before : ${user1.age}")
}
