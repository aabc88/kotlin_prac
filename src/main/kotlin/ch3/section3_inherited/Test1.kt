package org.example.ch3.section3_inherited

open class Shape {
    var x = 0
    var y = 0

    fun draw() {

    }
}

class Rect: Shape() {
    var width = 0
}


fun main() {
    val obj = Rect()
    println("${obj.x}, ${obj.y}, ${obj.width}")
}

open class Super(name: String) {
    constructor(name: String, age: Int) : this(name)
}


//case1 - 주생성자만 선언된 경우
// 클래스 선언부분에서 상위 생성자 호출 구문 명시
class Sub: Super("a")
class Sub1: Super("a", 1)

//case2 - 보조생성자만 있는경우
//상위생성자 호출 구문을 보조 생성자의 선언영역에서
//주 생성자가 없다. 클래스 선언부분에서 상위생성자 호출구문을 추가할 수 없다.
class Sub2: Super{
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String) : super(name)
}

//case3 - 보조, 주 생성자 모두 선언된 경우
//자신의 주 생성자가 있다면 보조에서 바로 상위 호출 못한다.
//보조에서 주 생성자 호출시켜야
class Sub3(): Super("a") {
    constructor(name: String) : this()
    constructor(name: String, age: Int) : this()
}

//하위 객체 생성 시점에 상위 생성자는 무조건 호출되게
//보조 생성자에서 주 생성자가 있다면 주 생성자 호출
