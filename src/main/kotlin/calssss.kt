

fun main(){
fun Int.toOrdinal():String{
    var suffix = when (this % 100 ){
        1 ->"'inci"
        2 ->"'inci"
        3 ->"'üncü"
        4 ->"'üncü"
        5 ->"'inci"
        6 ->"'ıncı"
        7 ->"'inci"
        8 ->"'inci"
        9 ->"'uncu"
        10 ->"uncu"
       else -> "th"
    }
    if (this % 100 in 11 ..12) suffix ="'inci"
    if (this % 100 in 13 ..14) suffix ="'ünci"
    if (this % 100 in 15 ..15) suffix ="'inci"
    if (this % 100 in 16 ..16) suffix ="'ınci"
    if (this % 100 in 17 ..18) suffix ="'inci"
    if (this % 100 in 19 ..20) suffix ="'unci"

    return "$this$suffix"
}
val ab =66.toOrdinal()
    println(ab)
}

/*
if (this % 100 in 0 ..10) suffix ="FF"
if (this % 100 in 11 ..29) suffix ="DD"
if (this % 100 in 30 ..49) suffix ="CC"
if (this % 100 in 50 ..79) suffix ="'BB"
if (this % 100 in 80 ..98) suffix ="AA"
if (this % 100 in 99 ..100) suffix ="AA+"

*/












