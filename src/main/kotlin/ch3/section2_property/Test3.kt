package org.example.ch3.section2_property

fun main() {
    //프로퍼티 선언과 동시에 초기화 시킬 수 없는 경우
    //경우1 - nullable로 선언하고 null로 초기화
    class User1 {
        var data1: String? = null
        val data2: Int? = null
    }

    //경우2 - init에서 초기화 시키는 경우
    //클래스멤버에 한해서 가능하다. 클래스 멤버는 객체 생성한 후에 이용 가능
    //객체 생성하면 init은 무조건 실행된다. 즉 이용 될 때 초기화 되어있다.
    class User2 {
        val data1: String
        val data2: Int

        init {
            data1 = "kim"
            data2 = 10
        }
    }

    //경우3 - 생성자 body에서 초기화 시키는 경우
    class User3 {
        var data1: String
        var data2: Int

        constructor() {
            data1 = "kim"
            data2 = 10
        }
    }

    //경우4 - lateinit으로
    class User4 {
        lateinit var data1: String

        //lateinit var data2: Int //error기초타입객체는 추가 불가
        //lateinit var data3: String? //error nullable에 사용불가

    }
}
