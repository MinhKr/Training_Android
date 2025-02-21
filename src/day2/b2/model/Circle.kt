package day2.b2.model

data class Circle(var radius: Double) {
//    val PI = 3.14

    fun getDiameter(): Double {
        return radius * 2
    }

    fun getCircumference(): Double {
        return 2 * Math.PI * radius
    }

    fun getArea(): Double {
        return Math.PI * Math.PI * radius
    }

    override fun toString(): String {
        return "Circle(radius=$radius)"
    }
}
