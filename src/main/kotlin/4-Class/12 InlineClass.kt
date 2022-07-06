package `4-Class`


//val balance:Int = 25000

open class BankAccount2(val balance: Int, val accountNumber: Long) {
    val branchCode: Long = 2336
}

interface Print {
    fun printBalance()
}

@JvmInline
value class BankAccount3(val balance: Int) : Print { //<--şuan sadece 1 tane değişken tanımlanabiliyor.
    init {
        println("balance : $balance")
    }

    // val accountNumber3: Long = 6468464
    val accountNumber: Long
        get() {
            return 311646841
        }

    fun getAccountNumber2(): Long {
        return 46848646468
    }

    override fun printBalance() {
        println("Interface print - balance : $balance")
    }
}


/** value class'lar @JvmInline annatation olmadan henuz kullanılmıyor.
 *
 * value class'lar suan icin sadece tek bir değişken kabul etmektedir.Birden fazla değişken izin verilmiyor.
 * Ancak value class'ların dökümantasyonunda inline class'ların ileride birden fazla değişken olabilmesine
izin verileceği yazıyor.
 *
 * inline class'lar ile init block'kullanılabilinir.
 *
 * inline class'ların belirtilen constrcutor'ları java kodu private olarak bulunur.
 * Bundan dolayı zaten istesek de counstructor'larla nesne olusturamayız.Ama bunu yapabiliyor gibi
 * görmemizin sebebi, gerçete o nesnenin hiç yaratılmiyor olusu sebebiyle.
 * Bizim nesne olustururken gördüğümüz sey aslında counts. icindeki değişkenin kendisi.
 *
 * Inline class'lşar için proporty tanımlanmasına izin verilir. Ancak bu proporty'inin backing field'i olmaz.
 *
 *Inline class'lar herhangi bir interface'i implement edebilirler,bir baska  class'i miraz alamazlar.
 *
 * Inline class'lar m,iras alinmaz. Cunku defoult olarak final'lerdir ve değiştirilemezlerdir.
 * Open keyword'uyle beraber kullanılmaz.final keyword'u vermek de redundot uyarısı verir.
 * abstrack,sealed class  keyword'u ile de kullanılmaz.
 *
 */

interface I_love

@JvmInline
value class Yoo2(val i: Int) : I_love

fun asInLine(f: Yoo2) {}
fun <T> asGeneric(x: T) {}
fun asInterface(i: I_love) {}
fun asNullable(i: Yoo2?) {}

fun <T> id(x: T): T = x

fun main() {
    val balance2: BankAccount2 = BankAccount2(25000, 654648684)
    val balance3: BankAccount3 = BankAccount3(46864)

    val f = Yoo2(65)//f'in tipi int -> primitive -> unboxed
    // val f2: Int = 45

    asInLine(f)  //unBoxed (primitive)kullanılıyordemek
    asGeneric(f)    //boxed (referans tipli): used as generic type T
    asInterface(f)  //boxed (referans tipli) :used as type I_love
    asNullable(f)   //boxed (referans tipli) :used as Yoo2?, which is different from Yoo2


    val c = id(f)
}

/**                     *******************Özet******************
 *
 * kotlinde bir klas tipi var geliştirilmesi devam eden bir class tipi var.Bu class tipinde siz class
 * özellikleri kullanıp içerisine bir tane değişken koyduğunuzda ,bu değişken referans tipli değilde
 * primitive tipli davranıyor.Çok iyi bir performans artışı sağlar.
 *
 * ********boxed kullanımlarda bunu kullanmanın bir anlamı yok ********
 *  bunlar  generic type ,Nullable ve super type 'nı paremetre  olarak beklenen
 *  bir fonksyon kullanıyorsam, kullanmamızın espirisi kalmıyor.
 * */





































