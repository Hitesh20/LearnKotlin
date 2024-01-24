package objectKeyword

fun main(args: Array<String>) {
    println(A.num)
    B.test()

    // object expression or anonymous object
    val testObj = object {
        val x: Int = 10
        fun test() {
            println("Anonymous Object")
        }
        fun test2() = "Anonymous 2"
    }

    println(testObj.x)
    println(testObj.test())
    println(testObj.test2())
}

object A { // object declaration - similar to class - no constructors are allowed - can inherit class/interface - use for singleton pattern
    val num: Int = 10
}

object B { // object declaration
    val p: Int = 20
    fun test() {
        println("Obj B")
    }
}