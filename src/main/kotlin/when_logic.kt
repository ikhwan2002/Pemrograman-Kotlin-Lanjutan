fun main() {
    println("Masukkan nilai 1")
    val nilai1 = readLine()!!.toDouble()
    println("Masukkan nilai 2")
    val nilai2 = readLine()!!.toDouble()
    println("Masukkan nilai 3")
    val nilai3 = readLine()!!.toDouble()

    println("Masukkan pilihan operasi : A(Tambah),B(bagi),C(Kali),D(Kurang)")
    val pilih: String? = readLine()
    when (pilih) {
        "A" -> print(nilai2 + nilai3)
        "B" -> print(nilai2 / nilai3)
        "C" -> print(nilai1 * nilai3)
        "D" -> print(nilai3 - nilai1)
        else -> {
            println("Inputan salah!")
        }
    }
}