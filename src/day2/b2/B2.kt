package day2.b2

fun main() {
    val n: Int
    println("Nhập số lượng hình tròn:")
    n = readLine()!!.toInt()

    val circles = Array(n) {
        println("Nhập bán kính của hình tròn thứ ${it + 1}:")
        val radius = readLine()!!.toDouble()
        Circle(radius)
    }

    for(i in circles.indices){
        val circle = circles[i]
        println("Hình tròn thứ ${i + 1}:")
        println("Đường kính: %.2f".format(circle.getDiameter()))
        println("Chu vi: %.2f".format(circle.getCircumference()))
        println("Diện tích: %.2f".format(circle.getArea()))
        println()
    }
}