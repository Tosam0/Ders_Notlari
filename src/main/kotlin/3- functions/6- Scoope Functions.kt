package `3- functions`

import java.math.BigDecimal

/**
 * Scope Fonksiyonlar yazılan kod’un anlaşılır olması, sade olması ve okunabilirliğini arttıran
 * fonksiyonlardır.
 *
 * Kotlin’de 5 adet Scope Fonksiyonu bulunmaktadır :
 *
let
run
with
apply
also
 **********************************
 * run ile let fonksiyonları birbirlerine benzemektedir. İki fonksiyonda geriye lambda sonucunu
 * döndürmektedir. Bu iki fonksiyonu birbirlerinden ayıran özellik ise nesneye erişimde let it
 * kullanılır, run ise this kullanmaktadır. Her iki fonksiyonu kullanarak kodunuzu sade ve okunabilir
 * hale getirebilirsiniz.
 *************************************
 *
 *
 */
data class BankAccount(
    val accountBalance: BigDecimal?,
    val accountName: String?
)

fun main() {
    var bankAccount: BankAccount? = null
    bankAccount = BankAccount(
        2565665.65.toBigDecimal(),
        "İsmail"
    )
    if (bankAccount != null && bankAccount.accountName != null) {
        println(bankAccount.accountName)
    }
///////////////////////////////////////////
    /** Nesneye erişim lambda argümanı it vasıtasıyla gerçekleşir ve geriye lambda sonucunu döndürür.
    let fonksiyonunda genelde null kontrolü yapılıp, değer null değilse belirlenmiş bir kod bloğunun
    çalıştırılmasında kullanılır.
     *
    let fonksiyonu, lambda ifadesinin sonucunu geriye döndürüyor. Bu geriye döndürülen değeri
    kullanarak bir local değişkene atama yapılabiliyor.
     */

    bankAccount.let {
        if (bankAccount != null && bankAccount.accountName != null) {
            println(bankAccount.accountName)
        }

        if (it != null && it.accountName != null) {
            println(bankAccount.accountName)
        }

    }
    /** run, T tipi üzerine tanımlanmış olan bir Extension Function.
     *
     */


    bankAccount.run {
        if (bankAccount != null && bankAccount.accountName != null) {
            println(bankAccount.accountName)
        }
        if (this != null && this.accountName != null) {
            println(bankAccount.accountName)
        }

    }

    run {
    }

    /** with, Top-Level fonksiyondur. Nesneye erişmek için this ifadesi ile kullanılır ve geriye
     * lambda sonucunu döndürür.
     *
     * Şu ana kadar görmüş olduğumuz fonksiyonlardan farklı olarak , işleme girecek olan nesne with
     * fonksiyonuna bir parametre verir. İkinci parametre ise bu nesne üzerinde yapılması istenen
     * lambda ifadesidir. with, yazılan kodu yalınlaştırmak ve gereksiz tekrarlardan korunmak için
     * kullanılır.
     */

    with(bankAccount) {
        if (bankAccount != null && bankAccount.accountName != null) {
            println(bankAccount.accountName)
        }

        if (this != null && this.accountName != null) {
            println(bankAccount.accountName)
        }

    }

    /** Nesneye erişmek için it ifadesi kullanılır ve geriye nesneyi döndürür.
     *
     *also, almış olduğu lambda ifadesini nesne içinde çalıştırır ve bu nesneyi geri döndürür.
     * Nesneye it ifadesiyle erişilir. also, Lambda parametresi üzerinde yapılacak olan işlemlerde
     * tercih ediliyor.
     *
     *
     */

    bankAccount.also {
        if (bankAccount != null && bankAccount.accountName != null) {
            println(bankAccount.accountName)
        }

        if (it != null && it.accountName != null) {
            println(bankAccount.accountName)
        }

        /** Nesneye erişim this ifadesiyle sağlanır ve geriye nesnenin kendisini döndürür.
         *
         * apply, üzerinde çağrıldığı bir nesne bağlamındaki kod bloğunu çalıştırır ve nesnenin kendisini
         * geriye döndürür.
         */
    }
    bankAccount.apply {
        if (bankAccount != null && bankAccount.accountName != null) {
            println(bankAccount.accountName)
        }

        if (this != null && this.accountName != null) {
            println(bankAccount.accountName)
        }

    }

/** let , apply ,with() , bunlar başta oluyor.Arada bir yerde kullanmamalısın.
 *
 *  also en başta olmamalı. Kesin olarak arada olmalı.
 *
 *  run en baştada olabilir. Arada biryerdede olabilir.
 */

bankAccount.run {
    this.accountBalance?.let {  }
}


}








