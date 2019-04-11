package com.jk

import java.util.*

fun main() {
    val secret = Random().nextInt(10) +1
    println(secret)

    val scanner = Scanner(System.`in`)
    for (i in 1..4){
        print("Please enter a number: ")
        var number = scanner.nextInt()
        println("第 $i 次, $number")
        when{
            number > secret -> println("lower")
            number < secret -> println("higher")
            else -> return
        }
    }
}