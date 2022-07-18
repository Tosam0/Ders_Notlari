package `4-Class`

/** object keywordu koyunca oluşuyor.
 *
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















