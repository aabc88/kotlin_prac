package org.example.ch2.section4_control

fun calcBonus(salary: Int, bonusRate: Double): String {
    if (salary <= 0 || bonusRate <= 0) return "잘못된 데이터를 입력했습니다."
    else return "지급받을 보너스는 ${(salary * bonusRate).toInt()}원 입니다."
}

fun main() {
    println(calcBonus(1000, 0.25))
}
