package com.hirumiai.aplikasipertama

fun main (){
    // fun namaFunction(parameter1 : Type1, param2 : Type 2, ...): ReturnType {
    // return result }
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}