package org.example.ch2.section5_collection

fun main() {
    //arrayOf 함수로 배열 객체생성
    //배열 객체를 만들면서 바로 값을 주는 경우
    val array = arrayOf(10, "hello", true)//사이즈3, Any타입 > Array<Any>(3, )
    array[0] = 20
    array[2] = "world"
    println("${array[0]}, ${array[1]}")
    //Array 클래스의 객체임으로 배열의 데이터를 이용할 때 Array의 함수를 이용해서
    println("${array.size}, ${array.get(0)}")

    //배열을 선언할 때 제네릭으로 타입을 지정해서 그 타입의 데이터만 가능하게
    val array2 = arrayOf<Int>(10, 20, 30)

    //기초타입의 함수를 이용해서 배열을 만들어도됨
    val array3 = intArrayOf(10, 20, 30)
    val array4 = doubleArrayOf(10.0, 20.0, 30.0)

    //함수로 배여르이 사이즈만지정하고 이후에 데이터를 지정
    val array5 = arrayOfNulls<Int>(3)
    array5[0] = 10
    array5[1] = 20
    array5[2] = 30

    //Array 클래스의 객체를 직접 생성해서 배열 객체를 만드는 방법
    val array6 = Array<String>(3, { " " })
    val array7 = Array<Int>(3, { 0 })

    //{}함수
    val array8 = Array<Int>(3, { i -> i * 10 })
}
