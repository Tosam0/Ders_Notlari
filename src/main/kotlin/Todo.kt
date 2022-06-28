import `3- functions`.NewsType

//todo  crtl+ alt +L == satırları düzelit
//todo shift + F6 isimi değiştir
//todo ctrl+ d üsteki, satırı kopyalar.
//todo crtl+ r Bulma
//todo "ctrl+ /"  yorum satırı yapar.
//todo ctrl + alt + SHIFT + L //kod düzenlemesi yapar
//todo shift+Shift Show Kotlin By Code + Heryerde arama yapmak için kullanılır.
fun main() {

    val okkes = Ökkeş()
    okkes.hiderorder { title, getfilter ->
        //   println("ökkes")
    }
    val newsType = NewsType1()
    okkes.getfunctions("Kanal", newsType) {
        println(this.toString())
    }
    val mainLee = Lee("ahmet", "Açık", "Red", 1.999)
    val mainTee = Tee("samet", "Blue",2,16.4)
    val mainSee = See("ayben", "Yellow", 2)
    val mainUee = Uee("ismail")
    mainLee.drips()
    mainTee.drips()
    mainSee.drips()
    mainUee.drips()


}

open class NewClas2(val name: String) {
   var xColor: String = ""
    var sıfır1_1 = 0
   var Names: String = ""
    var sıfır2_2 = 0.0
    var Ten: String = ""

    // init {
    //    Names = name
    //    "isim".printLOGs()
    //  }
    constructor(name: String, Xcolor: String, sıfır1: Int, sıfır2: Double) : this(name) {
        Names = name
        xColor = Xcolor
        sıfır1_1 = sıfır1
        sıfır2_2 = sıfır2
        "tree $xColor $sıfır2".printLOGs()
    }

    constructor(name: String, Xcolor: String, sıfır1: Int) : this(name) {
        Names = name
        xColor = Xcolor
        sıfır1_1 = sıfır1
        "two $name".printLOGs()
    }

    constructor(name: String, ten_colors: String, Xcolor: String,sıfır2: Double) : this(name) {
        Names = name
        Ten = ten_colors
        xColor = Xcolor
        sıfır2_2 = sıfır2
        "secondary $Names".printLOGs()
    }


    fun String.printLOGs() {
        println(this)
        println("/////////////////////")
    }

    open fun drips() {
        println("name :$name")
        println("Ten : $Ten")
        println("color: $xColor")
        println("sıfır1: $sıfır1_1")
        println("sıfır2: $sıfır2_2")
    }

}


class Tee(name: String, Xcolor: String, sıfır1: Int, sıfır2: Double) :
    NewClas2(name,Xcolor,sıfır1,sıfır2) {

    override fun drips() {
        super.drips()
        val tee = """"
      ---------------
            |
            |
            |
            |
            |
        """.trimIndent()
        println(tee)
    }
}

class Lee(name: String, ten_colors: String, Xcolor: String, sıfır2: Double) :
    NewClas2(name,ten_colors,Xcolor,sıfır2) {
    override fun drips() {
        super.drips()
        val lee = """"
            ||
            ||
            ||
            ||
            ||
            |__________   
            -----------                   
            """.trimIndent()
        println(lee)
    }
}

open class See(name: String, Xcolor: String, sıfır1: Int) : NewClas2(name, Xcolor, sıfır1) {
    override fun drips() {
        super.drips()
        val see = """
           ******************
           *
           *
           *
           ******************
                            *
                            *
                            *
           ******************                 
           """.trimIndent()
        println(see)
    }
}

class Uee(name: String) : See(name, "Black", 69) {
      override fun drips() {
        super.drips()
        val uEE = """
            **       **
            **       **
            **       **
            **       **
            ***********
            ***********                              
            """.trimIndent()
        println(uEE)
    }


}


fun Ökkeş.getfunctions(strk: String, newsType: NewsType1, getnew: NewsType1.(Int) -> Unit) {
    when (strk) {
        "Kanal" -> {
            getnew(newsType, 2)
        }
        "A haber" -> {
            getnew(newsType, 2)
        }
        "fox tl" -> {
            getnew(newsType, 2)
        }
        "knaltürk" -> {
            getnew(newsType, 2)
        }
    }

}


fun Ökkeş.hiderorder(hiderrorder: (title: String, getfilter: () -> String) -> Unit) {

    val deneme1 = {
        "ahmet"
    }
    val deneme2 = fun(): String {
        return "ayben"
    }

    val deneme3 = fun(): String = "çağrı"

    fun deneme4(): String {
        return "hasan"
    }


    hiderrorder("aykun") {
        "ahmet"
    }
    hiderrorder("samet", deneme1)
    hiderrorder("ismail", deneme2)
    hiderrorder("çağla", deneme3)
    hiderrorder("ayberk", ::deneme4)
}


class Ökkeş() {
    fun getNewsType(newsType: String): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"
        }
    }


}

class NewsType1 {
    companion object {
        val breakingNews = "BreakingNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
        val normal = "Normal"
    }
}
