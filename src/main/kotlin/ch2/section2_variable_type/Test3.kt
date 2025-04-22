package org.example.ch2.section2_variable_type

//코틀린의 모든 변수는 객체이다
val intData: Int = 10 //기초타입처럼 데이터를 삽입 했으나 Int클래스의 객체이다.
var result = intData.minus(2)

fun main() {
    result = intData.minus(1)

    val a1: Int = 123
    val a2: Long = 10L
    val a3: Double = 10.0
    val a4: Float = 10.0F
    val a5: Short = 10
    val a6: Byte = 1

    val a7 = 1_0000_0000_0000

    var str1 = "hello\nworld"
    var str2 = """
        hello
        world
        aaa
        bbb
    """

    println(str1)
    println(str2)

    fun sum(no: Int): Int {
        var sum = 0
        for (i in 1..no) {
            sum += i
        }
        return sum
    }

    val name = "홍길동"
    println("name : $name")
}