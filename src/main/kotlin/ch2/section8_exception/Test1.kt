package org.example.ch2.section8_exception

fun some(arr: Array<Any>) {
    return try {
        val intData = arr[0] as Int
        val data: String = arr[2] as String
        val data2: Int = data.toInt()
    } catch (e: ClassCastException) {
        e.printStackTrace()
    } catch (e: IndexOutOfBoundsException) {
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun some2(arg: String): Int {
    return try {
        println("try")
        arg.toInt()
        10
    } catch (e: Exception) {
        println("exception")
        0
    } finally {
        println("finally")
        100
    }

}

fun main() {
    val arr = arrayOf<Any>("0", 1, "6")
    some(arr)
    val arr2 = arrayOf<Any>(1, "5")
    some(arr2)

    println(some2("2"))
}
