package com.jk

import com.jk.student.kt.StudentKotlin

fun main(args: Array<String>) {

    // access internal method in same module
    val student = StudentKotlin("Tom", 20, 20)
    student.grading()

    var str:String? = "abcdr"
    str = null
    println(str!!.length) // !! means handle NullPointerException by yourself
    println(str?.get(2))
    println(str?.substring(3))

    // assign parameter to associated position directly
    val h = Human(weight = 75.4f, height = 1.8f)
    h.hello()
    println(h.bmi())

    val c : Char = 'A'
    println(c.toInt() > 60)
}

class Human (var name : String = "Tim",
             var weight: Float,
             var height: Float){ // primary constructor
    // do something after constructor finished
    init {
        println("name: " + name)
        println("weight: $weight")
        println("height: $height")
    }
    // secondary constructor : can not use variable var and val
    // use this() to access main constructor
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi() : Float{
        return weight/(height*height)
    }

    fun hello(){
        println("Hello Kotlin")
    }
}