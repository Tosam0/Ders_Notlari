fun main() {


    val countryCode5 = readln().toInt()

    when (countryCode5 % 100) {
        1, 2, 5, 7, 8, 11, 12, 15, 17, 18, 20, 21, 22, 25, 28, 31, 32, 35, 37, 38, 41, 42, 45, 47, 48, 50 -> println("$countryCode5'inci")
        3, 4, 13, 14, 23, 24, 33, 34, 43, 44 -> println("$countryCode5'üncü")
        0, 6, 16, 36, 40, 46 -> println("$countryCode5'ıncı")
        9, 10, 19, 29, 30, 39, 49 -> println("$countryCode5'uncu")
        else -> {
            println("geçersiz sayı")
        }
    }
    fun deneme333(name: String, Kod: Int): String {
        return "Log $name"
    }

    fun denmeHiderFunksion(hider: (name: String, Kod: Int) -> String) {
        hider("Codemy,", 24)
    }

    deneme333("Herşey yolunda", 2)
    denmeHiderFunksion(::deneme333)

}




/*
fun Int.toOrdinal():String{
var suffix =
when (this % 100 ){
    1,2,5,7,8,11,12,15,17,18,20,21,22,25,28,31,32,35,37,38,41,42,45,47,48,50 ->"'inci"      //println("$this'inci")
    3,4,13,14,23,24,33,34,43,44 -> "'üncü"     //println("$this'üncü")
    0,6,16,36,40,46 -> "'ıncı"       // println("$this'ıncı")
    9,10,19,29,30,39,49 -> "'uncu"     // println("$this'uncu")
   else ->" sayi siniri disinda"
}
return "$this$suffix"
}
val ab =49.toOrdinal()
println(ab)*/








