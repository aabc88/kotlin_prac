package org.example.ch2.section5_collection

fun main() {
    val list1 = listOf("Hello", "world")
    val list2 = mutableListOf("Hello", "World")

    println("${list1.get(0)}, ${list2.get(1)}")
    println("${list2.get(0)}, ${list2.get(1)}")

    list2.add("aaa")
    list2.set(0, "bbb")

    //immutable 은 add(), set()함수가 없다. 추가 수정 불가능

    val map = mapOf(Pair("1","hello"), Pair("2","world"))
    println("${map["1"]}, ${map["2"]}")
    val map2 = mutableMapOf("1" to "hello", "2" to "world")
    map2["3"] = "aaa"

    val iterator = list1.iterator()
    val iterator2 = map.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }

    while (iterator2.hasNext()) {
        val entry = iterator2.next()
        println("${entry.key}, ${entry.value}")
    }
}
