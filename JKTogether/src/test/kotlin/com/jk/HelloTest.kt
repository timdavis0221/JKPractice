package com.jk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloTest{
    @Test
    fun humanBmiTest(){
        val human = Human("Tim", 66.5f, 1.7f)
        Assertions.assertEquals((66.5f/(1.7f*1.7f)), human.bmi())
    }
    @Test
    fun PersonBmiTest() {
        val person = Person("Tim", 65.4f, 1.6f)
        Assertions.assertEquals(65.4f/(1.6f*1.6f), person.bmi())
    }
}