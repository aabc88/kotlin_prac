package org.example.ch2.section3_function

fun main() {
    fun sum(a: Int, b: Int): Int {
        var sum = 0

        //함수 내 함수선언이 가능함
        //함수 안에 선언했음으로 이 내부 함수는 outer함수의 local함수이다
        //outer에서 호출해서 이용하던가, 이함수를 외부에 리턴시키던가 해야함
        fun calSum() {
            for (i in a..b) {
                sum += i
            }
        }
        calSum()
        return sum
    }

    var result = sum(1, 10)
    println(result)

    //single expression function 한줄짜리 함수
    fun some(a: Int, b: Int): Int = a + b
    fun some2(a: Int, b: Int) = a + b

    //오버로딩 > 매개변수가 다르다면 호출되는 변수명은 같을 수 있다.
    fun myFun(a: String) {

    }

    fun myFun(a: Int) {

    }
}
