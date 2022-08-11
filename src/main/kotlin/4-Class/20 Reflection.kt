package `4-Class`

import java.lang.reflect.Field

class WalPaper {

    private var imageUrl: String = "www.google.com"
    private var id: Int = 1234
    private var type: Int = 3
    private var height: Int = 32
}

fun main() {
    val walPaper = WalPaper()
//    walPaper.imageUrl
//    walPaper.id
//    walPaper.type
//    walPaper.height

    val imageUrlField: Field = walPaper.javaClass.getDeclaredField("imageUrl")

    imageUrlField.isAccessible = true

    val imageUrlString = imageUrlField.get(walPaper)

    println(imageUrlString)


}