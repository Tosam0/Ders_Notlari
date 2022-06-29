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

    //aşağıdaki priporty'dir. ->
    val proportyWihImplement: String?
        get() = "Foo"
    //   val proportyWihImplement1:String = "sadas"
    //  get()="foo"
//      fun proportyWihImplement1():String {
//       return "foo"
//    }
    //    abstract fun foo(){
//        println(prop)
//    }
//    fun proportyWihImplement(): String = "asdsa"{
//        get() = "fafas"
//    }
    /**aşağıdaki iki Fun farkı eğer boddy'si varsa kullandığınız yerde override etme zorunluluğu yoktur
     * ama body'si yoksa override etmemiz gerekiyor.
     */
    fun foo() {
        println(prop)
    }

    fun foo2()

    //abstract olabilir.
    fun bar()
}

/**Interface'ler yanimlanan proporty'lerde (field) initial değer alma zorunluluğu yoktur.
 *interface'lerde başka bir interface'i implement " : iki nokta işareti ile " edilebilinir.miras alabilir.
 */
interface Named {
    val fullName: String?
    //val fullName: String? = "sdasd"
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val fullName: String?
        get() = "$firstName--$lastName"
}


/**Eğer implement edilen bir interface ,başka bir interface'i implement ediyorsa ve bu interface'in
 * uyeleri child interface'de override edilmis ise, Child interface'i implement eden class'da,
 * bu property'nin override edilme zorunluluğu kalkar.
 *
 * Eğer bir Abstract class bir interface'yi implement ediyorsa, o interface'sin override edilmesi
 * zorunlu fonksyonlarının override etmeyebilir. Abstract class'lar için bu opsiyoneldir.Örnek olarak bakabilirsin"Employeee2"
 */
class Employeee3 : Person {
    override val firstName: String
        get() = TODO("Not yet implemented")
    override val lastName: String
        get() = TODO("Not yet implemented")

    override val fullName: String?
        get() = super.fullName
}

abstract class Employeee(
    override val lastName: String,
    override val fullName: String?,
    override val firstName: String,
    val position: Int
) : Person

abstract class Employeee2 : Person {
}

/**Bir class Abstract ise bir interface'i implement ettikten sonra bu interface'in fonksyonlerinin
overide etmek zorunda kalmiyor. (Yukarıdaki örnekte ver)
 *
 * Bir interface icerisindeki fonksyonlerdan body'si olanlar override edilmek zorunda değildir.
 * Body'si olmayan tum fonksiyonlar ise class'a implement edildiğinde override edilmek zorunda.
 *
 * Property'ler (field) de interfaceler tanımlanabilir.
 * Property'lerden de değer atamasi yapilmamis olanlar zorunlu olarak override edilirler,
eğer property get fonksiyonu ile bir statik değer geri döndürüyorsa,override etme zorunluluğu kalkar.
 *
 * Interface icersine tanimli ve override edilme zorunluluğu olan property'ler (field)
primary constructor icerisin de override edilebilirler.
 *
 *Body'si olan (override edilme zorunluluğu olmayan) bir interface fonksiyonu overide edilirse,
overide edildiği yerde Body'si icersinden super'i çağırilabilir.(çağırmak zorunlu değildir).
 */

class Child(override val prop: Int) : MyIntegerface {
    //override edilmesi zorunlu değildir.
    override val proportyWihImplement: String
        get() = "proporty"

    // body'si olduğu için override edilmesi zorunluluğu yoktur.
    override fun foo() {
        super.foo()
    }

    override fun foo2() {
        TODO("Not yet implemented")
    }

    override fun bar() {
        // super.bar()   // body'si olmayan bir değişkenin super'i çağıralamaz.Neden yaptığı bir ,işme yoktur.
    }
}

//////////////////////////////////
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

class C : A {
    override fun bar() {
        println("Bar")
    }
}

/**
 * Birdan fazla İnterface bir classA tanımlanabilir.
 *
 * Birde fazla interface bir class'a tanımlanırken aralardına (,)virgül koyulur.
 *
 * ":" isareti sonra eklenen yapıların hangilerinin class(inheritance)
 *hangisinin interface (implement) olduğunu karistirmak icin bu yapilarin sonuna bakilması lazım.
 *Sonunda () parantezlerin goruyorsanız :  'dan sonra gelen yapı class'tir
 * (inheritance) miras alma islemi yapiliyordur. () yoksa interface'dir.(implement) islemi yapılıyordur.
 */

open class E() {

}

/**
 *  2 farkli interface'in ayni fonksiyonlari olmasi durumunda, bu fonksyonlerin override edilmesi
 *  sirasinda ayni fonksiyonu 2 kere yazarak override edemeyiz.
 *
 * Eger implement ettigimiz interface'lerin ayni isinde fonksivonlari bulunuyorso, tek bir fonksiyon
override islemi yapilir. Bunun icerisinden hangisinin body'sine erismek istiyorsak
 * o interface'in ismini <> isgretleri grasing yazmamiz gerekiyor.
 *
 * Eğer implement edilen 2 interface de aynı fonksyon varsa bu durumda body'leri olsa da
 * override edilmeleri zorunludur.
 */

class D : E(), A, B {
    override fun foo() {
     //   super.foo()
        super<A>.foo()
        super<B>.foo()
    }


    override fun bar() {

    // super<A>.bar() //  A interface'inin bar fonksyonunun body'si yok. Dolayısıyla super ile erişilemez.
        super<B>.bar() // <B> arayuzu yazmak zorunlu kalmiyorsunuz. Buna redutant uyarısı verilir.
        super.bar()
        println("asd")
    }

}
/**
 * Ara yüz belirteci olarakta interface kullanılır.
 */






























