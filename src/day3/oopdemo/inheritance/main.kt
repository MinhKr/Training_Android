package day3.oopdemo.inheritance

fun main() {
    var chicken = Chicken()
    var animal = Animal()

    animal.sound = "hahe"
    animal.numberOfFeet = 4

    chicken.sound = "haha"
    chicken.numberOfFeet = 2

    chicken.show()
    animal.show()

}