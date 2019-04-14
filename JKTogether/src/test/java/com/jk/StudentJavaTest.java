package com.jk;

import com.jk.student.StudentJava;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentJavaTest {
    @Test
    public void highestScoreTest() {
        StudentJava studentJava = new StudentJava("Tim", 90, 75);
        Assertions.assertEquals(90, studentJava.highestScore());
    }
    @Test
    public void getAverageTest(){
        StudentJava studentJava = new StudentJava("Tim", 90, 75);
        Assertions.assertEquals((90+75)/2, studentJava.getAverage());
    }
}
