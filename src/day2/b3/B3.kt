package day2.b3

fun main() {
    val rectangle = Rectangle(5.0, 3.0, "Red")
    val circle = Circle(4.0, "Blue")
    val square = Square(4.0, "Yellow")

    println(rectangle.getInfo())
    println(circle.getInfo())
    println(square.getInfo())
}