package oops.classes

import java.util.Objects

fun main(args: Array<String>) {
    val circle = Circle3(3.1)
    val player = Player("Sad")
    // type checking
    if(circle is Circle3) {
        println("It is a circle")
    }
    if(circle is Shape3) {
        println("It is a circle")
    }
    if(circle is Draggable) {
        println("It is a circle")
    }
    dragObjects(arrayOf(Circle3(4.7), Square3(2.3), Player("Smile")))
}

fun dragObjects(objects: Array<Draggable>) {
    for(obj in objects) {
        if(obj is Circle3) {
            println(obj.area())
        } else if(obj is Square3) {
            println(obj.area())
        } else {
            println((obj as Player).sayMyName()) // obj does not know what exact Class object it is... therefore did typecasting...
        }
        println(obj.drag())
    }
}

interface Draggable {
//    val dragSpeed: Int
    fun drag()
}


abstract class Shape3: Draggable {
    abstract fun area(): Double
}

class Circle3(val radius: Double): Shape3() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun drag() = println("Circle Drag")
}

class Square3(val side: Double): Shape3() {
    override fun area(): Double {
        return side * side
    }
    override fun drag() = println("Square Drag")
}

class Player(val name: String): Draggable{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = "Hey $name"
}