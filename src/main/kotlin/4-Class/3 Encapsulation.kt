package `4-Class`

/** Class içerisinde tanımlanan değişkenleri get ve set etme işlemlerine denir.
 *
 *
 *
 */
fun main() {

    val sandalye1 = Sandalye()
    val sandalye2 = Sandalye()
    sandalye1.bacaksayısı = 4
    sandalye1.model = "Modal1"
    sandalye2.bacaksayısı = 6
    sandalye2.model = "Modal2"
    println(sandalye1.model)
    println(sandalye2.model)
}

class Sandalye {
    var bacaksayısı: Int = 0
    var model = ""

    var bacakYüksekliği: Int = 0
        get
        set(value) {
            if (value < 0) {
               return println(value)
            }
        }

}
var Sandalye.deneme123
    get()="asdsa"
        set(value) {
            deneme123
        }

