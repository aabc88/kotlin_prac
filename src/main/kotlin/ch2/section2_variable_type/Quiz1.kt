package org.example.ch2.section2_variable_type

var javaScore: Int = 80
var pythonScore: Int = 90

fun main() {
    println("[교환 전]\njavaScore : $javaScore\npythonScore : $pythonScore\n-----------------")
    javaScore = pythonScore.also { pythonScore = javaScore }
    println("[교환 후]\njavaScore : $javaScore\npythonScore : $pythonScore\n-----------------")
}
