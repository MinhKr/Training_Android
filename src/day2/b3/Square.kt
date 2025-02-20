package day2.b3

class Square(val side: Double, color: String) : Rectangle(side, side, color) {
    override fun getInfo(): String {
        return "Square - Color: $color , Side: $side , Area: ${calculateArea()} , Perimeter: ${calculatePerimeter()}"
    }
}