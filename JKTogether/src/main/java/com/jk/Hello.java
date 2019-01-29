package com.jk;

public class Hello {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        int[] getResult = person.getSumOfIntArray(1);
        for (int num : getResult)
            System.out.println(num);
    }
}
