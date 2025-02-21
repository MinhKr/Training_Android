package day2.b1
import day2.b1.model.Product


fun main() {
    val management = SalesManagement()
    management.addCategory("C01", "Điện tử")
    management.addProduct("C01", Product("P01", "Điện thoại", 500.0, "Trung Quốc"))
    management.addProduct("C01", Product("P02", "Laptop", 1000.0, "Mỹ"))

    while (true) {
        println("\nChọn một tùy chọn:")
        println("1. Liệt kê sản phẩm theo danh mục")
        println("2. Cập nhật thông tin sản phẩm")
        println("3. Xóa sản phẩm")
        println("4. Hiển thị tổng giá trị hàng tồn kho")
        println("5. Thoát")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Nhập ID danh mục:")
                val categoryId = readLine() ?: ""
                management.listProductsByCategory(categoryId)
            }

            2 -> {
                println("Nhập ID sản phẩm:")
                val productId = readLine() ?: ""
                println("Nhập tên mới (hoặc nhấn Enter để bỏ qua):")
                val newName = readLine()?.takeIf { it.isNotEmpty() }
                println("Nhập giá mới (hoặc nhấn Enter để bỏ qua):")
                val newPrice = readLine()?.toDoubleOrNull()
                println("Nhập xuất xứ mới (hoặc nhấn Enter để bỏ qua):")
                val newOrigin = readLine()?.takeIf { it.isNotEmpty() }
                management.updateProduct(productId, newName, newPrice, newOrigin)
            }

            3 -> {
                println("Nhập ID sản phẩm:")
                val productId = readLine() ?: ""
                management.deleteProduct(productId)
            }

            4 -> management.totalCategoriesValue()
            5 -> {
                break
            }

            else -> println("Tùy chọn không hợp lệ. Vui lòng thử lại.")
        }
    }
}