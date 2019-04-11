package com.jk.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        System.out.println("secret number is : " + secret);
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.println("Pleas enter a number (" + i + "/4)");
            int number = scanner.nextInt();
            System.out.println("the" + i + "times" + number);
            if(number > secret)
                System.out.println("lower");
            else if(number < secret)
                System.out.println("higher");
            else {
                System.out.println();
                break;
            }
        }
        System.out.println("Finish");
    }
}
