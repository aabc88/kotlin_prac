package org.example.ch2.section4_control

import java.text.SimpleDateFormat

fun saySeason(date: String): String {
    val splitStr = date.split("-")
    var result = ""

    when (splitStr[1].removePrefix("0")) {
        "12", "1", "2" -> result = "겨울이군요"
        "3", "4", "5" -> result = "봄이군요"
        "6", "7", "8" -> result = "여름이군요"
        "9", "10", "11" -> result = "가을이군요"
    }
    return result
}

fun saySeason2(date: String): String {
    val dataFormat = SimpleDateFormat("yyyy-MM-dd")
    val parse = dataFormat.parse(date)
    val month = parse.month + 1
    var result = ""

    when (month) {
        12, 1, 2 -> result = "겨울이군요"
        3, 4, 5 -> result = "봄이군요"
        6, 7, 8 -> result = "여름이군요"
        9, 10, 11 -> result = "가을이군요"
    }
    return result
}

fun main() {
    println(saySeason("2024-04-30"))
    println(saySeason("2024-12-30"))

    println(saySeason2("2024-04-30"))
    println(saySeason2("2024-12-30"))
}
