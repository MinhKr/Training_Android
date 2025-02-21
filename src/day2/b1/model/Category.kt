package day2.b1.model

data class Category(
    val categoryId: String,
    var categoryName: String,
    var productList: MutableList<Product> = mutableListOf()
)
