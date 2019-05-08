package com.jk.student;

public class StudentJava {
    String name;
    int english;
    int math;
    static int pass = 50;

    public StudentJava(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highestScore(){
        int max = (english > math)? english : math;
        /*if(english > math){
            max = english;
        }
        else{
            max = math;
        }*/
        return max;
    }

    public void printScore(){

        int average = getAverage();

        System.out.println(name + "\t" + english + "\t" + math +
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

       /* if(average >= 90 && average <= 100){
            grading = 'A';
        }
        else if(average >= 80 && average <=89){
            grading = 'B';
        }
        else if(average >= 70 && average <=79){
            grading = 'C';
        }
        else if(average >= 60 && average <=69){
            grading = 'D';
        }*/
        System.out.println("score level: " + grading);

        /*if (getAverage() >= 60)
            System.out.println(", Pass");
        else
            System.out.println(", Failed");*/
    }

    public int getAverage(){
        return (english+math)/2;
    }
}
