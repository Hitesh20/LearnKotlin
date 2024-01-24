package companionObject

fun main(args: Array<String>) {
    MyClass.MyObject.method() // if we want to remove this object from in between, use companion
    MyClass.method()
    MyClass.MyObject2.method()
}

class MyClass {
    // MyClass can use properties and functions of its companion without actually using its object reference...
    companion object MyObject {// one companion object allowed per class
        @JvmStatic
        fun method() = println("method") // not a static method // to make it statc use annotation @JvmStatic
    }
    // comanion is used for factory pattern

    object MyObject2 {
        fun method() = println("method 2")
    }
}