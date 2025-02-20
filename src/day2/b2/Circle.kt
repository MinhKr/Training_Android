package day2.b2

data class Circle(var radius: Double) {
    val PI = 3.14

    fun getDiameter(): Double {
        return radius * 2
    }

    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun getArea(): Double {
        return PI * PI * radius
    }

    override fun toString(): String {
        return "Circle(radius=$radius)"
    }
}
