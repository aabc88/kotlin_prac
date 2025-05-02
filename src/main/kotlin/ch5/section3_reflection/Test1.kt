package org.example.ch5.section3_reflection

import kotlin.reflect.KFunction

fun myFun(no: Int, name: String): Boolean {
    return true
}

//reflection기법으로 넘어온 함수 호출
fun reflectionFun(argFun: KFunction<*>) {
    print("${argFun.name}")
    //매개변수 정보
    val parameters = argFun.parameters
    println("(")
    for (parameter in parameters) {
        println("${parameter.name} : ${parameter.type}")
    }
}

fun main() {
    reflectionFun(::myFun)
}
