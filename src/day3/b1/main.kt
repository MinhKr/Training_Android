package day3.b1

import day3.b1.model.Employee

fun main() {
    //Nhân viên 1
    print("Nhập họ NV1: ")
    val lastName1 = readln()
    print("Nhập tên NV1: ")
    val firstName1 = readln()
    print("Nhập số lượng sản phầm NV1: ")
    val productCount1 = readln().toIntOrNull() ?: 0
    val employee1 = Employee(lastName1, firstName1, productCount1)

    //Nhân viên 2
    print("Nhập họ NV2: ")
    val lastName2 = readln()
    print("Nhập tên NV2: ")
    val firstName2 = readln()
    print("Nhập số lượng sản phầm NV2: ")
    val productCount2 = readln().toIntOrNull() ?: 0
    val employee2 = Employee(lastName2, firstName2, productCount2)

    //Hiển thị thông tin
    println("Nhân viên 1: ")
    println("${employee1.firstName} ${employee1.lastName} : Lương = ${employee1.getSalary()}")
    println("Nhân viên 2: ")
    println("${employee2.firstName} ${employee2.lastName} : Lương = ${employee2.getSalary()}")

    //So sánh dùng hàm so sánh
    employee1.takeIf { it.isGreaterThan(employee2) }?.let {
        println("Nhân viên ${it.lastName} ${it.firstName} có nhiều sản phầm hơn.")
    } ?: println("Nhân viên ${employee2.lastName} ${employee2.firstName} có nhiều sản phầm hơn.")

    //So sánh không dùng hàm so sánh
    when {
        employee1.getProductCount(productCount1) > employee2.getProductCount(productCount2) ->
            println("Nhân viên ${employee1.lastName} ${employee1.firstName} có nhiều sản phầm hơn.")

        employee1.getProductCount(productCount1) < employee2.getProductCount(productCount2) ->
            println("Nhân viên ${employee2.lastName} ${employee2.firstName} có nhiều sản phầm hơn.")

        else ->
            println("Cùng số lượng sản phẩm")
    }

}

