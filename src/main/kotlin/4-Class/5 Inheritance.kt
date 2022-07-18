package `4-Class`

//todo iş görüşmesi sorusu Polimorfizim(çok biçimlilik) Üst clas a verdiğin bir fonksyonun veyya değişkenin alt claslarda override ederek anlamını değiştirmektir.
/** Miras alma nın 1.amacıTemel mantığı onun özellikleriyle beraber kendi özelliklerim olsun ben üst clasından daha çok şeyler yapabileyim.
 *2.amacı üst clasınızda yaptığınız beceri setini herzaman eklemek istemeye bilirsiniz.
 *3.olarak bazen üst kılasın sahip olduğu yetkinlikleri alt claslarla değiştirmek isticeksiniz.
 *
 *Miras almak istediğiniz Clasın Öntarafına "open" getirilir.
 *
 */
//open bir func. varken class'ın final olması sacma bir kullanım olacaktır. open func. bir espirisi kalmaz.
//final
open class Shape(val name: String) {
    var mColor: String = ""
    open var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name : $name")
        println("Color : $mColor")
        println("EdheCount : $mEdgeCount")
    }
    //ön eki olmasa bile Defoult olarak "final" dir buda override edilemez demektir.
   fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }

}

/**
 * Java'da Bütün Clasllar Open miras alınabilinir. Kotlinde ":" iki nokta işareti ile belirtiliyordur.
 * Miras aldığınız Clas'ın en azından bir tane constaktırını değerlerini vericek şekilde miras alması gerekiyor.
 * üst clasdaki değişken ve fonksyonları çağırabiliyoruz.
 */
class Rectangle(name: String) : Shape(name) {
    fun changeColor() {
        mColor
        mEdgeCount
        drawShape()
        calculateArea()
    }

    /**
     * deşişkeni ve ya Fonkyonu Open yaparsanız override yapabilirsiniz.
     * override Senin yaptığın iş ne ise bunu değiştiriyorum demektir. ->
     * Benim alt clasımda bunun anlamı farklı olucak demektir.
     *
     */
    override var mEdgeCount: Int
        get() = super.mEdgeCount
        set(value) {}

    override fun drawShape() {
        // drawShape()
        //    this.drawShape()
        super.drawShape()
        calculateArea()
        val rectangle = """"
        ***************
        *             *
        *             *
        ***************
        """".trimIndent()
        println(rectangle)

    }
}

/** Miras aldığınız constructor'lardan birisini belirtmeniz gerekiyor.
 * "Shape(name)" aşağıda belirttiğin gibi.
 */
class Circle(name: String, color: String) : Shape(color) {
    override fun drawShape() {
        super.drawShape()
        val circle = """"
            ******
         **        **
       **           **
       **            **
        **         **
           *******
           """.trimIndent()
        println(circle)
    }
}

open class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {
    /**"final" keyword'ü override edilemez anlamına gelir.
     * "final" olan şeyler override edilemezler.
     */
    final override fun drawShape() {
        /** "super" üst clastaki fonsyonu işaret eder.
         * "this" ise bağlı olduğu clası işaret eder.
         */
         super.drawShape()
     // this.drawShape()
        val square = """
           --------------
           |            |
           |            |   
           |            |
           |            |
           |            |
           **************                           
        """.trimIndent()
        println(square)
    }
}

class OneMeterSquare : Square("OneMeterSquare", "Blue", 4) {

    //ust class'daki drawShape final olursa, alt class'da bu func. override edilemez. 0'dan yazlılması gerekir.
    fun main() {
        drawShape()
        super.drawShape()
       //   this.drawShape()
        mColor
        mEdgeCount
    }

//    override fun drawShape(){
//
//    }
    /**"calculateArea" open olmadığından  override edilemez.
     */
//    override fun calculateArea(){
//    }


}


fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Magenta")
    val square = Square("Square", "Cyan", 5)
    val onemetal = OneMeterSquare()


    shape.drawShape()

    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()


}







