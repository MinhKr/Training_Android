package day2.b1
import day2.b1.model.Category
import day2.b1.model.Product


class SalesManagement {
    val categoryList = mutableListOf<Category>()

    var checkProductId = false

    //Thêm danh mục
    fun addCategory(categoryId: String, categoryName: String) {
        categoryList.add(Category(categoryId, categoryName))
    }

    //Thêm sản phẩm
    fun addProduct(categoryId: String, product: Product) {
        val category = categoryList.find { it.categoryId == categoryId }//check tồn tại category

        if (category == null) {
            println("Danh mục sản phẩm không tồn tại!")
        } else {
            category.productList.add(product)
            println("Thêm sản phẩm thành công!")
        }
    }

    //Chỉnh sửa sản phẩm
    fun updateProduct(productId: String, newName: String?, newPrice: Double?, newOrigin: String?) {
        /*var checkProductId = false*/
        for (category in categoryList) {
            for (product in category.productList) {
                if (productId == product.productId) {
                    newName?.let {
                        println("Updating")
                        product.productName = it
                    }
                    newPrice?.let {
                        println("Updating")
                        product.productPrice = it
                    }
                    newOrigin?.let {
                        println("Updating")
                        product.productOrigin = it
                    }
                    checkProductId = true
                    break
                }
            }
        }
        if (!checkProductId)
            println("Sản phẩm ID $productId không tìm thấy!")
    }

    fun deleteProduct(productId: String) {
        for (category in categoryList) {
            val productRemoved = category.productList.removeIf { it.productId == productId }
            if (productRemoved) {
                println("Sản phẩm ID $productId đã được xoá.")
                checkProductId = true
            }
        }
        if (!checkProductId) {
            println("Sản phẩm ID $productId không tìm thấy!")
        }
    }

    fun totalCategoriesValue() {
        var totalValue = categoryList.sumOf { category -> category.productList.sumOf { it.productPrice } }
        println("Tổng giá : $totalValue")
        /*return totalValue*/
    }

    fun listProductsByCategory(categoryId: String) {
        val category = categoryList.find { it.categoryId == categoryId }
        if (category != null) {
            println("Sản phẩm trong danh mục $categoryId: ")
            category.productList.forEach { println(it) }
        } else {
            println("Không tìm thấy danh mục")
        }
    }

}