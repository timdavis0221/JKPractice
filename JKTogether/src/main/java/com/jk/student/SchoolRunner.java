package com.jk.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("Please enter student's name");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.next();
        System.out.println("Please enter student's english");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math");
        int math = scanner.nextInt();
        StudentJava student = new StudentJava(studentName, english, math);
        student.print();
    }
}
