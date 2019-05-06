package com.jk.student;

import java.util.Date;
import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {
//        userInput();

        int pass = StudentKotlin.getPass();
        StudentKotlin.test(pass);
        Date staticObj = StudentKotlin.STATIC_OBJ;
        System.out.println(staticObj);

        StudentJava.pass = 50;
        StudentJava student = new StudentJava("Tim", 90, 80);
        StudentJava student2 = new StudentJava("Iven", 60, 40);
        StudentJava student3 = new StudentJava("Eleven", 30, 20);
        student.printScore();
        student2.printScore();
        student3.printScore();
        System.out.println("High score: " + student.highestScore());
    }

    private static void userInput() {
        System.out.println("Please enter student's name");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.next();
        System.out.println("Please enter student's english");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math");
        int math = scanner.nextInt();

        StudentJava student = new StudentJava(studentName, english, math);
        student.printScore();
        System.out.println("High score: " + student.highestScore());
    }
}
