package com.hirumiai.aplikasipertama

fun main () {
    val openHours = 8
    val now = 19
    val office: String
    if (now > openHours) {
        office = "kantor sudah buka"
    } else {
        office = "kantor belum buka"
    }
    print(office)
}