package `4-Class`

import `4-Class`.News as News

class Media

/**Value yi tüttüğümüz claslar data clastır.

 * Data clas'en azindan mutlaka 1 paremetre almak zorundadir.
 * Paremetreler mutlaka val ya da var ile tanımlanır.
 * Open, abstract, sealed, inner class yapılmaz.
 *Tüm data class'lar final olduğu için final modifier'i redundant uyarısı verir.
 *
 *equals(equls-okunuş), heshCode , toString,copy, componenetN fonksiyonları arka planda defoult olarak oluşturulurlar.
 *
 *Yukarıdaki fonksiyonlardan biri override edilirse, oto generate edilen hali yazılmaz.
 *
 *compenentN fonksiyonlari sebebiyle destructturing declaration olarak data class'lar set edilebiliniyor.
 *
 *toString gibi fonksiyonlar primary const. değişkenler kullandiği için val yada var yazılmak zorundadır.
 *
 * Pair, Triple ozellestirilmis generic data class'lar mevcut.
 */

 data class News(//parantezin içindekilere componenetN denir.
    val title: String = "Title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>

) {

    val relatedNewsList: List<News> = arrayListOf()

    override fun toString(): String {
        return "super.toString()"
    }

    fun log() {
        println("Title: $title, description :$description")
    }
}


/**
 * İki Clası aynı gibi duruyor farkları ise
 */
class NewsData(

    val title: String = "Title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
) {
    val relatedNewsList: List<News> = arrayListOf()

    override fun toString(): String {
        return "Title:" + this.title + "description=" + this.description + "hasMediaContent=" + this.hasMediaContent + "mediaList:" + this.mediaList
    }

    fun copy(): NewsData {
        return NewsData(title, description, hasMediaContent, mediaList)
    }
}

fun main() {
    val newsOne = News(
       title = "Ynei bir eğitim",
        description = "Eğitim dönemi yeni bir şekli",
        hasMediaContent = true,
        mediaList = arrayListOf()
    ) //Farklı yazılış yöntemi yukarıdaki ile aynısını yapar.
//    val newsOne1 = News(
//        "Ynei bir eğitim",
//        "Eğitim dönemi yeni bir şekli",
//        true,
//        arrayListOf()
//    )
    val newsTwoDuzClass = NewsData(
        title = "Yeni bir eğitim",
        description = "Eğitim dönemi yeni bir şekli",
        hasMediaContent = true,
        mediaList = arrayListOf()
    ) //Name argumentleri vermek zorunda değiliz aşşağıdaki farklı yöntemi
//  val newsTwoDuzClass1 = NewsData(
//        "Ynei bir eğitim",
//         "Eğitim dönemi yeni bir şekli",
//       true,
//      arrayListOf()
//    )
    /**"destructturing declaration" aşağudaki gibi --->
     *  Eğerki bizim bir dataclass'ımız varsa bu dataclassı'ın içierisindeki değişkenleri basitce
    val yazıp parantezler içerisine herhangi bir değişken ismi yazarak
    o dataclas'daki değişkenlere erişebilirsiniz.
     */
    val (title, description, hasMediaContent, mediaList) = newsOne
    val (title1, description1, hasMediaContent1) = newsOne
    var (title2, description2) = newsOne
    //val (title1, description1, hasMediaContent1, mediaList1) = newsTwoDuzClass //Düz clasta yapılamaz
    title2 ="assadas"

    newsOne.mediaList
    mediaList


    /**  equals = değişkenlerini karşılaştırma yapılıyor.
     *   hashCode = Classların oluşturduğu hashCodeStringi var bağzen elinizdeki objenin
    gerçekten elinizdeik diğer objenin birebir aynısı olup olmadığını karşılaştırmak için yapılır.
     *   toString = clasın içerdiği verileri almak için.
     *   copy = ise o class'ın bire bir aynısını oluşturmamıza yariyacak.
     */
    newsOne.toString()
    newsOne.hashCode()

    val newsThree = newsOne.copy(description = "Farklı description")
    val newsFour = News(
        title = newsOne.title,
        description = "Farklı",
        hasMediaContent = newsOne.hasMediaContent,
        mediaList = newsOne.mediaList
    )

    newsOne.component1()

    newsOne.relatedNewsList
    newsOne.title

    // newsTwoDuzClass.equals()
    newsTwoDuzClass.toString()
    newsTwoDuzClass.hashCode()
    //  newsTwoDuzClass.copy()
    //  newsTwoDuzClass.compo

    println("Data Class toString: $newsOne")
    println("Data toString: $newsTwoDuzClass")

    val pair = Pair("ahmet", "aykun")
    val (firet, asdasd, asdas) = Triple("ahmet", "aykun", 23)
}






