package loopsWhileAndDoWhile

fun main(args: Array<String>) {
    var count = 5
    while(count >= 1) {
        // println(count + ". Hello") // Error
        println("Hello " + count)
        count--
    }

    var index = 5;
    do {
        println("Do While Tetsing")
        index--;
    } while(index > 5)
}