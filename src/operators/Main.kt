package operators

fun main(args: Array<String>) {
    var i = 29
    var j = 5
    println(i+j)
    println(i*j)
    println(i/j)
    println(i.toFloat()/j) // to convert an integer to float or double...
    println(i-j)

    println(i%j)

    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i!=j)
    println(i==j)

    var x = 0
    x++
    println(x)
    x--
    println(x)

    // pre increment
    var y = 0
    println(++y)
    println(--y)

    // post increment
    var z = 0
    println(z++)
    println(z--)
}