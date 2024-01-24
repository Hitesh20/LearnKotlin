package oops.classes

fun main(args: Array<String>) {
    val circle: Circle = Circle(4.0)
    val square: Shape = Square(4.0) // parent can hold reference to its child - polymorphism - this is runtime polymorphism
    println(circle.area())
    println(square.area())

    val shapes: Array<Shape> = arrayOf(circle, square, Circle(2.9), Square(7.5))
    calculateArea(shapes)
}

fun calculateArea(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}

open class Shape { // top most parent class extends Any by default which has toString and hashcode methods already implemented
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double): Shape() {
    override fun area(): Double {
        return side * side
    }
}