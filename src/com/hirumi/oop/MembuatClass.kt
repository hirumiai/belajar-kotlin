package com.hirumi.oop

fun main () {

    class Animal() {
        var nama: String = "Meong"
        var berat: Double = 3.3
        var umur: Int = 3
        var isMammal: Boolean = true

        fun makan() {
            println("$nama makan!")
        }

        fun  turu() {
            println("$nama turu!")
        }
    }

    // Buat instance dari kelas Animal
    val animal = Animal()

    // Panggil metode dari instance
    animal.makan() // Output: Meong makan!
    animal.turu()  // Output: Meong turu!

}