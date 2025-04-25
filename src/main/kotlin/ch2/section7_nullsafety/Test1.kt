package org.example.ch2.section7_nullsafety

var data1: String = "kim"
var data2: String? = "kim"

fun main() {
    data2 = null

    //nullable이 non-null의 상위 타입이다.
    var data3: String? = data1 //String -> String? (암시적 캐스팅)
    data3 = data2

    var data4: String = data1
    //data4 = data2 //String -> String, Error 명시적 캐스팅을 해야함

    data2 = "kim"
    data4 = data2 as String//nullable -> non-null 명시적 캐스팅
    data2 = null
    data4 = data2 as String//as로 명시적 캐스팅을 하고 싶은데 data2가 null이면 어떻게 ?
    //runtime error
    data4 = data2 as String

    val data5: String? = data2 as? String
    val data6: String = data2 as? String ?: ""

    class User {
        var name: String? = null
    }

    val user: User? = User()
    println(user?.name?.length)

    user?.let {
        println("hello") ?: {
            println("world")
        }
    }

}
