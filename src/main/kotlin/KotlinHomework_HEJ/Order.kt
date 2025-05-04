package org.example.KotlinHomework_HEJ

import org.example.KotlinHomework_HEJ.status.OrderStatus
import org.example.KotlinHomework_HEJ.status.PaymentMethod

class Order(val user: User, val product: Product, val paymentMethod: PaymentMethod, val orderStatus: OrderStatus) {
    fun calculateSubtotal() {

    }

    fun printOrderDetails() {
        println(
            "고객정보 :\n" +
                    "이름 : ${user.name} (${user.membershipLevel.label}(${user.membershipLevel.discountRate * 100}%할인))," +
                    " 연락처: ${user.phone}\n\n" +
                    "주문상품 :\n" +
                    "상품명 : ${product.title}, 단가 : ${product.price}\n\n" +
                    "결제정보 :\n" +
                    "결제 방법 : ${paymentMethod.label} - 수수료 ${paymentMethod.fee}\n" +
                    "결제 상태 : ${orderStatus.status}\n" +
                    "결제 금액 : ${(paymentMethod.calculateFee(product.price)) * (1.0 - user.membershipLevel.discountRate)}"
        )
    }
}
