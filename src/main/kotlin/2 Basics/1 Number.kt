package `2 Basics`

fun main(){

    /**
     *      Type    |   Size (bits) |       Min value                           |   Max value
     *      --------------------------------------------------------------------------------------
     *      Byte    |   8 bit       |       -128                                |   127
     *      Short   |   16 bit      |       -32768                              |   32767
     *      Int     |   32 bit      |       -2,147,483,648 (-2^31)              |   2,147,483,647 (2^31 - 1)
     *      Long    |   64 bit      |       -9,223,372,036,854,775,808 (-2^63)  |   9,223,372,036,854,775,807 (2^63 - 1)
     */

    /**
     *      Type    |   Size (bits) |   Significant bits    |   Exponent bits   |   Decimal digits
     *      --------------------------------------------------------------------------------------
     *      Float   |       32      |           24          |       8           |       6-7
     *      Double  |       64      |           53          |       11          |       15-16
     */

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Degiskene deger atamasi yapilirken maksimum performans almak icin dogru degisken tipini kullanmak onemlidir.
     *      Bunun icin degiskenlerin deger araliklarini yukaridan kontrol edebilirsiniz.
     *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyuk degilse tipi default olarak Int set edilir.
     *      Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyukse tipi default olarak Long set edilir.
     */

/* -------------------------------------------------------------------------------------------------------------------*/

    val a :Double= 0.1111111111112223

    val minByteValue: Byte= Byte.MIN_VALUE
    val maxByetValue:Byte=Byte.MAX_VALUE
    println("minByteValue ve maxByetValue $minByteValue  ve $maxByetValue")
    println("minByteValue ve maxByetValue ${minByteValue  + maxByetValue} size {$minByteValue.size}")

    val b = 3.2F

    val c =2312312L

    val d :Int?= null
    println(d)
    val x=3.1223e1

    val hexadecimalNumber =0x756


    val number:Int=10000
    println(number == number)
    val boxerNumber:Int? =number





}