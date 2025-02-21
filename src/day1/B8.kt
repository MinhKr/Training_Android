package day1

//Bài tập 8:
//Viết chương trình nhập từ bàn phím 2 số a, b và một ký tự ch. Nếu (dùng Switch-case):
//− ch là ‘+’ thì thực hiện phép tính a + b và in kết quả lên màn hình.
//− ch là ‘–’ thì thực hiện phép tính a - b và in kết quả lên màn hình.
//− ch là ‘*’ thì thực hiện phép tính a * b và in kết quả lên màn hình.
//− ch là ‘/’ thì thực hiện phép tính a / b và in kết quả lên màn hình.
//- ch là kí tự khác thì in ra: không hợp lệ
fun main() {
    print("Nhap a: ")
    val a = readln().toDouble()
    print("Nhap b: ")
    val b = readln().toDouble()
    print("Nhap ch: ")
    val ch = readln().firstOrNull()

    Excute(a, b, ch!!)
}

fun Excute(a: Double, b: Double, ch: Char) {
    var result = when (ch) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> "khong hop le"
    }
    println(result)
}