package com.jk

fun main(args: Array<String>) {
    val h = Human(weight = 75.4f, height = 1.8f)
    h.hello()
    println(h.bmi())
}

class Human constructor(var name : String = "Tim",
                        var weight: Float,
                        var height: Float){ // primary constructor
    // do something after constructor finished
    init {
        println("name: " + name)
        println("weight: $weight")
        println("height: $height")
    }
    // secondary constructor
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi() : Float{
        var bmi = weight/(height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}