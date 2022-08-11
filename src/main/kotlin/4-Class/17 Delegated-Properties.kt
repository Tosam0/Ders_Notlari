package `4-Class`

/**by lazy yada lateinit var'ı Uyğulama ayağa kalıktıktan, ekran çizildikten herhangibir T zaman
 *sonra yada yada kullanıcının alıcağı herhangi bir aksiyondan sonra ithiyacımız olcaksa
 *ozaman kullanmamız gerekiyor.
 *
 * lateinit türkçesi geç ilk değer ataması yap.
 *
 *Bunu kullanmamız için ekran ilk açıldığında bunlara ihticacımız olmaması lazım.
 *
 */

data class User5(
    var name: String = "Ahmet",
    val surname: String = "Aykun"
)

class CardDetailFragment {
    /**
     * lazy, sadece val değişkenlerde kullanılabilir. Lazy fonksiyonuna verdiğimiz değer, biz “a”
     * değişkenine erişmek istediğimiz ilk anda ve sonrasında bize döndürülmüş oluyor.
     * Eğer değişkene hiç erişim sağlanmazsa, lazy fonksiyonu çağrılmamış olur.
     *
     */
    val user: User5 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("User5 init")
        User5()
    }

    /** lateinit var ile kullanılır.*/
    lateinit var user2: User5

    lateinit var userType: String

    fun printUserInfo() {
        println("name ${user.name},surname = ${user.surname}")

        if (this::user2.isInitialized) {
            user2 = User5()
        }
        user2 = User5()
        println("name = ${user2.name}, surname = ${user2.surname}")
        user2.name = "Mahmus"
    }

    init {
        userType = "userType"
    }
}

class BankAcount5(

    inline val balanceChanged: (Long) -> Unit
) {
    var balance: Long = 1_000_000
        set(value) {
            field = value


            if (value <= 100) {
                balanceChanged.invoke(value)
            }
        }
}

fun main() {
    var cardDetailFragment = CardDetailFragment()
    cardDetailFragment.printUserInfo()

    cardDetailFragment.printUserInfo()


}
