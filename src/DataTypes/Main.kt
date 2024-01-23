package DataTypes

import com.sun.jdi.IntegerType

fun main(args: Array<String>) {
    var x = 10; // ctrl + shift + p
    println(x)
    x = 20;
    println(x)
    val y = "Hello"; // same like const in nodejs
    println(y)
    // y = "Bye"; // val can not be reassigned....

    var score = 5;
//    score = 3.14; // Error // Type Checking

    // Data Types
    var newScore: Int = 12;
    var temp: Double = 89.9
    var isRaining:Boolean = false
    var alphabet: Char = 'A'
    var message: String = "Hey Dunia"
    println(message)
}