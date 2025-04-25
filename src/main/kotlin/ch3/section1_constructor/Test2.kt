package org.example.ch3.section1_constructor

fun main() {

    class User {
        //보조생성자 선언되면 컴파일러에 의해 주생성자는 추가가 안됨
        //개발자가 따로 추가할 수 있음.
        //생성자도 body가 없다면 {}생략가능
        constructor(name: String)
    }

    class User2 {
        constructor()
        constructor(name: String)
        constructor(name: String, age: Int)
    }

    class User3 {
        init {
            println("init")
        }

        constructor() {
            println("constructor")
        }
    }

    User3()

    class User4() {
        //부생성자는 var, val를 추가해 멤버변수로 만들 수 없음
        //constructor(val name: String){} error
    }
}
