package Percabangan

//Percabangan when
fun main(){
    val angka:Int=1
    val hasil = when(angka){
        3,4,5 -> "it is summer season"
        6,7,9 -> "it is rainy season"
        8,10,11 -> "it is autumn season"
        10,12,1,2 -> "it is winter season"
        else -> "invalid output"
    }
    println("hasil : $hasil")
}