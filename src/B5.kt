//Bài tập 5:
//Bài toán giải phương trình bậc 2 dùng để mô tả việc giải phương trình ax2 + bx + c = 0.
fun main() {
    println("Nhập hệ số a:")
    val a = readLine().toDouble()

    println("Nhập hệ số b:")
    val b = readLine().toDouble()

    println("Nhập hệ số c:")
    val c = readLine().toDouble()

    // Giải phương trình
    GiaiPhuongTrinh(a, b, c)
}

fun GiaiPhuongTrinh(a,b,c){
    if (a == 0.0) {
        println("Hệ số a không thể bằng 0.")
        return
    }

    var delta = b * b - 4 * a * c
    
}