package oops.classes

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.i)

    val nested = Outer.Nested()
    nested.test()

    val innerNested = Outer().Nested2()
    innerNested.test()

}

class Outer {
    var i = 0
    class Nested { // this class can not access data members of Outer
        fun test() {
            println("I am inside Nested Class")
        }
    }

    inner class Nested2 {
        fun test() {
            println("I am inside Nested Class $i") // inner class can access data member of Outer Class
        }
    }
}