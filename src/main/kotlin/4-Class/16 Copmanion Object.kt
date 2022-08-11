package `4-Class`

/**
 * Java’dan farklı olarak Kotlin’de static fonksiyon ya da property tanımlayamayız bunun için
 * companion object kullanırız. Companion object bir Singleton’dır ve üyelerine doğrudan içinde
 * bulunduğu sınıfın adı üzerinden erişilebilir.
 *
 * Companion object oluşturabilmemiz için object decleration’ının önüne companion keyword’ünü
 * yazmamız gerekir.
 *
 */

interface HomeFragmentPresenter {
    fun navigate()

   // val surname = "Aykun"

    val surname
       get() = "Aykun"

    fun setSurnemae():String{
        return "Aykun"
    }

    companion object {
        val name = "Aykun"
    }
}

abstract class BaseFragment() {

}

class HomeFragment {
    //  const val TAG :String ="HomeFragment"
    var color = "Red"

    //İsimsiz de yapılabiliniyor.
    companion object Named : BaseFragment(), HomeFragmentPresenter {//:HomeFragmentPresenter
        /**
         *Burada dikkat edilmesi gereken nokta ise, const keyword’ü değişmeyen değişken anlamına
        gelir. const val değişkenleri ya class’ın üzeride top-level olarak belirtmemiz lazım yada
         *companion object içinde kullanmamız lazım.
         */
        const val TAG: String = "HomeFragment"


        var BASE_URL = "www.google.com.tr/"

        var homeFragment: HomeFragment? = null
        fun newInstance(): HomeFragment {
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }

        override fun navigate() {

        }
    }
}

class CompanionClass {
    companion object {
        var name = "Joe"

        /**Eğer companion object’lerinizi Java tarafında çağırmak istiyorsak, bunun için @JvmStatic
         * annotation’ını kullanmalıyız.
         *
         * @JvmStatic annotation’ı arka tarafta class oluşturmaz ama companion object içerisindeki
         * değişkenlerin static türünde getter ve setter’larını oluşturur.
         */
        @JvmStatic
        var BASE_URL3 = "www.google.com.fr/"
            get() {
                return field
            }
            set(value) {
                return
            }
    }
}


fun main() {
    /**
     * Ayrıca companion object ismini silebiliriz, çağırdığımızda ise "Companion" keywordü ile
     * çağırabiliriz.
     */
    //  HomeFragment.Companion.TAG
    HomeFragment.BASE_URL
    CompanionClass.BASE_URL3
    HomeFragment.TAG

    println(HomeFragment.BASE_URL)
    println(CompanionClass.name)
    println(HomeFragment.TAG)


    val homeFragment = HomeFragment.newInstance()
    homeFragment.color = "Blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "Yellow"
    val homeFragment3 = HomeFragment.newInstance()
    homeFragment3.color = "Cyan"

    println("homeFregment color : ${homeFragment.color}")
    println("homeFregment color2 : ${homeFragment2.color}")
    println("homeFregment color3 : ${homeFragment3.color}")



}

