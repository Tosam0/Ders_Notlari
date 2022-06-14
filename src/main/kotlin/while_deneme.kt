fun main(){
    val i = 0
   other@ do {
    //    println(i)

      ///  continue
        var j =0
        while (j <5){
        //    println("---$j")
            j++
            break@other
       //     println("Im not prited")
        }
  //      println("I prited")

    }while (i<5)

val dizi = arrayOf<Any>("ahmet",1,true,10,"6")
 //   dizi[0] ="samet"

    dizi.set(0,"samet")
    println(dizi[0])
    dizi[3] = 100000.toShort()
    println(dizi[3])



var arrayint =IntArray(12)
    arrayint[0]= 11
    arrayint[1]= 114
    arrayint[2]= 111
    arrayint[4]= 114
    arrayint[5]= 1132

    println(arrayint[0])



}
