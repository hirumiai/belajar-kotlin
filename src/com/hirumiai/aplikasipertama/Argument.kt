package com.hirumiai.aplikasipertama

fun main (){
    // named argument
        val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
        print(fullName)
    }
    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"

    /* default argument
    fun main() {
        val fullName = getFullName(first = "Dicoding")
        print(fullName)
    } */

    }