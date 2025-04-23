package org.example.ch2.section4_control

fun main() {
    val a = 1
    when (a) {
        1 -> println("$a == 1")
        2 -> println("$a == 2")
        else -> println("$a is neither 1 nor 2")
    }

    when (a) {
        10, 20, 30 -> println("10 20 30")
        40, 50 -> println("40 50")
        10 + 20 -> println("10+20")
    }

    when (a) {
        in 1..10 -> println("1..10")
        in 11..20 -> println("11..20")
    }

    val result = when(a) {
        1 -> "1"
        2 -> "2"
        else -> "none"
    }
}
