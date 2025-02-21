package day3.oopdemo.inheritance

open class Animal {
    var sound: String? = null
    var numberOfFeet: Int? = null

    open fun show() {
        println("Sound : $sound")
        println("Number Of Feet : $numberOfFeet")
    }


}