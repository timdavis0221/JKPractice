package com.jk

import com.jk.student.StudentKotlin
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentKotlinTest{
    @Test
    fun highestScoreTest(){
        val student = StudentKotlin("Tim", 60, 80)
        Assertions.assertEquals(80, student.highestScore())
    }
    @Test
    fun getAverageTest(){
        val student = StudentKotlin("Tim", 60, 80)
        Assertions.assertEquals((60+80)/2, student.getAverage())
    }
    @Test
    fun gradingTest(){
        val student = StudentKotlin("Tim", 60, 80)
        Assertions.assertEquals('C', student.grading())
    }
}