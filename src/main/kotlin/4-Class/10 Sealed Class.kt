package `4-Class`

import `4-Class`.TeamsFunctionlity as TeamsFunctionlity

/**
 * sınırlı kume,gruplanabilir, class'lar yazmayı sağlar.
 * kısıtlanmis bir class hiyararsisi kurabilmemizi sağlar.
 * Bu class'lar arka planda static olarak tutulmazlar. Enumation'lardan en büyük farkı budur.
 * Enum'lar verileri gruplarken, seald class'lar class'larin gruplar.
 *
 * Sealed class'lar abstract class'lardır aynı zamanda.Abstack oldukları içic open olmazlar.
 * Sealed class'lar Abstract class oldukları için final olmazlar. Anlamsal olarak zaten sacmadır.
 *
 * Sealed class'ların nesnesi olusturulmaz.Constructor'ları protected ve private  olarak bulunur.
 *
 * Sealed class'ları miras alan subClass'lar final oldukları için miras alınmazlar.SDK'ler için onemlidir.
 *
 * Sealed class'ın subclass'lerinin neler olduğu coplitime'dabilinmektedir.Bundan dolayı when ve if yapmöanıza
yapı else case'lerinin yazılina ihtiyac duymazlar.
 *
 *Sealed class'arı extends olan subcClass'lar eskiden aynı dosya üzerinde bulunma zorunluluğu vardi.
Bu zorunluluk esnetilerek aynı package içerisinde olaya kadar genisletildi.
Ancak aynı package dışına cıkıp, bir subClass'a sealde class'ı miras olarak vermek isterseniz buna izin vermez
Özellikle SDK yazarken bu kısıtlama önemlidir.
 *
 * sealed class'lar icerisine object tanımlamları da yapılabilir.
 * sealed class'lar icerisine sadece object tanımı yapıyorsanız, bu kullanım enumaration'dan teknik
olarak hicbir farkı kalmıyor.
 */


sealed class Response
class Success : Response(){
}
class Error : Response(){
}

sealed class Response2 {
    class Success2 : Response(), TeamsFunctionlity { //interface yi overide edebiliriz.
        override fun pratice() {
            super.pratice()
        }
    }
    class Error2 : Response(){
    }
}

fun handle(response: Response) {
    when (response) {
        is Success -> {
            // response'dan gelen bilgiyi ui'ini doldur.
        }
        is Error -> {
            // pop-up ile kullanıcıya bilgi ver.
        }
    }
}

//bu yanlıstir. enum kullanmanız gerkiyor.


sealed class PaymentOption {
    // object keywordu arka planda static yapar.
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {
    Cash, Card, Transfer
}


fun main() {
    val success = Success()
    val error =Error()
    handle(success)
    handle(error)


    PaymentOption2.Cash.name
}
















