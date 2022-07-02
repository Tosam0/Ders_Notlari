package `4-Class`

/**
 * Tip guvenliğini (type-safety)sağlar.
 *
 *
 *
 *
 */

interface TeamsFunctionlity {
    fun pratice()
}

enum class ColorType {
    RED, BLUE, WHITE, ORANGE
}

enum class TeamsType(val starCount: Int) {
    FENERBAHCE(3),
    GALATASARAY(4),
    TRABZON(5),
    BESİKTAS(2)
}

enum class Teams(val starCount: Int) : TeamsFunctionlity {

    FENERBAHCE(3) {
        override fun pratice() {
            TODO("Not yet implemented")
        }
    },
    GALATASARAY(4) {
        override fun pratice() {
            TODO("Not yet implemented")
        }
    },
    TRABZON(5) {
        override fun pratice() {
            TODO("Not yet implemented")
        }
    },
    BESİKTAS(2) {
        override fun pratice() {
            TODO("Not yet implemented")
        }
    }
}

enum class DaysOfWeek(val dayNumber: Int) {
    Pazartesi(1) {
        override fun toString(): String {
            return "PAZARTESİ"
        }
    },
    Sali(2) {
        override fun toString(): String {
            return "Salı"
        }
    },
    Carsamba(3) {
        override fun toString(): String {
            return "Çarşamba"
        }
    },
    Persembe(4) {
        override fun toString(): String {
            return "Perşembe"
        }
    },
    Cuma(5) {
        override fun toString(): String {
            return "Cuma"
        }
    },
    Cumartesi(6) {
        override fun toString(): String {
            return "Cumartesi"
        }
    },
    Pazar(7) {
        override fun toString(): String {
            return "Pazar"
        }
    }
}

enum class Sex {

    Male {
        override fun toString(): String {
            return super.toString()
        }

        override val typeCount: Int
            get() = TODO()

        override fun isOptions() {
            TODO("Not yet implemented")
        }

        override fun log() {
            super.log()
        }
    },
    Famele {
        override fun isOptions() {
            TODO("Not yet implemented")
        }

        override val typeCount: Int
            get() = TODO("Not yet implemented")
    },
    Other {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptions() {
            TODO("Not yet implemented")
        }
    };

    abstract val typeCount: Int
    abstract fun isOptions()
    open fun log() {}
}


fun main() {


    val fb = "FENERBAHÇE"
    val gs = "GALATASARAY"
    val bjk = "BEŞİKTAŞ"
    val ts = "TRABZONSPOR"

    val pzt= "PAZARTESİ"
    val sl = "SALI"
    val csb ="ÇARŞAMBA"
    val psb ="PERŞEMBE"
    val cm = "CUMA"



}






































