package objectKeyword

fun main(args: Array<String>) {
    val obj = object: Clonable {
        override fun clone() {
            println("I am clone")
        }
    }
    obj.clone()

    val obj2 = object: Person("Hitesh") {
        override fun fullName() {
            super.fullName()
            println("$name Kumar Munjal")
        }
    }
    obj2.fullName()
}

interface Clonable {
    fun clone()
}

open class Person(val name: String) {
    open fun fullName() = println("$name Munjal")
}