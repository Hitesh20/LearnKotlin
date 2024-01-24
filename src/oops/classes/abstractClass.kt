package oops.classes

fun main(args: Array<String>) {
//    val circle: Shape2 = Shape() // can not create obj of abstract class. - same as java
    val circle: Circle2 = Circle2(5.6)
    println(circle.area())
    println(circle.display())
    val square: Shape2 = Square2(5.6)
    println(square.area())
}

abstract class Shape2 { // top most parent class extends Any by default which has toString and hashcode methods already implemented
    abstract fun area(): Double // no need to make it open now... // by default open
    fun display() { // abstract class can have both abstract and non abstract properties and methods
        println("Shape called")
    }
}

class Circle2(val radius: Double): Shape2() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square2(val side: Double): Shape2() {
    override fun area(): Double {
        return side * side
    }
}