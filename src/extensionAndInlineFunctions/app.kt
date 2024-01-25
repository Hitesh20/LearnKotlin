package extensionAndInlineFunctions

fun main(args: Array<String>) {
    // we can not always add functions... therefore extension is there...
    println("Hey Dude".formattedString())

    // inline function
    calculateTime { loop(100) }

}

inline fun calculateTime(fn: () -> Unit) { // without inline, what kotlin will do is... it will create new class and create object and run it... it is a performance hit... application gets slow...
    // but if we add inline keyword... it will just paste the function at the place where that function is called... so no object creation takes place in this case...
    // time taken with inline is better...
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("${end - start} ms")
}

fun loop(n: Int) {
    for(num in 1..n) {
        println(num)
    }
}

fun String.formattedString(): String { // on a String object, this method will be applicable
    return "----------------------\n$this\n------------------------" // can not access class private members
}