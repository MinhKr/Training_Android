package day2.b3.model

open class Shape(val color: String) {
    open fun calculateArea(): Double {
        return 0.0
    }

    open fun calculatePerimeter(): Double {
        return 0.0
    }

    open fun getInfo(): String {
        return "Color: $color"
    }
}