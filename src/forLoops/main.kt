package forLoops

fun main(args: Array<String>) {
    for(i in 1..5) {
        println(i)
    }
    println("---------------------------------------------------")

    for(i in 1..10 step 2) {
        println(i)
    }
    println("---------------------------------------------------")

    for(i in 5 downTo 1) {
        println(i)
    }
    println("---------------------------------------------------")

    for(i in 10 downTo 1 step 2) {
        println(i)
    }
    println("---------------------------------------------------")

    val number: Int = 2
    for (index in 1..10) {
//        println(number + " X " + index + " = " + number*index) // number is integer and we are appending String.. So it throws error as kotlin is statically typed
        // to solve this issue use toString

//        println(number.toString() + " X " + index + " = " + number*index) // not much readable

        // String Templating
        println("$number X $index = ${number * index}")
    }
}