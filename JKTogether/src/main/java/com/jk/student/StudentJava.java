package com.jk.student;

public class StudentJava {
    String name;
    int english;
    int math;

    public StudentJava(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t"
                + (english+math)/2);
    }
}
