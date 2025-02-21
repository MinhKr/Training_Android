package day1

//Bài tập 2:
//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
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
    } else
        println("3 canh cua 1 tam giac")
}