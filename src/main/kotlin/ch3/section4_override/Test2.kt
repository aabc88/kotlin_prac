package org.example.ch3.section4_override

class Test {
    //변수 public, set/get - public
    var data1: String = "hello"
    //property와 다른 접근제한자를 setter에 지정 custom accessor만들고 추가
    var data2: String = "world"
        private set(value) {field = value}
        get() = field //get의 접근제한자는 public 고정
}

fun main() {
    val obj = Test()
    println("${obj.data1} ${obj.data2}")
    obj.data1 = "aaa"
    //obj.data2 = "bbb"//error
}
