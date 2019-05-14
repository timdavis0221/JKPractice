package com.jk.student.kt

import java.util.*
import javax.xml.bind.DataBindingException

fun main() {
//    userInput()
    StudentKotlin.pass = 50
    var student = StudentKotlin("Tim", 40, 70)
    var student2 = StudentKotlin("Tim", 55, 70)
    var student3 = StudentKotlin("Tim", 50, 70)

    val graduateStudent = GraduateStudent("Yao", 55, 65, 60)
    graduateStudent.print()

    student.print()
    student2.print()
    student3.print()
    print("High score: ${student.highestScore()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english")
    var english = scanner.nextInt()
    print("Please enter student's math")
    var math = scanner.nextInt()

    val student = StudentKotlin(name, english, math)
    student.print()
    student.nameCheck()
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : StudentKotlin(name, english, math){
    companion object {
        var pass = 70
    }

    override fun print() {
        grading()
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) ", PASS" else ", FAILED"
}

open class StudentKotlin (var name : String?, var english : Int, var math : Int){
    // static object like java
    companion object {
        @JvmStatic // for easy access from java
        var pass = 60
        @JvmStatic
        fun test(value: Int) {
            println(value)
        }
        @JvmField
        var STATIC_OBJ = Date()
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        /*print(name + "\t" + english + "\t" + math + "\t" + getAverage() + passOrFailed())
        println("\tScore level: " + grading())*/
    }

    open fun passOrFailed() = if (getAverage() >= 60) ", PASS" else ", FAILED"

    internal fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    internal fun getAverage() = (math + english)/2

    fun highestScore() = if (english > math) {
            println("english score:")
            english
        } else {
            println("math score:")
            math
        }

    fun nameCheck() = println(name?.length)

}