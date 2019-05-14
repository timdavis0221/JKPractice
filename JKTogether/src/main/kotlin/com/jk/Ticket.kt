package com.jk.kt

import java.util.*

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    var ticket = Ticket(20, 51, 420)
    val str = "abcdskjlk;g"
    println(str.validate())

    // IntRange extension
    println("kotlin's IntRange extensions : ${(1..10).random()}")
    println("java's random : ${Random().nextInt(10) + 1}")
}

// kotlin Extensions
fun String.validate() : Boolean {
    return this.length >= 6
}

fun IntRange.random() : Int {
    val randomNumber = Random().nextInt(endInclusive-start) + start
    return randomNumber
}