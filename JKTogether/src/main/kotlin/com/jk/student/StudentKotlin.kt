package com.jk.student

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    print("Please enter student's name")
    var name = scanner.next()
    print("Please enter student's english")
    var english = scanner.nextInt()
    print("Please enter student's math")
    var math = scanner.nextInt()

    val student = StudentKotlin(name, english, math)
    student.print()
}

class StudentKotlin (var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + (math+english)/2)
    }
}