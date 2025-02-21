package day2.b2.model

data class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Point: [$x , $y]"
    }
}
