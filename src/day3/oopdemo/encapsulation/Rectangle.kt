package day3.oopdemo.encapsulation

class Rectangle(private var length: Double, private var width: Double) {


    public fun calculateArea(): Double {
        return length * width
    }

}