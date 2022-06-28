import `4-Class`.printLog

fun main() {
    deneme2(1, 3, 24, 5, item = "ahmet", item2 = 1.2, item3 = "ahmet1")

    val a = 1
    val ab: Double = 1.2
    val abc = " deneme"

    val abcd = fun(surname: String): String {
        return "soyisim"
    }

    val denem = Newclas()
    denem ahmet "ahmet aykun"

    abc.logy2("a", 2)

    val denem1 = Newclas()
    denem1 Pluss 5


    if (a + a - 3 + (denem1 Pluss 6) == 6) {
        println("busefer oldu")
    } else println("yine olmadı")


    println(denem ahmet "\"ahmet aykun\"")


    if (a + a - 2 + (denem Pluss 4) == 4) {
        println("oldu bu iş")
    } else println("olmadı")


    var result: Int = "3" Plus "2"
//    result = readln().toInt()
    println(result)

    ab.logy1("as ")
    abc.logy2("asa ", 42)
    log3(a)


//deneme { messaj ,index->
//    println("messaj ne = $messaj $index")
//}
    deneme { messaj, index, vaz, yaz ->
        println("mesaj bu = $messaj $index $vaz $yaz")
    }

}


infix fun String.Plus(index1: String): Int = this.toInt() + index1.toInt()


infix fun Number.logy1(log: String) {
    println(log + this)
}

fun String.logy2(s: String, a: Any) {
    println(s + a + this)
}

fun log3(asadasd: Int) {
    println(asadasd)
}


fun deneme(Seti: (messaj: String, index: Int, vaz: Double, yaz: Any) -> Unit) {
    Seti("ahmet", 23, 1.33, " 23+asd")
}

fun deneme2(vararg abcde: Int, item: String, item2: Double, item3: String) {

}

fun deneme3(param: Any?) {
    deneme2(item = "ahmet", item2 = 1.2, item3 = "samet")

}


class Newclas() {
    var xColor: String = ""

    open var sıfır = 0
    var Names: String = ""

    infix fun ahmet(index: String): String {
        return index
    }

    infix fun Pluss(plus: Int): Int {
        return 4
    }

    fun İmage(image: String) {
        ahmet(image)
        this ahmet image
    }

    fun maan() {
        sıfır.logy1("ahmet")
        println(this)
        println("////////////////////////////////////////////////////////////////////////")
    }


}


