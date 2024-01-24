package modifiers

class A { // Top Level Declaration // by default, it is public

}

var b = 20 // Top level declaration

fun hello(): Unit {
    println("Hello")
}

internal class B {
    // internal modifier is like public only.. but within same package......
}

private class C { // private within this file only

}

//protected class D { // protected does not work in top level declaration
//
//}