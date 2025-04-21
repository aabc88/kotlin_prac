package org.example.ch2.section1_file_package

//kotlin의 entry point
var sum = 0

fun calSum() {
    for (i in 1..10) {
        sum += i
    }
}

class User {
    val name = "kim"
    fun sayHello() {
        println("hello $name")
    }
}

fun main() {
    //kotlin은 라인 끝을 표현하는 ;을 강제하지 않음.
    println("Hello World")
    calSum()

    //kotlin에서 객체 생성 시 new연산자는 제공하지 ㅇ낳음.
    User().sayHello()

}

//kotlin코드가 java class로 컴파일 되어 JVM에 의해 실행됨
//class User { ~ } 부분은 컴파일에 의해 User.class 파일이 만들어져서 이용된 것으로 예상
//sum, calSum(), main() 함수 부분이 자바로 컴파일 되었을때 클래스로 묶지 않았는데
//어떻게 build error및 runtime error가 발생하지 ㅇ낳았는가 ?
//JVM으로 돌릴려면 무조건 클래스로 묶어야 가능한데

//kotlin코드내에 특정 클래스로 묶이지 않은 부분은
//java로 컴파일할 때 파일명Kt.java로 묶어서 컴파일 되며 파일명Kt.java 내에 static member로 자동 추가된다.
