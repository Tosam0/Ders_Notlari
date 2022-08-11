package `4-Class`

/** object keywordu koyunca oluşuyor.
 *
 *  Özünde herhangi bir class'tan birden fazla obje oluşturduğumuzda bunlar memory'de
 *  ayrı ayrı yer kaplar.
 *  Singleton ise bir class'ın dışarıdan birden fazla instance'ını oluşturmayı engeller.
 */
open class Person1() {

}

object ProfileKotlin {
    var nickName: String? = null
    var counter: Int = 0
    fun multiple(c: Int, x: Int): Int = x * c

}

fun main() {

    ProfileKotlin.nickName = "Ahmet"

    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++

    println(ProfileKotlin.counter)
    var result =ProfileKotlin.multiple(3,66)
    println("sonuç: $result")
}

/**1) Singleton pattern nedir?
Bir class nesnesinin, memory'de herhangi bir T anında, 1 tane olmasina object singleton diyoruz.
class'in nesnesinden memory'de ayni anda sadece 1 tane olmasini istiyoruz.
Her ekranda, kullanimda yeni bir nesne olusturmak istemeyiz.

2) Singleton pattern'in eksileri nedir?
Java karsiliginda static keywordu ile yazildigi icin, yanlis ve gereksiz kullanimlarda (ornek veri tasimak icin kullanmak)
garbage collector'in toplamadigi veri sayisi artacak.
Bu da memory leak'e sebep olabilir.
 */


/**
 *  Ozetle JAVA'da 3 adimda yapilir;
 *
 *  1- Constructor'i private olarak olustur
 *  2- Class'in icinde kendisinin degiskenini olustur (volatile static olarak)
 *  3- Bu degiskeni donduren bir newInstance() fonksiyonu yaz (synchronized static olarak) -- null check yaparak --
 *
 */











