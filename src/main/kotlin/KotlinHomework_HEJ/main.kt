package org.example.KotlinHomework_HEJ

fun main() {
    val user = User("홍길동", "010-1234-5678", MembershipLevel.VIP)

    println(user.membershipLevel.getDescription())
}
