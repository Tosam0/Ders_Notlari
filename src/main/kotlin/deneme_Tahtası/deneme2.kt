package deneme_Tahtası

import java.util.*

fun main() {
Aylar(Ay.OCAK,12)
Aylar(Ay.SUBAT,122)
Aylar(Ay.MART,132)

}

data class NewDataClass(
    val name: String,
    val surname: String = "Aykun",
    val age: Int,
    val menu: List<String>
) : ABSclass() {
    infix fun String.Pluss(artı: String): Int = this.toInt() + artı.toInt()
    override val Index1: String
        get() = TODO("Not yet implemented")
    override val Index2: Int
        get() = TODO("Not yet implemented")
    override val Index3: Double
        get() = TODO("Not yet implemented")

    override fun Absfun(click: Int) {
        TODO("Not yet implemented")
    }


}

abstract class ABSclass() {
    abstract val Index1: String
    abstract val Index2: Int
    abstract val Index3: Double
    abstract fun Absfun(click: Int)
}

enum class Ay1 {
    OCAK,
    SUBAT,
    MART,
    NISAN,
    MAYIS,
    Haziran,
    Temmuz,
    Agustos,
    Eylul,
    Ekim,
    Kasim,
    Aralim,
    ;
}

enum class Ay(val aylar: Int) {
    OCAK(1),
    SUBAT(2),
    MART(3),
    NISAN(4),
    MAYIS(5),
    Haziran(6),
    Temmuz(7),
    Agustos(8),
    Eylul(9),
    Ekim(10),
    Kasim(11),
    Aralim(12),
    ;
}

fun Aylar(aylar1: Ay, deger: Int): Int =
    when (aylar1) {
        Ay.OCAK -> deger +99
        Ay.SUBAT -> deger
        Ay.MART -> deger

        else -> -1
    }


//open class deneme(name: String) :NewDataClass(name, surname = ){
//
//}