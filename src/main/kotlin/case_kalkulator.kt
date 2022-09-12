fun main(){
    println("Masukkan nama")
    val nama= readLine()
    println("Masukkan nilai 1")
    val nilai1= readLine()!!.toInt()
    println("Masukkan nilai 2")
    val nilai2= readLine()!!.toInt()

    var tambah = nilai1 + nilai2
    var kurang = nilai1 - nilai2
    var kali = nilai1 * nilai2
    var bagi = nilai1 / nilai2
    println("nama lengkap kamu adalah $nama")

    println("Hasil penjumlahannya adalah $tambah")
    println("Hasil pengurangannya adalah $kurang")
    println("Hasil perkaliannya adalah $kali")
    println("Hasil pembagiannya adalah $bagi")
}