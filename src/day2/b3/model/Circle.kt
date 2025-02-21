package day2.b3.model

class Circle(val radius: Double, color: String) : Shape(color) {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun getInfo(): String {
        return "Circle: ${super.getInfo()}, Radius: $radius, Area: ${calculateArea()}, Perimeter: ${calculatePerimeter()}"
    }
}