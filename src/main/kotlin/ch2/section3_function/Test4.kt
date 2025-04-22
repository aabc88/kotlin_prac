package org.example.ch2.section3_function

fun loopPrint(no: Int = 1) {
    var count = 0
    while (true) {
        println("hello")
        if (no == ++count) return

    }
}

tailrec fun tailRecPrint(no: Int = 1, count: Int = 1) {
    println("TrecP")
    return if (no == count) return else tailRecPrint(no - 1, count)
}

tailrec fun sum(n: Int) : Int {
    if (n < 0) return n
    else return n + sum(n-1)
}

fun main() {
    loopPrint(3)
    tailRecPrint(3)
    println(sum(3))
}
