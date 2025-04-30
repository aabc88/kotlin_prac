package org.example.ch3.section10_value

@JvmInline
value class Id(val Id: String)

/*
@JvmInline
value class Id2() // error 프로퍼티가 하나 무조건 있어야함

@JvmInline
value class Id3(val Id: String, val no: Int) //error 프로퍼티는 하나만

@JvmInline
value class Id4 { //프로퍼티는 주 생성자에만, 클래스 바디나 보조 생성자엔 선언 x
    val value = 10
}

 */

@JvmInline
value class Id2(val Id: String) {
    init {
        println("hello")
    }

    constructor(arg: Int) : this("kim")

    fun someFunc() {}
}


fun sayHello(id: Id) {
    println("Hello ${id.Id}")
}


fun main() {
    sayHello(Id("Lee"))
}
