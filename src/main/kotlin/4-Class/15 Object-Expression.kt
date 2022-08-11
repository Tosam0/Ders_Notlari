package `4-Class`

import printLN

/**
 *Open olan bir class dan türetilen instance’a, Interface olan bir classı implement etmek
 * istediğimiz de Object Expression kullanırız. Şöyle bir senaryo düşünün bir şirkette var olan
 * class’a bir interface implement etmemiz halinde yapıda değişiklikler oluşacaktır.
 * Örneğin interface’de tanımlı olan body’siz fonksiyonları class içerisinde zorunlu override
 * etmemiz gerekecek. Bu gibi durumlarda classın instance’ı oluşturulurken object keywordu ile
 * dilediğimiz interface’i sadece o instance için implement edebiliriz.
 *
 * Sonuç olarak 2 nedenden dolayı kullanamıyoruzdur;
1--Ya class’ın içine kod yazamıyoruzdur.
2--Ya da class birden fazla yerde kullanılıyordur, interface’i ona implement ettiğimizde her yeri
etkileyeceği için. Kii biz de bu durumu istemediğimziden interface’i class’ın instance’ına
implement ederiz.
 *
 *
 */

interface Print2 {
    fun onPrint()
}

open class User(val age: Int) {
    open fun getUserFullName() {}
}

open class MultiInheritance {
    val name: String = "Samet"
}

class ObjectExperessionTest() : MultiInheritance() {
//  val fullName: User = object : Print2, User(23) {
    val fullName: Print2 = object : Print2, User(23) {
        val firstName = "Ahmet"
        val surName = "Aykun"

        override fun onPrint() {
            println(firstName + surName)
        }

//    override fun getUserFullName() {
//        super.getUserFullName()
//        println("ada")
//    }

        override fun toString(): String {
            return "$firstName $surName"
        }
    }
}

fun main() {

    val objectExperessionTest = ObjectExperessionTest()
    objectExperessionTest.fullName.onPrint()

    println(objectExperessionTest.fullName)

    // Hiç birşey yazmazsak Ayn olarak yazılıyor.
    val city = object : Print2 {
        val bigcy = "asdas"
        val bigcy2 = "asdasads"
        override fun onPrint() {
            println("asdasdsfsa")
        }
    }
    "Ahmet".printLN()

}

class Object_Declarations {}
/**Object Declarations NEDİR?
Kotlin ile singleton yapısını kullanmak istediğimiz de object keywordu ile başlayıp dilediğimiz
isimlendirmeyi yaptıktan sonra süslü parantezler(body) içerisinde değişken ve parametre
tanımlamaları yaparız. Class yapısında türetilen obje deki değişiklikler sadece o sınıf
içerisinde geçerli olurken, Object Declarations ile yapacağımız değişiklikler diğer tüm
kullanımlarda etkili olacaktır. Farklı class’lar da yapılan değişikliler tüm çağırımlardan
okunabilecektir.
 *
 */