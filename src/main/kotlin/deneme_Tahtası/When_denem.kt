package deneme_Tahtası

import java.util.*


fun main(args: Array<String>) {
/*
    val countryCode = readLine()!!

    if (countryCode.lowercase(Locale.getDefault()) == "tr" || countryCode.lowercase(Locale.getDefault()) == "az")
        println("Turki Vatandası")
    else if (countryCode.lowercase(Locale.getDefault()) == "ar")
        println("Arab Vatandası")
    else if (countryCode.lowercase(Locale.getDefault()) == "fr")
        println("France Vatandası")
    else if (countryCode.lowercase(Locale.getDefault()) == "ru")
        println("Russian Vatandası")
    else if (countryCode.lowercase(Locale.getDefault()) == "uk")
        println("United Kingdom Vatandası")
    ////////////////////
    var countryCode2: String =
        if (countryCode.lowercase(Locale.getDefault()) == "tr" || countryCode.lowercase(Locale.getDefault()) == "az") {
            println("Turki Vatandası")
            "90"
        } else if (countryCode.lowercase(Locale.getDefault()) == "ar") {
            println("Arab Vatandası")
            "80"
        } else if (countryCode.lowercase(Locale.getDefault()) == "fr") {
            println("France Vatandası")
            "60"
        } else if (countryCode.lowercase(Locale.getDefault()) == "ru") {
            println("Russian Vatandası")
            "50"
        } else if (countryCode.lowercase(Locale.getDefault()) == "uk") {
            println("United Kingdom Vatandası")
            "40"
        } else {
            "30"
        }
    ////////////////////////
    val countryCode23 :String =""

     when (countryCode23.lowercase(Locale.getDefault())) {
        "tr", "az","uza" -> {
            println("TC Vatandası")
            "90"
        }
        "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        "fr" -> {
            println("France Vatandası")
            "70"
        }
        "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }
    val countryCode5 = readln().toInt()

    when (countryCode5) {
        2, 3 -> println("Türk Vatandası")
        4 -> println("Arab Vatandası")
        5 -> println("France Vatandası")
        6 -> println("Russian Vatandası")
        7 -> println("United Kingdom Vatandası")

    }
    */

    val x = readln().toInt()
    when (x) {
        1 -> println("sayı 1")
        2, 3 -> println("sayı 2, 3")
        4, 5, 6 -> println("sayı 4,5,6")
        else -> println("sayılar geçersizdir.")
    }

    val yyy = readln().toString()
    when (yyy.lowercase(Locale.getDefault())) {
        "ahmet", "samet" -> {
            println("$yyy aykun")
        }
        "ayben", "erdoğan" -> {
            println("tezel")
        }
        else -> println("farklı")
    }
    /*  val abc:Int =11
      for ( abc in  10 .. 20){
          for (abc in 11..25){
              if ( abc == 22 ){
                  break
                  println("buldu $abc")
              }
          }
          println("sayı  $abc")
      }*/
    println("ilk sayı")
    val sayi1 = readLine()!!.toDouble()
    println("İşlem nedir?")
    val sonuc = readLine().toString()
    println("ikinci sayı")
    val sayi2 = readLine()!!.toDouble()
    println("Kare hesaplama ")
    //  var sayi3=readLine()!!.toDouble()
      when(sonuc){
    "+" -> println("toplama ${sayi1+sayi2}")
    "'-' "-> println("fark ${sayi1-sayi2}")
    "/" -> println("bölüm ${sayi1 / sayi2}")
    "*" -> println("çarpma ${sayi1 * sayi2}")
    "%" -> println("kalan ${sayi1 % sayi2}")
    //    "," -> println("Sayının karesi ${sayi3 * sayi3}")

    else -> println("geçersiz")
}



}