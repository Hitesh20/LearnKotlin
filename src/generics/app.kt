package generics

fun main(args: Array<String>) {
    val container1 = Container(5)
    container1.set(10)
    println(container1.get())

    val container2 = Container("Hitesh")
    container2.set("Hitesh Munjal")
    println(container2.get())
}

class Container<T>(var data: T) {
    fun get(): T {
        return data
    }

    fun set(data: T) {
        this.data = data
    }
}