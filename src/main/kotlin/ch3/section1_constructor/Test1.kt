package org.example.ch3.section1_constructor

fun main() {
    //주생성자 선언
    //개발자가 명시적으로 생성자를 추가하지 않으면 컴파일러에 의해 주 생성자로 default생성자추가
    //주 생성자의 constructor는 생략 가능
    class MyClass
    class MyClass2()
    class MyClass3 constructor()

    val obj1 = MyClass()
    val obj2 = MyClass2()
    val obj3 = MyClass3()


    //생성자는 매개변수를 가질수 있다.
    class User1(name: String, age: Int = 0)

    var user1 = User1("kim", 10)
    user1 = User1("lee")

    //주 생성자의 실행 영역
    //class header에 추가됨으로 실행영역이 필요하면 init
    class User2(name: String, age: Int = 0) {
        init {
            println("init")
        }
    }

    var user2 = User2("kim", 10)
    user2 = User2("lee")

    class User3(name: String) {
        val data = name

        init {
            println("init: $name")
        }

        fun someFun() {
            println("someFun: $data")
        }
    }

    class User4(name: String, age: Int) {
        var myName: String
        var myAge: Int

        init {
            myAge = age
            myName = name
            println("init: $name $age")
        }
    }

    class User5(val name: String, val age: Int) {
        fun someFun() {
            println("someFun: $name $age")
        }
    }
}
