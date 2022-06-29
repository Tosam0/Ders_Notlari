package deneme_Tahtası

fun main() {
    val denbem = denemeClas("deneme", "aykun")
    denbem.indexFun("")
}

open class ClassDeneme(name: String) {
    var Name1 = name

    open infix fun indexFun(name1: String) {
        println("Name : $Name1")
    }

    fun Plus(plus: Int): Int {
        return plus - plus
    }

    constructor(name: String, surname: String) : this(name) {
    }

}

class denemeClas(name: String, surname: String) : ClassDeneme(name) {

    override fun indexFun(name1: String) {
        super.indexFun(name1)
        val name1 = "asd"
    }
}

abstract class ABSclass {
    abstract val index1: İndex1Clas
    abstract val index2: İndex2Clas
    abstract val index3: İndex3Clas

    abstract fun ABSFun(names: String,yas: Int)
    val denme: İndex1Clas = İndex1Clas()

    abstract infix fun inxAbstract(soyisim: String)
    open fun normFun(sayı: Int) {
        return
    }
}
class NormClas1(names: String) : ABSclass(){
    override val index1: İndex1Clas
        get() = TODO("Not yet implemented")
    override val index2: İndex2Clas
        get() = TODO("Not yet implemented")
    override val index3: İndex3Clas
        get() = TODO("Not yet implemented")

    override fun ABSFun(names: String,yas: Int) {
        TODO("Not yet implemented")
    }

    override fun inxAbstract(soyisim: String) {
        TODO("Not yet implemented")
    }
}

abstract class ABSclassAlt1 : ABSclass() {
    override val index1: İndex1Clas
        get() = TODO("Not yet implemented")
    override val index2: İndex2Clas
        get() = TODO("Not yet implemented")

    override fun ABSFun(names: String,yas: Int) {
        TODO("Not yet implemented")
    }
}

class NormClass2(name1: String):ABSclassAlt1(){
    override val index3: İndex3Clas
        get() = TODO("Not yet implemented")

    override fun inxAbstract(soyisim: String) {
        TODO("Not yet implemented")
    }
}


class İndex3Clas

class İndex2Clas

class İndex1Clas





