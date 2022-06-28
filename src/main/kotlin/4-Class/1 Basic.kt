package `4-Class`

/**Class isimleri BÜYÜK HARFLE BAŞLAR.
 *önce init bloğu çalışıyor eğer varsa İkinci constructor sonra çalışır.Debug için dene
 *Class ların geri dönüş tipleri yok.
 *constructor oluşturucular.
 * kotlinde 1.constructor 2.constructori işaret etmek zorundadır.
 * "class Car constructor" içindeki zorunlu parametleler this(....) şeklinde verilmek zorundadır.
 * constructor lar 2 ye ayrılı Primeriy constructor ve secondary constructor olmak üzere
 *
 */
//todo Aynı isimde birden fazla fonksyonlara fonksiyon overload denir.İŞGÖRÜŞMELERİNDE SOULUR
//val name = "Ahmetay"
//fun getName(): String= "Ahmetay"

class Car constructor(wheelCount: Int, color: String = "Red") { //pramiry constructor
     val mWheelCount: Int
    private val mColor = color

    init {
        mWheelCount = wheelCount
        "primary count. create".printLog()
        "wheelCount: $mWheelCount, Color : $mColor".printLog()
    }

    constructor(wheelCount: Int, color: String = "Red", name: String? = null,madeOd:String?=null) :this(wheelCount) {
        "1. secondary const".printLog()
        if (name == null) {
            return
        }
        if (madeOd == null) {
            return
        }
    }

    constructor(wheelCount: Int, color: String = "Red", name: String) : this(wheelCount) {
        "2. secondary const".printLog()
    }
    constructor(wheelCount: Int,color: String,name:String,madeOf:String,cart:Boolean):this(wheelCount){
        "3. secondary const".printLog()
    }
    fun startEngin(){
      //boş
    }
}

fun main() {
    val car0 = Car(4)
    val car1 = Car(4, color = "Blue")
    val car2 = Car(4, "Blue", "MiniCouper")
    val car3 = Car(4, "Blue", "MiniCouper", "Metal")
    val car4 = Car(4,"Blues","MiniCouper","Metal",true)
    //"Car" burada fonskyon değer italik bir yazısı var. Diğer "Car" kısımı class ---->
  //  val car5 = Car(4,"Blues","MiniCouper","Metal","deneme")


    "Hello Wordl".printLog()
    car0.startEngin()
    car0.mWheelCount

}
fun String.printLog() {
    println(this)
    println("---------------")
}
 fun Car (i:Int,s1:String,s2:String,s3:String,s4:String){
}