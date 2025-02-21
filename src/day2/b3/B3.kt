package day2.b3

import day2.b3.model.Circle
import day2.b3.model.Rectangle
import day2.b3.model.Square

fun main() {
    val rectangle = Rectangle(30.0, 40.0, "Red")
    val circle = Circle(35.0, "Blue")
    val square = Square(45.0, "Yellow")

    println(rectangle.getInfo())
    println(circle.getInfo())
    println(square.getInfo())
}