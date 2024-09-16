package com.hirumi.oop

// Mendefinisikan kelas Animal
class Animal {
    // Properti 'name' dengan getter dan setter khusus
    var name: String = "Miaw" // Inisialisasi nilai awal properti 'name'
        get() {
            // Fungsi getter dipanggil saat properti 'name' diakses
            println("Fungsi Getter terpanggil") // Menampilkan pesan ke konsol
            return field // Mengembalikan nilai dari variabel backing 'field'
        }
        set(value) {
            // Fungsi setter dipanggil saat nilai properti 'name' diubah
            println("Fungsi Setter terpanggil") // Menampilkan pesan ke konsol
            field = value // Mengatur nilai variabel backing 'field' dengan nilai baru
        }
}

// Fungsi utama yang dieksekusi saat program dijalankan
fun main() {
    // Membuat instance dari kelas Animal
    val MeongOren = Animal()

    // Mengakses properti 'name', ini akan memanggil fungsi getter
    println("Nama: ${MeongOren.name}") // Output: Fungsi Getter terpanggil, Nama: Dicoding Miaw

    // Mengubah nilai properti 'name', ini akan memanggil fungsi setter
    MeongOren.name = "Bobby" // Output: Fungsi Setter terpanggil

    // Mengakses properti 'name' lagi setelah perubahan, ini akan memanggil fungsi getter
    println("Nama: ${MeongOren.name}") // Output: Fungsi Getter terpanggil, Nama: Goose
}
