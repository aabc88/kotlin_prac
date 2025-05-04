package org.example.KotlinHomework_HEJ

import org.example.KotlinHomework_HEJ.status.MembershipLevel
import org.example.KotlinHomework_HEJ.status.OrderStatus
import org.example.KotlinHomework_HEJ.status.PaymentMethod

fun main() {
    val user = User("홍길동", "010-1234-5678", MembershipLevel.GOLD)
    val product = Product("스마트폰", 850000.0)
    val order = Order(user, product, PaymentMethod.CREDIT_CARD, OrderStatus.PAID)

    order.printOrderDetails()
}
