package day1

//Bài tập 3:
//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
fun main() {
    println("Nhap 3 so thuc: ")
    var a = readln()
    var b = readln()
    var c = readln()

    var canh1 = a.toDouble()
    var canh2 = b.toDouble()
    var canh3 = c.toDouble()

    if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0) {
        println("Khong phai 3 canh cua 1 tam giac")
    } else if (canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh3 <= canh1) {
        println("Khong phai 3 canh cua 1 tam giac")
    } else {
        val sides = listOf(canh1, canh2, canh3).sorted()
        val side1 = sides[0]
        val side2 = sides[1]
        val side3 = sides[2]
        if (side1 * side1 + side2 * side2 == side3 * side3) {
            println("Tam giac vuong")
        } else
            println("Khong phai tam giac vuong")
    }


}