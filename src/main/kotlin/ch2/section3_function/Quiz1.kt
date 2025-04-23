package org.example.ch2.section3_function

class Math() {
    fun plus() = 0
    fun plus(no1: Int) = no1
    fun plus(no1: Int, no2: Int) = no1 + no2
    fun plus(no1: Int, no2: Int, no3: Int) = no1 + no2 + no3
}

fun main() {
    val math = Math()
    println(math)
    println(math.plus(10))
    println(math.plus(10, 20))
    println(math.plus(10, 20, 30))
}
