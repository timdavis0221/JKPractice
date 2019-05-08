package com.jk.student;

public class GraduateStudent extends StudentJava{

    int thesis;
    static int pass = 70;

    public GraduateStudent(String name, int english, int math, int thesis){
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void printScore() {
        int average = getAverage();

        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + thesis +
                ", Average: " + getAverage() + "\t" +
                ((getAverage() >= pass) ? ", PASS" : ", FAILED"));

        char grading;

        switch(average/10){
            case 10:
            case  9:
                grading = 'A';
                break;
            case  8:
                grading = 'B';
                break;
            case  7:
                grading = 'C';
                break;
            case  6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
        System.out.println("score level: " + grading);
    }
}
