package `4-Class`

/** enum(inam) Diye okunur.
 * Tip guvenliğini (type-safety)sağlar.
 * Kullanım amacı aynı veri kumelerinin gruplanabilir olmasını gağlar.
 *  Opsiyonlarin tamaminin neler olduguny rahatca gorebilmenizz saglar.
 *
 ********* abstract, open, inner, sealed olamazlar.**********
 * yopisi geregi zaten final'dirlar.final keyword' kuLlanmak redundant vygrisi verir.
 * ozunde class olduklari icin, constructor kullanabilinler ve bu constructor icersinde veri tutabilicler.
 *
 * java karsiliginda bu enum sabitleri static final class lor seklinde tutulunlar.
Bu sayede, kullanirken bu sabitlerin nesnesi oluşturulmak zorunda kalmayız.
 * sayede, kullanirken bu sabitlerin nesnesini olusturmak zorunda kalmayiz.
 *
 * Enum class'larinin nesnesi olusturulamaz.
 *
 * Her enum sabiti final name : string ve final ordinal : Int degiskentere default olarak sahiptir.
name ifadesi, enus'daki sabitin index'ini verir ve 0 'dan baslar.
 *
 **enus class'lar herhangi bir başka class'ı miras alamazlar.
 ** enus class'lar herhangi bir interface'i implement edebilirler.
 *
 *enus class'lar abstrack property'ler ya da abstact yapılar override etmek zorundadır.
 *
 * bor open function da yazılabilişr. open olmasından dolayı overide etme zorunluluğu yoktur.
Ancak open olarak belirtilen func.'un body'si olmak zorundadır.
 */

interface TeamsFunctionlity {
    fun pratice() {
        "boş"
    }
}

/**basit yazılışı, Genelde sonuna Type koyarız. Gruplanabilinir isimlerir
 * Genelde Bütün harfleri BÜYÜK yazılır bazende Baş harfleri.
 */
enum class ColorType {
    RED, BLUE, WHITE, ORANGE
}

enum class TeamsType(val starCount: Int) {
    FENERBAHCE(3),
    GALATASARAY(4),
    TRABZON(5),
    BESIKTAS(2)
}

enum class Teams(val starCount: Int) : TeamsFunctionlity {
    /** İcerisindekilere enum(inam) sabiti denir.
     * enum sabitleri Clas olarak tutulur arkaplanda.
     */
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
    BESIKTAS(2) {
        override fun pratice() {
            TODO("Not yet implemented")
        }
//        override val name:String
//            get() =  TODO("Not yet implemented")
    };
//    override fun pratice() {
//        super.pratice()
//    }
}

enum class DaysOfWeek(val dayNumber: Int) {
    Pazartesi(1) {
        override fun toString(): String {
            return "PAZARTESİ"
        }
    },
    Sali(2) {
        override fun toString(): String {
            return "SALI"
        }
    },
    Carsamba(3) {
        override fun toString(): String {
            return "ÇARŞAMBA"
        }
    },
    Persembe(4) {
        override fun toString(): String {
            return "PERŞEMBE"
        }
    },
    Cuma(5) {
        override fun toString(): String {
            return "CUMA"
        }
    },
    Cumartesi(6) {
        override fun toString(): String {
            return "CUMARTESİ"
        }
    },
    Pazar(7) {
        override fun toString(): String {
            return "PAZAR"
        }
    }
}

enum class Sex {
    Male {

        override val typeCount: Int
            get() = TODO(" ")

        override fun isOptions() {
            TODO("Not yet implemented")
        }

        override fun log() {
            super.log()
            println("MALE")
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
    // open fun lar overlod etmek zorunda değil ama  abstract lar overlod etmek zorunda.
    open fun log() {}
}


fun main() {


    val fb = "FENERBAHÇE"
    val gs = "GALATASARAY"
    val bjk = "BEŞİKTAŞ"
    val ts = "TRABZONSPOR"

    val pzt = "PAZARTESİ"
    val sl = "SALI"
    val csb = "ÇARŞAMBA"
    val psb = "PERŞEMBE"
    val cm = "CUMA"
    val cmt = "CUMARTESİ"
    val pz = "PAZAR"

    val male = "MALE"
    val famele = "FAMELE"

    println("4Büyüklerden biriniz yaz")
    val team: String = readLine()!!
    val starCount = when {
        team == fb -> {
            3
        }
        team == gs -> {
            4
        }
        team == bjk -> {
            5
        }
        team == ts -> {
            1
        }
        else -> {
            -1
        }
    }
        val starCount2 = when (team) {
//           Teams.FENERBAHCE.name.uppercase(Locale.getDefault()) ->{
//
//            } //FArklı kullanımı
            Teams.FENERBAHCE.toString() ->{
                Teams.FENERBAHCE.starCount
            }
            Teams.GALATASARAY.toString() ->{
                Teams.GALATASARAY.starCount
            }
            Teams.BESIKTAS.toString() ->{
                Teams.BESIKTAS.starCount
            }
            Teams.TRABZON.toString() ->{
                Teams.TRABZON.starCount
            }
            else -> {
                -1
            }
        }




    println(DaysOfWeek.Carsamba.name)
    println(DaysOfWeek.Carsamba.toString())

    println(Teams.FENERBAHCE.name)
    println(Teams.FENERBAHCE.toString())

    println(DaysOfWeek.Carsamba.ordinal)
    println(DaysOfWeek.Carsamba.dayNumber)

    //FENERBAHCE değeri enus olarak yoksa ,error verir.
    Teams.valueOf("FENERBAHCE")
    //Teams icerisindeki tum enum constant'larinin bir liste halinde doner.
    Teams.values()


    val getTeam = getBestTeam(Teams.GALATASARAY)
    val bestestTeam = getBestTeam("FENERBAHCE")
}

fun getBestTeam(teams: Teams): Teams {
    return teams
}


fun getBestTeam(teams: String): String {
    return teams
}




































