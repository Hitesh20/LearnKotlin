package exceptionHandling

fun main(args: Array<String>) {
    val arr = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e: NullPointerException) {
        println("Null pointer:- ${e.message}")
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Array out of Bound:- ${e.message}")
    }
    catch (e: Exception) {
        println("${e.message}")
        return; // finally still runs
    } finally {
        println("Finally")
    }

    createUserList(4)
    createUserList(0)

    try {
        println(arr[5])
    } finally {
        println("Finally 2")
    }

    println("This will not run")
}

fun createUserList(count: Int) {
    if(count <= 0) {
        throw IllegalArgumentException("Count must be greater than 0")
    } else {
        println("$count Users created.")
    }
}