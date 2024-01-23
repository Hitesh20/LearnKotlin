package ifElse

fun main(args: Array<String>) {
    val isRaining = false;
    if(isRaining) {
        println("Bring Umbrella")
    } else {
        println("Enjoy")
    }

    val x = 20

    if(x > 30) {
        println("x greater")
    } else if(x < 30) {
        println("x smaller")
    } else {
        println("x equal")
    }

    // use if else as expression

    val y = 30
    val res = if(y > 30) {
        "y greater"
    } else if(y < 30) {
        "y smaller"
    } else {
        "y equal"
    }
    println(res)
}