package org.example.org.example.KotlinHomework_HEJ

enum class PaymentMethod(val fee: Double, val label: String) {
    CREDIT_CARD(0.02, "신용카드 결제"),
    BANK_TRANSFER(0.01, "무통장 입금"),
    POINT(0.00,"포인트 결제");

    fun calculateFee(amount: Double) = amount * fee
    fun description() =

}
