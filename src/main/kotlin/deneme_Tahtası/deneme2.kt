package deneme_Tahtası

fun main() {

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


//open class deneme(name: String) :NewDataClass(name, surname = ){
//
//}