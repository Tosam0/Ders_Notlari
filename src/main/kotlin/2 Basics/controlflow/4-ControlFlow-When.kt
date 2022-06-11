package `2 Basics`.controlflow

import java.util.*

fun main() {

    /**
     *      switch case'lerin yerine gelmistir.
     *      when(karsilastirilacak_ifade)
     *          value -> {}
     *          value -> {}
     *          else -> {}
     *      formatiyla kullanilir.
     *      Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabilirsiniz.
     *      "tr", "az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabiliriz.
     *      Bu "veya" kullanimi yapmayi saglar. "tr veya az" gibi.
     * **/

    //todo bu kısımı Int olarak sonra dene.
    val countryCode = readLine()!!
    when (countryCode.lowercase(Locale.getDefault())) {
        "tr", "az" -> println("Türk Vatandası")
        "ar" -> println("Arab Vatandası")
        "fr" -> println("France Vatandası")
        "ru" -> println("Russian Vatandası")
        "uk" -> println("United Kingdom Vatandası")

    }
//farklı kullanımı
    //      when (countryCode.toInt()) {
    //        3.and(5) -> println("TC Vatandası")
    //       1 or 2 -> println("TC Vatandası")
    //     }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      when'in yanina karsilastirma ifadesi eklemeden, bunu case'lerin yanina da ekleyebilirsiniz.
     *      Bunun artisi && || and or xor gibi ifadeleri de kullanabilmenizi saglar.
     * **/
    when {
        countryCode.lowercase(Locale.getDefault()) == "tr" || countryCode.lowercase(Locale.getDefault()) == "az" -> println(
            "TC Vatandası"
        )
        countryCode.lowercase(Locale.getDefault()) == "ar" -> println("Arab Vatandası")
        countryCode.lowercase(Locale.getDefault()) == "fr" -> println("France Vatandası")
        countryCode.lowercase(Locale.getDefault()) == "ru" -> println("Russian Vatandası")
        countryCode.lowercase(Locale.getDefault()) == "uk" -> println("United Kingdom Vatandası")
    }

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

    /* ------------------------------------------------------------------------ */

    /**
     *      Expression kullanimini if else'lerde oldugu gibi when'lerde de yapabilirsiniz.
     * **/
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

    countryCode2 = when (countryCode2.lowercase(Locale.getDefault())) {
        "tr", "az" -> {
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
            println("geçersiz")
            "40"
        }
    }

    countryCode2 = when {
        countryCode2.lowercase(Locale.getDefault()) == "tr" || countryCode2.lowercase(Locale.getDefault()) == "az" -> {
            println("TC Vatandası")
            "90"
        }
        countryCode2.lowercase(Locale.getDefault()) == "ar" -> {
            println("Arab Vatandası")
            "80"
        }
        countryCode2.lowercase(Locale.getDefault()) == "fr" -> {
            println("France Vatandası")
            "70"
        }
        countryCode2.lowercase(Locale.getDefault()) == "ru" -> {
            println("Russian Vatandası")
            "60"
        }
        countryCode2.lowercase(Locale.getDefault()) == "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }
        else -> {
            "40"
        }
    }


/* -------------------------------------------------------------------------------------------------------------------*/

    //karsilastirilacak sey "deger" yerine "degisken" de olabilir.
    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    val ukCode = "uk"
    when (countryCode.lowercase(Locale.getDefault())) {
        trCode, "az" -> println("TC Vatandası")
        arCode -> println("Arab Vatandası")
        frCode -> println("France Vatandası")
        ruCode -> println("Russian Vatandası")
        ukCode -> println("United Kingdom Vatandası")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

//todo burayı tekrardan dene
    //rang'leri in !in seklinde kontrolu yapılır.
val number =3
when(number){
    in 0..10->{
        println("Long value")
    }
    in 11..20 ->{
        println("long Value")

    }
    !in 20..30->{ // "!in" değil ise yi gösterir.
        println("değil")
    }
}

// is !is ile bir class'in referansi olunup olunmadigi kontrolu yapilabilir.
  val phoneNumber: Long = 5316266922
  when (phoneNumber) {
      is Long -> {
          println("Long value")
      }
      !is Long -> {
          println("Long value değil")
      }
  }


}