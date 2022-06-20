fun main(){
    /////vize
    println("Lütfen ağırlık oranını giriniz : ")
    val agirlikVize = readln().toInt()

    println("Lütfen vize 1. notlarini giriniz : ")
    val giveMeVizeNote = readln().toInt()
    println("Lütfen vize 2. notlarini giriniz : ")
    val giveMeVizeNote2 = readln().toInt()
    val agnoWithNoteVize = ((giveMeVizeNote + giveMeVizeNote2) /2 * agirlikVize ) / 100

    ///final
    println("Lütfen ağırlık oranını giriniz: ")
    val agirlikFinal = readln().toInt()

    println("Lütden final notunu giriniz : ")
    val giveMeFinalNote = readln().toInt()
    val agnoWithNoteFinal = (giveMeFinalNote * agirlikFinal) / 100

    ////bitiş
    val totalNot = agnoWithNoteVize + agnoWithNoteFinal
    when(totalNot){

        in 0..50 -> println("Notunuz : FF ($totalNot)")
        in 51..64 -> println("Notunuz : DD ($totalNot)")
        in 65..69 -> println("Notunuz : DC ($totalNot)")
        in 70..74 -> println("Notunuz : CC ($totalNot)")
        in 75..79 -> println("Notunuz : CB ($totalNot)")
        in 80..84 -> println("Notunuz : BB($totalNot)")
        in 85..89 -> println("Notunuz : BA ($totalNot)")
        in 90..100 -> println("Notunuz : AA ($totalNot)")

    }
    println(totalNot)

}