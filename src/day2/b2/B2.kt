package day2.b2

import day2.b2.model.Circle

fun main() {
    val n: Int?
    println("Nhập số lượng hình tròn:")
    n = readlnOrNull()?.toInt()

    val circles = n?.let {
        Array(it) {
        println("Nhập bán kính của hình tròn thứ ${it + 1}:")
        val radius = readlnOrNull()!!.toDouble()
        Circle(radius)
    }
    }

    circles?.indices?.forEach { i ->
        val circle = circles[i]
        println("Hình tròn thứ ${i + 1}:")
        println("Đường kính: %.2f".format(circle.getDiameter()))
        println("Chu vi: %.2f".format(circle.getCircumference()))
        println("Diện tích: %.2f".format(circle.getArea()))
        println()
    }
}