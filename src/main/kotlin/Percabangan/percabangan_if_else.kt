package Percabangan

//Percabangan if else
fun main(){
    println("Masukkan nama lengkap")
    val nama = readLine()
    println("Masukkan nilai uts")
    val nilai_uts= readLine()!!.toInt()
    println("Masukkan nilai uas")
    val nilai_uas= readLine()!!.toInt()

    var nilai_akhir: Double =(nilai_uts*0.4)+(nilai_uas*0.6)
    println("Hai $nama Nilai kamu $nilai_akhir")
     if (nilai_akhir > 80){
         println("Selamat ya, anda naik semester")
     }else{
         println("Maaf, anda cuti semester")
     }
}