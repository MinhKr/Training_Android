package day3.b1.model


data class Employee(
    val firstName: String,
    val lastName: String,
    private var soSP: Int
) {
    init {
        if (soSP < 0)
            soSP = 0
    }

    fun setProductCount(): Int = soSP
    fun getProductCount(value: Int) : Int {
        if (value >= 0)
            soSP = value
        else
            soSP = 0

        return soSP
    }

    fun getSalary(): Double {
        val donGia = when {
            soSP in 1..199 -> 0.5
            soSP in 200..399 -> 0.55
            soSP in 400..599 -> 0.6
            soSP >= 600 -> 0.65
            else -> 0.0
        }
        return soSP * donGia
    }

    fun isGreaterThan(employee2: Employee): Boolean {
        return this.soSP > employee2.soSP
    }
}
