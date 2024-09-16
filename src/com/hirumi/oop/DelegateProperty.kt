package com.hirumi.oop

import kotlin.reflect.KProperty

// Kelas untuk mendemonstrasikan delegasi properti
class DelegateGenericClass {
    // Variabel backing untuk nilai yang dikelola oleh delegasi
    private var value: Any = "Default"

    // Fungsi getter yang dipanggil saat properti diakses
    operator fun getValue(thisRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $thisRef")
        return value
    }

    // Fungsi setter yang dipanggil saat properti diubah
    operator fun setValue(thisRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// Kelas yang menggunakan delegasi properti
class Miaw {
    // Menggunakan DelegateGenericClass untuk mendelgasikan pengelolaan properti
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

// Fungsi utama yang dieksekusi saat program dijalankan
fun main() {
    // Membuat instance dari kelas Miaw
    val miaw = Miaw()

    // Mengubah nilai properti yang akan memanggil setter
    miaw.name = "Dicoding cat"
    miaw.weight = 6.2
    miaw.age = 1

    // Mengakses nilai properti yang akan memanggil getter
    println("Nama: ${miaw.name}")
    println("Berat: ${miaw.weight}")
    println("Umur: ${miaw.age} Tahun")
}
