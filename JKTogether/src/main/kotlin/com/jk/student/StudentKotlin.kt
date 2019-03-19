package com.jk.student

import java.util.*

fun main() {
//    userInput()
    var student = StudentKotlin("Tim", 70, 70)
    student.print()
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

class StudentKotlin (var name : String?, var english : Int, var math : Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        /*print(name + "\t" + english + "\t" + math + "\t" + getAverage() + passOrFailed())
        println("\tScore level: " + grading())*/
    }

    private fun passOrFailed() = if (getAverage() >= 60) ", PASS" else ", FAILED"

    private fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    private fun getAverage() = (math + english)/2

    fun highestScore() = if (english > math) {
            println("english score:")
            english
        } else {
            println("math score:")
            math
        }

    fun nameCheck() = println(name?.length)

}