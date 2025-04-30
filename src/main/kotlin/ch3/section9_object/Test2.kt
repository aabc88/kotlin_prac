/*
package org.example.ch3.section9_object

class Outer{
    private var no = 10

    //클래스 선언과 동시에 객체 생성한 것, 익명 클래스이다.
    val myInner = object {
        var innerData = 0
        fun innerFun() {
            innerData++
            no++ //outer 멤버 이용 가능
        }
    }

    fun outerFun() {
        //이름이 없다. 객체가 타입이 없을 수 는 없고
        //Any타입의 객체로 인지되며 Any에는 innerData가 없음
        //myInner.innerData++ // error
        //myInner.innerFun() //error
    }
}

class Outer2{
    private var no = 10
    //private로 선언하면 outer에서 익명 객체 멤버 참조가능
    //컴파일러가 내부적으로 이름을 가지는 새로운 클래스를 만들고 그 클래스 내에 포함시켜서
    //타입으로 표현되게 코드를 구성해줌.

    //클래스 선언과 동시에 객체 생성한 것, 익명 클래스이다.
    private val myInner = object {
        var innerData = 0
        fun innerFun() {
            innerData++
            no++ //outer 멤버 이용 가능
        }
    }

    fun outerFun() {
        //이름이 없다. 객체가 타입이 없을 수 는 없고
        //Any타입의 객체로 인지되며 Any에는 innerData가 없음
        myInner.innerData++ //private일 경우 사용 가능
        myInner.innerFun() //
    }
}
*/
