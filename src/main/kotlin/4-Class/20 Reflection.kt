package `4-Class`

import java.lang.reflect.Field

/** Encaptilation : Eğer bir class ınız varsa bunun içine değişkenler koyuyorsanız bu değişkenleri
 * private yapmanız gerekiyordu.Bu değişkenlere erişilecek olan funksyonları yani set ve get
 * fonksyonlarını publicte tutmanız gerekiyordu.
 *
 *Bunu geçersiz kılmanın yolu ->
 */

//class WalPaper private constructor(){
class WalPaper {

    private var imageUrl: String = "www.google.com"

    private var id: Int = 1234

    private var type: Int = 3
    private var height: Int = 32
    private var isGif: Boolean = true

    private fun prinLL() {

    }
}

/** Bir Classın içerisindeki private olarak duran değişkenleri ,private olarak duran fun'lar
 *  yada Class'ın private olan constructor() dahil buna erişebiliyoruz bunu yapmak için Class'ın
 *  İnstance'sini(Nesnesini) oluşturmanız "val walPaper = WalPaper()" Nesnesini üzerindende
 *  .javaClass'a geçmeniz yeterli daha sonrasında ise .getDeclaredField sonrasında ise yardımcı
 *  araclar kullanabilirsiniz.
 *
 *  Daha sonra ilgili Field'ın .isAccessible özelliğini "true" yapmamız gerekiyor.
 */
fun main() {
    val walPaper = WalPaper()
//    walPaper.imageUrl
//    walPaper.id
//    walPaper.type
//    walPaper.height
//    walPaper.isGif
    /** "imageUrl" isminin daha sonra değişmemesi gerekiyor. Sıralamasını.*/
    val imageUrlField: Field = walPaper.javaClass.getDeclaredField("imageUrl")

    val imageUrlFieldName = walPaper.javaClass.declaredFields[0].name
    val imageUrlField2: Field = walPaper.javaClass.getDeclaredField(imageUrlFieldName)

    /**Bu işlemden sonra private de olsa erişilebilir oluyor.*/
    imageUrlField.isAccessible = true
   imageUrlField2.isAccessible = true


    val imageUrlString = imageUrlField.get(walPaper)
    val imageUrlString2 = imageUrlField2.get(walPaper)

    println(imageUrlString)
    println(imageUrlString2)



}