package `4-Class`

/** Okunuşu Proporty
 * Kotlinde herşey default olarak public'tir.
 * ESM kodu = Makine kodu demektir.
 *
 * Bir değişken tanımladığınızda onun get ve set fonksyonlarını tanımlamış oluyorsunuz. Eğer bu fonksyon Public ise başına public yazmanıza gerek yok.
 *Ama private yaptığınızda ise değişen şey bu beğişkenin get ve set fonksyonlarının uazılmamasına neden olucak.
 *
 * Özetle siz hiçbirzaman gerçek anlamıyla değişken tanımlamıyorsunuz.Tanımlıyomuş gibi görüyorsunuz.
 */
class BankAccount {
    var balance = 1_000_000
        /** Mesela şuda yapılabilinir Bir public değişkenin Set fonksyonuunu private ye çekebilirsiniz.->
         *   Aynı zamanda Get fonksyonunuda private yapabilirsiniz.
         */
        get() {
            return field
        }
        // private set(value) {
       set(value) {
            field = value  //field = teknik ismi backing field
        }

    private var dep = 1_500_000
        set(value) {
            field = value
        }
        get() {
            return field
        }

//private > protected > internal > public gizlilik olarak


    fun uyeFonksyon() {
        balance

    }


}


/**bir değişkeni tanımladığımızda get ve set fonksiyonları arka planda field(Değişken) ismi ile otomatik generate ediliyor
 * getDegisken() ve setDegisken() gibi
 */

fun main() {
    val bankAccount = BankAccount()
    println(bankAccount.balance)
    bankAccount.balance = 500_000
    println(bankAccount.balance)


    //  private olduğundan çalışmıyor.
//    println(bankAccount.dep)
//    bankAccount.dep = 500_000
//    println(bankAccount.dep)
}

class deneme {
   private var asrin = "samet"
        get() {
            return field
        }
        set(value) {
            field = value
        }
}