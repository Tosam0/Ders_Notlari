package `4-Class`

/**Claslar Önemli İş görüşmelerinde çıkar
 * todo -77(1:14)dk bak dk44 encapsulation anlamı Kekod - Ders15 : Kotlin Classes
 * okunuşu Visibility Modifair
 *public — Her yerden erişilebilir. public kelimesi halka açık anlamına gelmektedir. Bu erişim belirleyicisi ile tanımlanan her şey diğer bütün sınıflarlardan erişilebilinir. (Java ile aynı)
 *private — Sadece tanımlandığı sınıftan erişilebilir. private özel veya gizli anlamına gelir. Bu erişim belirleyicisi ile tanımlanan herhangi bir eleman sadece ve sadece aynı sınıf içerisinden erişilebilir diğer sınıflar erişemez. (Java ile aynı)
 *protected — Aynı sınıftan ya da o sınıftan türetilen sınıflar, nesneler tarafından erişilebilir. (Java’dan biraz daha farklı)
 *internal —Aynı modül içindeki diğer sınıflar erişebilir. (Java’da yok)
 *
 *
 */

//protected val carName="asd" //prtected'ın tab lw(üst lavel) tanımı olamaz.
val carName="asd"

fun getCArd():String{
    return "asdas"
}

open class Foo() {

    val name1 = "Gokhan"
    private val name = "Gokhan" ///classın dışından herhangi biryerden erişilemez.
    public var surName = "Ozturk" //heryerden erişilebilinir.yazmana gerekyok defoult değeridir.
    internal val age = 24 // todo bu kısmı araştır. modüüler arasında public modüller dışına çıktığında private olur
    protected val emaill = "ahmetaykun@gmail.com"
    //protected->Miras alan kişiler,claslar sadece kullanabilir. child class'larda public- harici tüm classlarda private

    fun printName() {
        println("$name1")
        println("surname: $surName")
        println("Email: $emaill")
        // println($age)
        // println($email)
    }
}




class Boo private constructor() : Foo() {
    init {
        //   name
        surName
        age
        emaill
    }
}

class Doo() {
    init {
        val foo = Foo()
      //  foo.name
        foo.surName
        foo.age
        //  foo.email
    }

}


fun main() {
    val foo = Foo()
     //  foo.name = "asdasd"
    foo.surName = "aykuns"


}