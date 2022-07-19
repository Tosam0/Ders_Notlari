package `4-Class`

/** object keywordu koyunca oluşuyor.
 *  Özünde herhangi bir class'tan birden fazla obje oluşturduğumuzda bunlar memory'de
 *  ayrı ayrı yer kaplar.
 *  Singleton ise bir class'ın dışarıdan birden fazla instance'ını oluşturmayı engeller.
 */

object ProfileKotlin {
    var nickName: String? = null
    var counter: Int = 0
}

fun main() {
    ProfileKotlin.nickName = "Ahmet"

    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++

    println(ProfileKotlin.counter)
}













