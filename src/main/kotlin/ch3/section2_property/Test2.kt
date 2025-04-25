package org.example.ch3.section2_property

fun main() {
    class User(name: String) {
        var name = name
    }
    val obj = User("Kim")
    obj.name = "lee"
    println(obj.name)
}
