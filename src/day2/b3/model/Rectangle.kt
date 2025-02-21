package day2.b3.model

open class Rectangle(val length: Double, val width: Double, color: String) : Shape(color) {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculatePerimeter(): Double {
        return 2 * (length + width)
    }

    override fun getInfo(): String {
        return "Rectangle: ${super.getInfo()}, Length: $length, Width: $width, Area: ${calculateArea()}, Perimeter: ${calculatePerimeter()}"
    }
}