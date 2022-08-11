package `4-Class`

interface TransportationFunctions {
    fun run()
}

open class Auto : TransportationFunctions {
    open val name: String = ""
    open val color: String = ""


    override fun run() {
        println("Run boy runn")
    }
}

open class Bycle {
    open val name: String = ""
    open val color: String = ""

}

////////////////////////

open class MiniCoper(
    override val color: String,
    override val name: String
) : Auto() {
    override fun toString(): String {
        return "name: $name color :$color"
    }

    init {
        super.run()
    }
}















