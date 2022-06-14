package `2 Basics`.controlflow

fun main(args: Array<String>) {

    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : ${numberOne}")
    println("NumberOne : ${numberOne++}") //değişkenin arkasında kalıyorsa önce print işlemi yapılır sonra sayoı artar
    println("NumberOne : ${numberOne}")
    println("NumberOne : ${++numberOne}") //değişkenin başında olursa sayısı direk artar.

    println("${numberOne + numberTwo} ")
    println(" ////")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo} ")
    println(numberOne.minus(numberTwo)) //minu çıkartma

    print("${numberOne * numberTwo} ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo} ")
    println(numberOne.div(numberTwo)) //bölme işareti

    print("${numberOne % numberTwo} ") // kalanı bulmak için yapılır bölme değildir.ilk sayı ikinci sayıya bölünürse kalanı bulur.
    println(numberOne.rem(numberTwo))
    println(((1..100).filter { it % 3 == 0 }))

    println("------------------------------------------------------------")

    print("Final Notunu Giriniz : ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade = BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade = CC"
    } else if (grade <= 49 && grade >= 20) { //&& veya demek.
        "$grade = DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade = FF"
    } else {
        "$grade = Bulunamadı!!"
    }




    println("------------------------------------------------------------")

    println(grade.compareTo(100) > 0)
    println(grade.compareTo(100) < 0)
    println(grade.compareTo(100) >= 0)
    println(grade.equals(100))
    println(grade.equals(100))
    println(!grade.equals(100))

    println(charNote)

    /*
    a > b   a.compareTo(b) > 0
    a < b   a.compareTo(b) < 0
    a >= b  a.compareTo(b) >= 0
    a <= b  a?.equals(b)?: (b === null)
    a == b  a?.equals(b)?: (b === null)
    a != b  !(a?.equals(b)?: (b === null))
    */

    println("------------------------------------------------------------")
    // sadece baştakinin değeri değişiyor.
    // todo quizlerde gelebilir.
    var a = 20
    var b = 5
    a += b  //önce a ve b yi tolpla sonra a ya eşitle demek
    println("a+=b :" + a)
    a -= b
    println("a-=b :" + a)
    a *= b
    println("a*=b :" + a)
    a /= b
    println("a/=b :" + a)
    a %= b
    println("a%=b :" + a)

    /*
    	a+=b    a.plusAssign(b)
    	a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */

    println("------------------------------------------------------------")
// todo quizlerde gelebilir.

    var numbOne = 10
    var numbTwo = 5
    var flag = true
    println("+a :" + +numbOne)
    println("q-b :" + -numbTwo)
    println("++a :" + ++numbOne)//ikisinin anlamı +lar önde ise önde artırır sonra yazdırır
    println("a++ :" + numbOne++)//ikisinin anlamı +lar arkada ise önde yazdırır sonra artıtır.
    println("a :" + numbOne)
    println("--b :" + --numbTwo)
    println("!flag :" + !flag)//!flag true yada false nin tersini yazdırır ne yazarsa tersi yazar.

    /*
    	+a      a.unaryPlus()
    	-a      a.unaryMinus()
    	++a     a.inc()
        --a     a.dec()
    	!a      a.not()
     */

    println("------------------------------------------------------------")

    /**
     *
     *      === ifadesi isaret edilen referans tipleri karsilatirir.
     *      == ifadesi degeri karsilastirir.
     *      = ifadesi değer ataması yapar.
     */
}