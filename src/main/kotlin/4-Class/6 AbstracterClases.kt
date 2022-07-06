package `4-Class`

interface McDonalsServixe {
    fun motoCarier()
}
//todo Abstract class 'larda open yada Abstract fun nezaman kullanılır eğerki kullancağınız fun eklemek istediğiniz eklemek istediğiniz belli başlı datalara ihtiyacı var ise kullanılır.

/** //todo bu kısmı önemli BOş zamanlatrımda araştır.
 * Abstract(Soyutlama)
 *dk 1.45 =105
 *Kısaca Abstract class’lar uygulamamız içinde kullandığımız class’ların ortak özelliklerini topladığımız ve bu ortak özellikleri
tekrar tekrar yazmak durumda kalmamak için kalıtım(extends) alıp alt sınıfı bazı işlemlerden soyutladığımız sınıflardır.
 *-////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * final ve open modifier'ler kullanmak anlamsız ve yanlıştır.
 * abstract olarak yazılmis class'a yeni eklenen tüm abstract yapılar, tum child class'larda override edlmek zorunda.
 *eger abstract class'iniza eklemek istediğiniz opsiyonel yapılar varsa, bunları child class'ların tamanını override etmek
 *zorunda olmayalım diye, open keyword'u tanimlayabiliriz.
 * abstract bir class, abstract bir class'ı miras alirsa, abstract yapiları override etmek zorunda değildir.
 * abstract funksyon body'si olmaz. property'lerin de defoult değeri olmaz.
 *
 *abstract class'lar aynı zamanda instance'i olusturulamayan class'lar .Bu sebeple sigleton gibi paternler için
 * kullanlabiliyorlar.
 *
 *abstract class'lar şablon claslardır.abstract türkçesi soyut kavram demek.
 */
abstract class McDonals {
    //normal bir değişken ve  fun tanımlayabilirsiniz.
    val fridge: Fridge = Fridge()
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTow: Employee
    abstract val employeeTherr: Employee
    abstract val memuList: List<McHamburger>

    //abstract fun larda Body si olmaz "{}"
    abstract fun clean(clock: Int)

    // abstract infix  şeklinde kullanabiliniyor ama kurallarına uyması gerekiyor.
    abstract infix fun clean1(clock12: Int)

    // { //opsiyonel
    //  }
    //open bir değişkende overide yapabiliyorsunuz.
    open val policeOfficer: Police = Police()

    val spacialBranchName: String = "Taksim"

    //aynı zamanda Extansion da edilebilir.
    infix fun McdonadsExpress.print(messager: String) {
    }

    abstract fun sellCoffee(): McCoffe

    /** aşağıdaki open fun anlamı ben bu fun ekliyorum ama bu funksiyonu,
    abstract class'ı miras alan bütün class larda override etmek istemiyorum.
     * eğer bu durumda her yerde override etmiyorsak doğru olanı  2. bir abstract yazmamızdır.
     */
    open fun printMenuList() {
        memuList.forEach {
            println(it)
        }
    }
}

/** abstract Miras alınabilir. abstract classlar open olmayı sağlar.
 *
 */
abstract class McdonadsExpress : McDonals() {

    override fun clean(clock: Int) {
        println("Clean time : $clock")
    }
    override fun clean1(clock12: Int) {
        TODO("Not yet implemented")
    }
    /** Bir abstract class başka bir abstract class değişkenleri yada fonksyonları override edebilir etmeyedebilir.
    zorunluluk yoktur.
     */
    fun main() {
        fridge
        superVisor
        employeeTow
    }

    override val employeeTherr: Employee
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")

    override fun sellCoffee(): McCoffe {
        TODO("Not yet implemented")
    }
}
/** abstract clasta normalde üst clasınızda normalde override edilmesi zorunlu olcak ama sizin
 * override edilmesi zorunluluğunu kaldırmak istediğiniz bir Fun. varsa bu durumda alt classınızda
 * abstract olan clasınızda bunu override ederseniz sizin alt abstrack clasınızda artık override etmek zorunda değilsiniz.
 * düz claslar için aşağıdaki örnekten belirli oluyor.
 */
class McDonaldsMaltepeExpres : McdonadsExpress() {
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTow: Employee
        get() = TODO("Not yet implemented")
    override val memuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        super.clean(clock)
        println("clean clock  ")
    }
}
/**
 *  Bir abstract class düz bir class miras alınacaksa override edilmek zorunda.
 */
class McDonaldsMaltepe : McDonals(), McDonalsServixe {
    override fun sellCoffee(): McCoffe {
        TODO("Not yet implemented")
    }
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTow: Employee
        get() = TODO("Not yet implemented")
    override val employeeTherr: Employee
        get() = TODO("Not yet implemented")
    override val memuList: List<McHamburger>
        get() = TODO("Not yet implemented")
    override val policeOfficer: Police
        get() = super.policeOfficer

    override fun clean(clock: Int) {
        // super.clean(clock)
        println("clean ")
    }

    //Aynı zamanda infix fun da oluşturulabilir.
    override fun clean1(clock12: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarier() {
        TODO("Not yet implemented")
    }
//    fun main(){
//        employeeOne
//        employeeTherr
//    }
}


class McDonaldsKadıkoy : McDonals() {
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTow: Employee
        get() = TODO("Not yet implemented")
    override val employeeTherr: Employee
        get() = TODO("Not yet implemented")
    override val memuList: List<McHamburger>
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun clean1(clock12: Int) {
        TODO("Not yet implemented")
    }

    override fun sellCoffee(): McCoffe {
        TODO("Not yet implemented")
    }

//    fun main(){
//        employeeOne
//        employeeTherr
//    }
}

//Farklı bir yazılış yöntemi
class McDonalsUnye(
    override val superVisor: SuperVisor,
    override val employeeOne: Employee,
    override val employeeTow: Employee,
    override val employeeTherr: Employee,
    override val memuList: List<McHamburger>
) : McDonals(), McDonalsServixe {
    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override fun clean1(clock12: Int) {
        TODO("Not yet implemented")
    }

    override fun sellCoffee(): McCoffe {
        TODO("Not yet implemented")
    }

    override fun motoCarier() {
        TODO("Not yet implemented")
    }
}


class McCoffe
class Employee
class SuperVisor
class Fridge
class Police
class McHamburger

fun main() {
    // val mcDonals =McDonals()
    val mcDonals = McDonaldsMaltepe()
}

