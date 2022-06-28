import `4-Class`.printLog

fun main() {
      val index1 = Deneme("ahmet", "aykun", 2)
    val index2 = Deneme("samet", "tezel", 2, 1.2)
    val indexSonClas = Personel("Personel_1")

}


class Deneme(name: String, surname: String = "aykun") {
   private val infix = "First proporty: $name $surname".also(::println)
    private val infixname : String
    private val infixsurname :String

    init {

        infixname = name
        infixsurname = surname

        " First initializer $infixname $infixsurname".printLog()
    }

    val socontİnit = "Second property = ${name.length}".also(::println)

    //  init {
    //      println("Second  initializer")
    //   }

      constructor(name: String, surname: String, number: Number) : this(name) {
        "1. constructor".printLN()
      }
    constructor(name: String, surname: String, number: Number, orantı: Double) : this(name) {
        "2. constructor".printLog()
    }

}

class Personel(val name1: String) {
    val chalderen: MutableList<Personel> = mutableListOf<Personel>().also(::println)

    init {

        "Percon Class: $name1".printLN()
    }

   constructor(name1: String, perent: Personel) : this(name1) {
       perent.chalderen.add(this)
      "Personael Class: ${perent.chalderen.add( this)}".printLN()

   }
}

fun String.printLN() {
    println(this)
    println("*****************")
}