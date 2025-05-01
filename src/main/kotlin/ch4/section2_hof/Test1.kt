package org.example.ch4.section2_hof


fun main() {
    //hof선언
    fun hofFun(x1: Int, argFun: (Int) -> Int) {
        val result = argFun(x1)
        println("$x1, $result")

    }

    hofFun(11, { x: Int -> x * x })
    //함수의 마지막 매개변수가 함수 일 경우 아래 처럼 밖에 함수를 정의해도 됨.
    hofFun(10) { x -> x * x }

    fun hofFun2(no: Int, argFun1: (Int) -> Int, argFun2: (Int) -> Boolean) {
        argFun1(10)
        argFun2(10)
    }

    //두개가 같음.
    hofFun2(10, { it * it }) { it > 10 }
    hofFun2(10, { it * it }, { it -> it > 10 })

    val array = arrayOf(10, 20, 15, 22, 8) //Array클래스타입
    array.filter { it > 10 }

    fun hofFun3(str: String): (x1: Int, x2: Int) -> Int {
        when (str) {
            "+" -> return { x1, x2 -> x1 + x2 }
            "-" -> return { x1, x2 -> x1 - x2 }
            "*" -> return { x1, x2 -> x1 * x2 }
            else -> return { x1, x2 -> x1 / x2 }

        }
    }

    val resultFun = hofFun3("*")
    println(resultFun(10, 20))


    //데이터를 필터링 하는 함수를 만들고 싶다.
    //필터링 알고리즘을 함수 개발자가 결정을 해버리면 그 필터링 함수는 그 알고리즘 대로만 필터링이 된다.
    //필터링은 내가한다. 필터링 알고리즘은 내가 결정하지 않고 외부에서 전달받음.
    fun myFilter(list: List<Int>, arg: (Int) -> Boolean): List<Int> {
        val resultList = mutableListOf<Int>()
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val no = iterator.next()
            val result = arg(no)
            if (result) resultList.add(no)
        }
        return resultList
    }
    val testList = listOf(10,20,3,6,1,12,15)
    myFilter(testList) {it > 11}.sorted().forEach { println(it) }
}
