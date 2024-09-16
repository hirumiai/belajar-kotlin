package com.hirumi.oop

fun main() {
     // berguna untuk mengisi kekosongan isi variabel yg nanti akan diisi

    // lateinit
    lateinit var name: String
    fun main() {
        name = "Dicoding Miaw"
        print(name.length)
    }

    /* lateinit dengan inisialisasi
    lateinit var name2: String
    fun main() {
        name2 = "Dicoding Miaw"
        if (::name2.isInitialized)
            print(name2.length)
        else
            print("Not Initialized")
    } */

    // lozy property
    val name2: String by lazy {
        "Dicoding Miaw"
    }
        print(name.length)
}