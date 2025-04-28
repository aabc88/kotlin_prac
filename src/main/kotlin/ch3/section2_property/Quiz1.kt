package org.example.ch3.section2_property

class QuizUser {
    private var firstName: String = ""
    private var lastName: String = ""

    var age: Int = 0
        get() = field
        set(value) {
            if (value > 0)
                field = value
            else
                throw IllegalArgumentException("나이는 음수가 될 수 없습니다.")
        }

    var password: String = ""
        get() = field
        set(value) {
            if (value.isNotEmpty() && value.length > 8)
                field = value
            else
                throw IllegalArgumentException("8자 이상의 패스워드가 필요합니다.")
        }

    val isAdult: Boolean
        get() = age >= 18

    val fullName: String
        get() = "$firstName $lastName"

    fun isAdult(): Boolean {
        return age >= 18
    }
    fun getFullName(): String {
        return "$firstName $lastName"
    }

    fun setFirstName(name: String) {
        if (name.isNotEmpty())
            firstName = name
    }

    fun setLastName(name: String) {
        if (name.isNotEmpty())
            lastName = name
    }

}

fun main() {
    val user = QuizUser()
    user.age = 10
    user.setLastName("홍")
    user.setFirstName("길동")
    println(user.isAdult())
    println(user.getFullName())
}



