package org.example.ch2.section4_control

fun main() {
    val a = 5
    //단순 조건문 if
    if (a < 10) println("$a < 10")
    if (a > 0 && a <= 10) println("a > 0 && a <= 10")
    else if (a > 10 && a <= 20) println("a > 10 && a <= 20")
    else println("a > 20")

    //if를 expression으로
    //결과가 양산이 되고 그 결과를 어떤 변수에 대입, 함수 호출하면서 매개변수에 지정
    if (a > 10) "hello"
    val result = if (a > 10) "hello" else "world"
    println(result)

    //expression, 여러라인 작성 가능, 결과는 마지막 라인의 실행 결과
    val result2 = if (a < 10) {
        println("hello")
        10 + 10
    } else {
        println("world")
        20_20
    }

    val result3 = if (a > 20) 10
    else if (a > 30) 30
    else 40
}
