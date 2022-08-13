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

////////////////////////Araba

open class MiniCoper(

    override val name: String = "MiniCoopper",
    override val color: String = "Red"
) : Auto() {
    override fun toString(): String {
        return "name: $name color :$color"
    }

    init {
        super.run()
    }
}

open class John : MiniCoper() {
    init {
        super.run()
    }
}

class JohnCabrio : John() {
    init {
        super.run()
    }
}

class Beetle(
    override val name: String = "Beetle",
    override val color: String = "Yellow"

) : Auto() {
    override fun toString(): String {
        return "name :$name, color: $color"
    }

    init {
        super.run()
    }
}


////////////Bisiklet
open class Bisan(
    override val name: String = "Bisan",
    override val color: String = "Blue"
) : Bycle(), TransportationFunctions {
    override fun toString(): String {
        return "name :$name, color: $color"
    }

    override fun run() {
        println("Run boy runn")
    }
}

class BlackBisan() : Bisan()

class Corelli(
    override val name: String = "Corelli",
    override val color: String = "Gray"
) : Bycle() {
    override fun toString(): String {
        return "name :$name, color: $color"
    }
}
//class TransportFactory(transportationFunctions:Auto) {
/**Eğer < in P : Auto> derseniz alırsanınız Class'ın kendisi ve üst Class'larını alsın demektir.*/
//class TransportFactory< in P : Auto>(transportationFunctions: P) {
/** Eğer < out T : Auto> şeklinde alırsanınız Class'ın kendisi ve Alt Class'larını alsın demektir. */
class TransportFactory<out T : Auto>(transportationFunctions: T) {
    init {
        println(transportationFunctions.toString())
    }
}

fun main() {

    val miniCoper: MiniCoper = MiniCoper()
    val john: John = John()
    val johnCabrio: JohnCabrio = JohnCabrio()
    val beetle: Beetle = Beetle()

    val bycle: Bycle = Bycle()
    val bisan: Bisan = Bisan()
    val blackBissan: BlackBisan = BlackBisan()
    val corelli: Corelli = Corelli()

    val miniCoperFactory: TransportFactory<MiniCoper> = TransportFactory<MiniCoper>(miniCoper)
    val johnFactory: TransportFactory<John> = TransportFactory<John>(john)
    val johnCarbrioFactory: TransportFactory<JohnCabrio> = TransportFactory<JohnCabrio>(johnCabrio)
    val beetleFactory: TransportFactory<Beetle> = TransportFactory<Beetle>(beetle)

    //   val johnFactory2: TransportFactory<John> = TransportFactory<MiniCoper>(miniCoper)
    val johnFactory3: TransportFactory<John> = TransportFactory<JohnCabrio>(johnCabrio)
    val johnFactory4: TransportFactory<John> = TransportFactory<John>(john)


//    val bisanFactory2: TransportFactory<Bisan> = TransportFactory<Bycle>(bycle)
//    val bisanFactory3: TransportFactory<Bisan> = TransportFactory<BlackBisan>(blackBissan)
//    val bisanFactory4: TransportFactory<Bisan> = TransportFactory<Bisan>(bisan)
//
//    val bisanFactory: TransportFactory<Bisan> = TransportFactory<Bisan>(bisan)
//    val corelliFactory: TransportFactory<Corelli> = TransportFactory<Corelli>(corelli)

    calculate<Int>(2, 3)
  // calculate<String>(2, 21)

    println(calculate<Int>(2, 55))
}

/**Sadece inline olarak kullanılır.*/
inline fun <reified T> calculate(numnerOne: Int, numberTwo: Int): T {
    return when (T::class.java) {
        String::class.java -> {
            (numnerOne + numberTwo) as String as T
        }

        else -> {
            (numnerOne + numberTwo) as Int as T
        }
    }
}


fun <T> log(loginFragment: T) {
    println("$loginFragment")
}






