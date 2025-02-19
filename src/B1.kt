//Bài tập 1:
//Viết chương trình mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
fun main() {
    var number: Int? = null
    while (number == null) {
        print("Nhap 1 so nguyen: ")
        var input = readln()
        number = input.toIntOrNull() //check số nguyen

        if (number == null) {
            println("Lỗi!")
        }
    }

    if (number >= 0) {
        println("Đây là số nguyên dương")
    } else {
        println("Đây là số nguyên âm")
    }
}