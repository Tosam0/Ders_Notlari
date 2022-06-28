package deneme_Tahtası

fun main() {
    for (value in 1..2) {
        for (value2 in 0..5) {
            if (value2 == 5) {
                continue
            }
        print("continue : $value2 | ")
        }
    }
    println("\n /////////////////////////////////////////////////////")
    returnLabel@ for (value in 1..2) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }

           print("\n samo  : $value2 | ")
        }
    }
    returnLabel@ for (value in 1..2) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }

            print("\n ayben  : $value2 | ")
        }
    }
    retrun@ for (value in 1..3) {
        for (value2 in 0..6) {
            if (value2 == 6) {
                break@retrun
            }

           print("\n break1 : $value2 | ")
        }
    }
}




