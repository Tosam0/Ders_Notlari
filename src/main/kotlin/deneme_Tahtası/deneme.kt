

fun main() {

  /*  val a = 1
    var b = "ahmet"
    val c: Any = 'ş'
    println("a'nın değeri= $a b'nin değeri= ${b.length} c'nin değeri= $c ")
    println("--------------------------------")
    var x = 5
    x += +1
    println(x)

    var p = 1
    val s1 = "a is $p"
    p = 2
    val s2 = "$s1 +$p"
    println(s2)


    fun maxOf(uı: Int, Ba: Int): Int {
        var uı: Int = 1
        var Ba: Int = 2
        if (uı >= Ba) {
            println("büyük")
            return uı

        } else {
            println("küçük")
            return Ba

        }
    }

    val items = listOf<String?>("apple", "2", 23.toString())
    for (items in items) {
        println(items)
    }
    val items1 = listOf<String?>("book", "3", 27.toString())
    for (index in items.indices) {
        println("item at $index is ${items1[index]}")
    }

    val arrayDeneme = arrayOfNulls<String?>(5)
    arrayDeneme[0] = "deneme kardes"
    arrayDeneme[0] = "ds"
    println(arrayDeneme[0])
    arrayDeneme[0] = 4.toString()
    println(arrayDeneme[0])

    println({ arrayDeneme.size })
    println("--------------------------------")

    val carNamesMini = Array<Double>(5) {

        3.14 - it

    }
    carNamesMini[0] = 1.2
    println(carNamesMini[1])

    val carNamess = Array<Unit>(11) {
        println(it * it).toString()
    }

    val firstChar = DoubleArray(4)
    firstChar[3] = 11.2
    firstChar.set(1, 2.2)
    println("firstChar ilk karakteri ${firstChar.get(3)}")
    println("--------------------------------")

    val awensonarray = arrayOfNulls<String>(6)
    awensonarray[2] = "denem"
    // awensonarray[2]= "denem2"
    println(awensonarray[2])
    println("--------------------------------")

    var name1 = "ahmet"
    var name2 = "a"
    var name3 = 'h'
    var name4 = 'e'
    var name5 = 't'

    val arrayAhmet = arrayOf(name2, name3, name4, name5)

    for (char in name1) {
        println(char)
    }
    println("+++ ${arrayAhmet[2]}")


    val awesonmeKode = "ahmet deneme"
    val sonubasi = awesonmeKode[awesonmeKode.indices.first]
    val sonubasi1 = awesonmeKode[awesonmeKode.indices.last]
    println(sonubasi)
    println(sonubasi1)
    println("--------------------------------")

    val numberdeneme: String = "value " + (2 + 3 * 5 - 1)
    println(numberdeneme)
    println("numberValues = ${numberdeneme.length}")

    println("--------------------------------")


    // val grade = readLine()!!.toInt()
    // todo bu kısımı range ile dene ÖDEV sANA


*/




fun Int.toOrdinal():String{
    println("Final Notunu Giriniz : ")

    var suffix =readLine()!!.toString()
     when (this % 100 ){

        else -> "yanlis kod"
    }
    if (this % 100 in 0 ..10) suffix =" FF"
    if (this % 100 in 11 ..29) suffix =" DD"
    if (this % 100 in 30 ..49) suffix =" CC"
    if (this % 100 in 50 ..79) suffix =" BB"
    if (this % 100 in 80 ..98) suffix =" AA"
    if (this % 100 in 99 ..100) suffix =" AA+"

    return "$this$suffix"


    println(suffix)

}



    var notRaka =readLine()!!.toInt()
    var notString= ""
    println("Final Notunu Giriniz : ")
    when(notRaka){

        0 -> notString ="gecrsiz"
        1 -> notString= "zayıf"
        2 -> notString= "süper"
        else -> notString ="çok iyi"
    }


println(notString)


//val ab =10.toOrdinal()
   // println(ab)
}




















