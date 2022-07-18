package `4-Class`


/**Nested ya da local typeAlias kullanımı desteklemiyor.
 *
 * typealias  (taypelias)
 *
 * typeAlias'lar arka planda yeni bir class olusturmazlar. Sadece etiketleme yaparlar.
 * kısaca isimleri kısaltmak için yazılır.
 */


typealias AccountReferanceVM = ProjectCountracterChargingPeriodProjetAccountReferance


fun main() {
    // typealias AccountReferanceVM = ProjectCountracterChargingPeriodProjetAccountReferance

    val projectCountracterChargingPeriodProjetAccountReferance =
        ProjectCountracterChargingPeriodProjetAccountReferance()

    val accountReferanceVM = AccountReferanceVM()


}

class ProjectCountracterChargingPeriodProjetAccountReferance {
}


class A1 {
    class Inner
}
class B1 {
    class Inner
}

typealias AInner = A1.Inner
typealias BInner = B1.Inner