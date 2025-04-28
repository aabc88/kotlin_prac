package org.example.ch3.section4_override

open class Shape {
    open fun draw() {
        println("Shape draw")
    }
}

open class Rect: Shape(){
    override fun draw() {
        super.draw()
        println("Rect draw")
    }
}

class RoundRect: Rect() {
    override fun draw() {
        super.draw()
        println("RoundRect draw")
    }
}

fun drawing(obj: Shape) = obj.draw()

fun main() {
    val roundRect = RoundRect()
    roundRect.draw()
}
