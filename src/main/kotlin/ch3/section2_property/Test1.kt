package org.example.ch3.section2_property

fun main() {
    class User1 {
        var name: String = "Kim"
        val age: Int = 20
    }

    val user1 = User1()
    user1.name = "Lee"
    println("name:${user1.name}, age:${user1.age}")


    //위의 코드는 아래와 같다
    class User2 {
        var name: String = "kim"
            get() = field
            set(value) {
                field = value
            }
        val age: Int = 20
            get() = field

    }

    var user2 = User2()
    user2.name = "lee"
    println("name:${user2.name}, age:${user2.age}")

    class User3 {
        var name: String = "kim"
            get() = field.uppercase()
        val age: Int = 20
    }

    val user3 = User3()
    user3.name = "lee"
    println("name:${user3.name}, age:${user3.age}")
}

//custom accessor를 추가할때 field를 사용하지 않으면
//자바로 변형될 때 변수가 선언되지 않음
//field를 사용하지 않으면 property 선언에서 초기값을 줄 수 없음

//val data1 = "aaa"
//    get() = "lee"
