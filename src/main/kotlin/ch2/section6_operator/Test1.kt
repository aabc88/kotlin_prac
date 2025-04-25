package org.example.ch2.section6_operator

fun someFun(vararg a: String) {
    val iterator = a.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

class MyClass() {
    var no = 0
    //operator fun puls(arg: Int): Int {
      //  return no - arg
    //}
}

//operator fun MyClass.Minus(arg: Int): Int {
//    return no + arg
//}

fun main() {
    val array = arrayOf("a", "b", "c")
    someFun("one", *array, "two", "three")

    val list = listOf("a", "b", "c")
    someFun("one", *list.toTypedArray(), "two", "three")
}
