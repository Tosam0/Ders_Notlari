package `2 Basics`

fun main() {

    /**
     *      Dizi tanimlamalari icin kullanilirlar.
     *      arrayOf(ayni tip degerler) seklinde tanimlanabilir.
     *      arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir.
     *      arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
     * **/
//                       index =  0  1   2   3   4   5
    val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
    val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(5)
    val studentNumara = arrayOf<Short>(10, 62, 5, 55, 56)
    println("Sonucu = " + studentNumara)

    val deneme: Array<Any> = arrayOf("1", "asd","eraesreaf")
    studentNames.set(2,"Kemal") //set değiştir
    studentNames.get(2) //get getir
    println("GEt Set denemesi "+studentNames[2])

    mixedArray.set(0,13)
    println("$mixedArray ++++++")

    studentNumara[2] = 300000.toShort()
    studentNumbers[4] = 11
    println("5. öğrenci = ${studentNumbers[5]}")
    firstCharOfNames[2] = 'C'
    arrayOfNulls[2] = "Samet"
    println("Array of nul sonucu = ${arrayOfNulls[2]}")
    println("Öğrenci seçimi=${studentNames.size}")


/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Array<Type>(size){higher order function} seklinde de tanimlanabilir.
     *      Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     *      Higher order function, icerisi dizinin boyutu kadar index'i(it) bir arttirarak calisir.
     * **/

    // 5 elamanli, tum elemanlari 3.14 olan bir dizi olusturur.
    val carNamesMini = Array<Double>(5) {
//        pseudo Codes
//        pseudo Codes
//        pseudo Codes
        3.14 * it
    }
    carNamesMini[0] = 1.1
    println("name ====" + carNamesMini)
    println("0. karakteri = ${carNamesMini[0]}")

    // 10 elemanli, 0-9 arasindaki index degerlerinin karesini alan bir dizi olusturur.
    // {0,1,2,4,9,16,25,36,49,81}
    val carNames = Array<Unit>(11) {
        println((it * it).toString())
        //  println(it * 2).toString()
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray gibi ya da bunların Unsigned halleri
     *      primitive array tanimlamalari da yapilabilir.
     *      Bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilabilir.
     *      Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde ulasilabilir.
     * **/

    val firstCharOfCountries = CharArray(5)
    firstCharOfCountries[0] = 'T'  //0
    firstCharOfCountries.set(1, 'İ')  //1
    firstCharOfCountries.set(3, 'A')   //2
    firstCharOfCountries[2] = '8'  //3
    firstCharOfCountries[4] = '5'  //4
    //   firstCharOfCountries[4] = 'x'  diziler 0 dan başlar
    //  firstCharOfCountries[5] = 'z'

    println("firstCharOfCountrys index 2 :" + firstCharOfCountries.get(3))
    println("firstCharOfCountrys index 2 :" + firstCharOfCountries[3])

////  IntArray denemesi
    val denemeInt = IntArray(5)
    denemeInt[0] = 5
    denemeInt[1] = 20
    denemeInt[2] = 22
    denemeInt[3] = 220

    println("DenemeInt= index  :" + denemeInt.get(2))

/* -------------------------------------------------------------------------------------------------------------------*/
    /**
     *        val ile tanimlanmis bir array'in herhangi bir index'indeki deger degistirilebilir.
     *      val indexdeki degerlerin degismesine karismaz.
     *      Ancak ilgili diziyi baska bir dizi ile esitlemenize izin verilmez.
     *      Bunun icin tanimlamayi var ile degistirmeniz gerekir.
     * **/

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Gökhan"
  //  awesomeArray = arrayOf("foo", "boo", "goo", "doo", "loo") // Calismaz. Comment'i kaldir kontrol et istersen keko

    /**
     *      Array'in size'i disina cikiyorsaniz (boyutu disina) cikiyorsaniz, IndexOutOfBound hatasini alirsiniz.
     */
    awesomeArray[4] = "Mehtap"
//    awesomeArray[5] = "Mehtap" // Calismaz. Comment'i kaldir kontrol et istersen keko

///////////
    val digerSet = HashSet<String>()
    digerSet.add("ahmet")
    digerSet.add("mehmet")
    digerSet.add("mehmet")
    digerSet.add("mehmet")
    digerSet.toSet()
//////////

    digerSet.forEach{
        println(it)
    }
/////////////
    val yemekkaloriMap = hashMapOf<String, Any>()
    yemekkaloriMap.put("ahmet",2)
    yemekkaloriMap.put("samet",22)
    yemekkaloriMap.put("memet",23)
    println(yemekkaloriMap.get("ahmet"))
//////////////
    val benimMap = HashMap<String, String>()
    benimMap.put("değer","örnek" )
//////////////

    val deneme1 = hashMapOf<String,Int>("zago" to 20,"Örnek" to 2656)
        println(deneme1)
}