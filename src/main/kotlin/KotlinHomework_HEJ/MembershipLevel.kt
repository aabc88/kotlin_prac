package org.example.KotlinHomework_HEJ

enum class MembershipLevel(val discountRate: Double, val label: String) {
    REGULAR(0.0, "일반회원"),
    SILVER(0.05, "실버회원"),
    GOLD(0.1, "골드회원"),
    VIP(0.2, "최고회원");

    fun getDescription() =
        "($label (${(discountRate*100).toInt()}%) 할인)"
}
