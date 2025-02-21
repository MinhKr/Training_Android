package day1

//Bài tập 6:
//Nhập vào tháng và năm, sau đó tính ra số ngày của tháng thuộc năm đã nhập.
fun main() {
    print("Nhap thang: ")
    val month = readln().toIntOrNull()
    print("Nhap nam: ")
    val year = readln().toIntOrNull()

    if (year == null || month == null || month !in 1..12) {
        println("Vui lòng nhập tháng và năm hợp lệ.")
        return
    }

    val daysInMonth = GetDaysInMonth(month, year)
    println("Thang $month nam $year co $daysInMonth ngay")
}

fun GetDaysInMonth(month: Int, year: Int): Int {
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (IsLeapYear(year)) 29 else 28
        else -> 0
    }

}

fun IsLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}