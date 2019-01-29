package com.jk;

import java.util.stream.IntStream;

public class Person {

    public Person() {
        System.out.println("Init person constructor");
    }

    public void sayHello(){
        System.out.println("Hello Java !");
    }

    public int[] getSumOfIntArray(int N){

        int[] result = new int[N];

        if(N >= 1 && N <= 100){
            for(int i = 0; i <= N - 1; i++){
                if(i == N - 1)
                    result[i] = -IntStream.of(result).sum();
                else
                    result[i] = i;
            }
        }
        else{
            System.out.println("input error");
            result = new int[] { -1 };
        }
        return result;
    }

}
