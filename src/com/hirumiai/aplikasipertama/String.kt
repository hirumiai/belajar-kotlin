package com.hirumiai.aplikasipertama

fun main() {

    //melakukan indexing
    val text = "Hirumi"
    val firstChar = text[3]

    println("Karakter keempat dari $text adalah $firstChar")

    //raw string
    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n"

    println(line)
}