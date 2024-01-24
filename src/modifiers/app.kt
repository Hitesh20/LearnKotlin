package modifiers

fun main(args: Array<String>) {
    val a: A = A()
    println(b)
    hello()
    val b: B = B()

    val m = ModifierTester()
    m.x
    m.y

    val n = ParentModifier()
    n.x
    n.y
    n.test()
}

open class ModifierTester {
    public var x = 10
    internal var y = 20
    private var z = 30
    protected var w = 40
}

class ParentModifier: ModifierTester() {
    fun test() {
        println(x)
        println(y)
//        println(z) // error because it is private..
        println(w) // protected ones are available in sub classes only...
    }
}