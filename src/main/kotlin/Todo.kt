import `3- functions`.News
import `3- functions`.NewsType

//todo  crtl+ alt +L == satırları düzelit
//todo shift + F6 isimi değiştir
//todo ctrl+ d üsteki, satırı kopyalar.
//todo crtl+ r Bulma
//todo "ctrl+ /"  yorum satırı yapar.
//todo ctrl + alt + SHIFT + L //kod düzenlemesi yapar

fun main() {

    val okkes = Ökkeş()
    okkes.hiderorder { title, getfilter ->
        println("ökkes")
    }
    val newsType=NewsType1()
    okkes.getfunctions("Kanal",newsType){
        println(this.toString())
    }


}



fun Ökkeş.getfunctions(strk:String,newsType: NewsType1, getnew:NewsType1.(Int)->Unit){
    when(strk){
        "Kanal" ->{
            getnew(newsType, 2)
        }
        "A haber" ->{
            getnew(newsType,2)
        }
        "fox tl" ->{
            getnew(newsType,2)
        }
        "knaltürk"->{
            getnew(newsType,2)
        }
    }

}




fun Ökkeş.hiderorder(hiderrorder: (title: String, getfilter: () -> String) -> Unit) {

    val deneme1 = {
        "ahmet"
    }
    val deneme2 = fun ():String{
       return "ayben"
    }

    val deneme3 =fun ():String = "çağrı"

    fun deneme4 ():String{
        return "hasan"
    }


    hiderrorder("aykun") {
        "ahmet"
    }
    hiderrorder("samet", deneme1)
    hiderrorder("ismail",deneme2)
    hiderrorder("çağla",deneme3)
    hiderrorder("ayberk",::deneme4)
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
