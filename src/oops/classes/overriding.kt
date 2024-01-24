package oops.classes

fun main(args: Array<String>) {
    val onePlus = OnePlus()
    onePlus.display()

    val onePlus2: Mobile = OnePlus()
    onePlus2.display()


//    val onePlus = OnePlus("Smartphone")
//    onePlus.display()
//
//    val onePlus2: Mobile = OnePlus("Smartphone")
//    onePlus2.display()
    println(onePlus2.size)

    val nord = Nord("Nord")
    println(nord.name)
    println(nord)

    val samsung = Samsung("Samsung")
    println(samsung.name)
}

//open class Mobile() {
//    open val name: String = "" // allowing override
//    open val size: Int = 5
//    fun makeCall() = println("Calling from mobile")
//    fun powerOff() = println("Shutting Down")
//    open fun display() = println("Simple Mobile Display") // to allow overriding
//}
//
//open class OnePlus: Mobile() {
//    override val name: String = "One Plus"
//    override val size: Int = 7
//    override fun display() {
//        println("One Plus Display")
//    }
//}

// --------------------------------------------------------------------------------------------------
open class Mobile(val type: String) {
    open val name: String = "" // allowing override
    open val size: Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display") // to allow overriding
}

open class OnePlus: Mobile("Smartphone") {
    override val name: String = "One Plus"
    override val size: Int = 7
    override fun display() {
        super.display()
        println("One Plus Display")
    }
}

//open class Mobile(val type: String) {
//    open val name: String = "" // allowing override
//    open val size: Int = 5
//    fun makeCall() = println("Calling from mobile")
//    fun powerOff() = println("Shutting Down")
//    open fun display() = println("Simple Mobile Display") // to allow overriding
//}
//
//open class OnePlus(typeParams: String): Mobile(typeParams) {
//    override val name: String = "One Plus"
//    override val size: Int = 7
//    override fun display() {
//        println("One Plus Display")
//    }
//}

class Nord(override val name: String): OnePlus() {
    override fun toString(): String { // overriding toString // alt + insert
        return "$name - $size"
    }
}

class Samsung(nameParam: String): OnePlus() {
    override val name: String = nameParam
}