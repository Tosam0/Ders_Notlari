package `4-Class`

/**
 * 2 farkli interface'in aynı fonksyonları olması durumunda, bu fonksyonularin override edilmesi
sırasinda aynı fonksyınu 2 kere yazarak ovarride edemeyiz.
 * Eğer implement ettiğimiz interface'lerin aynı isimde fonksyonları bulunuyorsa, tekbir fonksyon
override islemi yapılır.Bunun icersinde hangisinin body'ine erismek istiyorsak
 *
 *interface'lerin Abstract class'lardan en büyük farkı state (içerisinde değişken tanımlayıp o değişkeni saklayamıyorsunuzdemektir)
tutamiyor olusları
 * interface icersindeki intial değer bir property(field) ya da body'si olmayan bir fonksiyon
Abstract olarak da tanımlanabilir.
 *  interfaceleri anlami gereği final yapamazsiniz. open yazlilmasi da gereksizdir
 *interfaceleri neleri yapabiliceğini söyler.
 */
interface MyIntegerface {
    val prop: Int //Abstract
    val proportyWihImplement: String
        get() = "Foo"

    //   val proportyWihImplement1:String = "sadas"
    //  get()="foo"

    //    abstract fun foo(){
//        println(prop)
//    }

//    fun proportyWihImplement(): String = "asdsa"{
//        get() = "fafas"
//    }

    fun foo() {
        println(prop)
    }

    fun foo2()

    //abstract olabilir.
    abstract fun bar()
}

/**Interface'ler yanimlanan proporty'lerde (field) initial değer alma zorunluluğu yoktur.
 *interface'lerde başka bir interface'i implement " : iki nokta işareti ile " edilebilinir.miras alabilir.
 */
interface Named {
    val fullName: String?
}

interface Person : Named {
   val firstName: String
    val lastName: String

    override val fullName: String?
        get() = "$firstName--$lastName"
}

interface A {
    fun foo() {
        println("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("Bar")
    }
}
/**Eğer implement edilen bir interface ,başka bir interface'i implement ediyorsa ve bu interface'in
 * uyeleri child interface'de override edilmis ise, Child interface'i implement eden class'da,
 * bu property'nin override edilme zo*********************
 *
 */

//abstract class Employee(
//    override val firstName:String,
//    override val lastName:String,
//    override val fullName: String?
//    val position:Int
//):Person


/**
 *
 */



































