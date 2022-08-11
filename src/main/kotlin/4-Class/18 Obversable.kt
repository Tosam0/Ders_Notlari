package `4-Class`

import kotlin.properties.Delegates

/**Bir değişkenin değeri değiştiğinde bize haber vermesi için.
 *
 */

class User85 {
    var name by Delegates.observable("Initialized Value") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
    newValue > oldValue

    //throw  IllegalArgumentException("New value must be lerger than old")
}
var max2: Int by Delegates.observable(0) { property, oldValue, newValue ->

    true
}


fun main() {

    var user = User85()
    println(max)
    user.name = "Ahmet"
    user.name = "SAmet"
    max = 54
    max = 1000

    max2 = 3
    max2 = 32
/////////////////////////////////////
    val deneme1 = HigherOrder_Ornek { oldvalue, newValue ->
        val changeValue = newValue - oldvalue
        //  println("Old balance: $oldvalue, new balance: $newValue")
        println("ChangeValues $changeValue")
    }
    deneme1.balance = 1000
    deneme1.balance = 1002
    deneme1.balance = 102

////////////////
    val deneme2 = Interface_Ornek(object : DelegatesInterface {
        override fun Fundelegates(oldValue: Int, newValue: Int) {
            val changeValue = newValue - oldValue
            println("ChangeValues $changeValue")
        }
    })
    deneme2.buyVAlue = 23
    deneme2.buyVAlue = 2233
    deneme2.buyVAlue = 781233
}

/**
 * Aşağıdaki yapıya Obversable Patern denir.
 */
class HigherOrder_Ornek(val notidiy: (Int, Int) -> Unit) {

    var balance: Int = 0
        set(value) {
            notidiy(field, value)
            field = value
        }
}


interface DelegatesInterface {
    fun Fundelegates(oldValue: Int, newValue: Int)
}

class Interface_Ornek(val delegatesInterface: DelegatesInterface) {
    var buyVAlue: Int = 0
        set(value) {
            delegatesInterface.Fundelegates(field, value)
            field = value
        }
}













