package day1

//Bài tập 5:
//Bài toán giải phương trình bậc 2 dùng để mô tả việc giải phương trình ax2 + bx + c = 0.
fun main() {
    println("Nhập hệ số a:")
    val a = readLine()!!.toDouble()

    println("Nhập hệ số b:")
    val b = readLine()!!.toDouble()

    println("Nhập hệ số c:")
    val c = readLine()!!.toDouble()

    // Giải phương trình
    GiaiPhuongTrinh(a, b, c)
}

fun GiaiPhuongTrinh(a: Double, b: Double, c: Double) {
    if (a == 0.0) {
        println("Hệ số a không thể bằng 0.")
        return
    }

    var delta = b * b - 4 * a * c

    if (delta > 0) {
        val x1 = (-b + kotlin.math.sqrt(delta)) / (2 * a)
        val x2 = (-b - kotlin.math.sqrt(delta)) / (2 * a)
        println("Phương trình có hai nghiệm phân biệt: x1 = $x1, x2 = $x2")
    } else if (delta == 0.0) {
        val x = -b / (2 * a)
        println("Phương trình có nghiệm kép: x = $x")
    } else
        println("Phương trình vô nghiệm.")
}