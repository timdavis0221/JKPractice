package com.jk

import java.util.*

fun main() {

    val secret = Random().nextInt(10) + 1
    println(secret)

//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret){
        print("Please enter a number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        when{
            number > secret -> println("lower")
            number < secret -> println("higher")
            else -> println("hit ! the number is $secret")
        }
    }
}