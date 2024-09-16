package com.hirumiai.aplikasipertama

fun main (){

    // boolean and
    val officeOpen = 8
    val  officeClosed = 17
    val now = 22

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }
    println("Office is open : $isOpen")
}