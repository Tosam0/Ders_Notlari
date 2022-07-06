package `4-Class`

/**
 * Nested class'lar outer class'ın uye property'lerine ya da fonksyonlarına erişemezler.
 * Nested class'lar static olarak saklanirlar.Bundan dolayı da outher class üzerinden neyneye
istemeniz durumunda "Other.NestedClass()" şeklinde erişebilirsiniz.
 *
 * Inner class'lar static olarak tutulmazlar. Bundan dolayı erişim yapmak istediğinizde
 * "Outer().InjnerClass()" şeklinde outer class'ın da ıntestance'ini oluşturmanız gerekmektedir.
 * Bundan dolayı ınner class outer class'ın tum elemanlarına erişebil. private olsa dahi.
 *
 *Inner class'ın icerisinde yeni bir nested class eklememetedir. Ancak yine inner class e
 *
 *Nested Class'ın icerisne ise bir nestted ya da inner fark etmeksizin class ekleyebilirsin.
 */

//Outer dış klass anlamında
class Outer {
    private val name = "Ahmet"
    val surname = "Aykun"
    fun getAge(): Int = 55

    class NestedClass { ///kısacası clasın içersindeki class'adenir
        fun prinName() {
//            name
//            surname
//            getAge
        }

//        fun prinName(outer: Outer) {
//            outer.name
//            outer.surname
//            outer.getAge()
//        }
    }
}

interface OutherInterface {
    class DenemeA
    interface NestedInterface
}

////////////// 21.26
class Outer2 {
    private val name = "Ahmet"
    val surname = "Aykun"
    fun getAge(): Int = 55

    //Kullanımı
    inner class InnerClass {
        fun prinName() {
            name
            surname
            getAge()
        }
    }
}


fun main() {
    val outer = Outer()

    Outer().getAge()
    Outer().surname
  //    Outer().name

    Outer.NestedClass().prinName()
  //  Outer.NestedClass().prinName(outer) //memory leak oluşturur.
    //  Outer().NestedClass().prinName()



    val outher2= Outer2()
    outher2.getAge()
    outher2.surname
   // outher2.name
    Outer2().InnerClass().prinName()

}



