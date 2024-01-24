package companionObject

fun main(args: Array<String>) {
    println(Pizza.getPizza("Cheesy"))
}

class Pizza private constructor(val pizza: String, val toppings: String) {
    companion object Factory {
        fun getPizza(pizzaType: String): Pizza {
            return when(pizzaType) {
                "Cheesy" -> Pizza("Cheese Burst", "Onion, Capcicum, Tomato")
                "Veggie" -> Pizza("Farmhouse", "Onion, Capcicum, Tomato, Brocolli, Mushroom")
                else -> Pizza("Basic", "Cheese")
            }
        }
    }
    override fun toString(): String {
        return "$pizza - $toppings"
    }
}