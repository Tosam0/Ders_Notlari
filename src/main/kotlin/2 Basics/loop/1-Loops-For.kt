package `2 Basics`.loop

fun main() {

    /**
     *      3 farkli sekilde for tanimlayabilirsiniz.
     *      value in list                       seklinde value degerlerini alabilirsiniz.
     *      index in list.indices               seklinde index degerlerini alabilirsiniz.
     *      (index,value) in list.withIndex()   seklinde index,value degerlerini alabilirsiniz.
     * **/

    for (value in 1..10) {
        print("$value ")
    }
                                   //0..   1 ..  2..   3      <______
    val countryCodeArray = arrayOf("tr", "az", "en", "fr")//         \
                                        //                            |________
    for (value in countryCodeArray) {//                                        \
        print("$value ")//                                                      \
    }                    //                                                      \
                       //                                                         \
    for (index in countryCodeArray.indices) { //indices  bize IntRage bilgisi döner. 0.1.2.3
        print("\n$index . değeri : ${countryCodeArray[index]} ")
    }
//2. kullanımı  withIndex() kullanırsanız hem index hem value yi alırsını.
    for ((index, value) in countryCodeArray.withIndex()) {
        print("\n$index . değeri = : $value ")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     * **/

    //$it ekle
    repeat(10) {
        print("\nDaha çok blog yazmam lazım!")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     *      continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz.
     * **/

    for (value in 1..50) {
        if (value % 2 == 0) {
            continue
        }
        print("\n$value")
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            break
        }
        print("\n$value")
    }

    /**
     *      Iç içe for donguleri kullaniyorsak bir ustteki for'a degil de iki ustteki uc ustteki for'a donmek istiyorsak
     *      label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for'un onune yazip, return ya da continue yapacagimiz
     *      yere ise @labelname seklinde yazmamiz yeterlidir.
     * **/

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }

            print("continue1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }

            print("continue2 : $value2 | ")
        }
    }

    println("")

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }

            print("break1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }

            print("break2 : $value2 | ")
        }
    }
}