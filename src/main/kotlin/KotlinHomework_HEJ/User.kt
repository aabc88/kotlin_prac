package org.example.KotlinHomework_HEJ

class User(val name: String, val phone: String, val membershipLevel: MembershipLevel) {
    fun getDiscountRate() = membershipLevel.discountRate
}
