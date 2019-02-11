package com.jk;

public class Hello {
    public static void main(String[] args) {
        Person person = new Person("Tim", 66.5f, 1.9f);
        person.sayHello();
        person.weight = 75.5f;
        person.height = 1.8f;
        System.out.println(person.bmi());

        char c = 'A'; // unicode 65
        System.out.println(c > 'a'); // unicide 67

        /*int[] getResult = person.getSumOfIntArray(1);
        for (int num : getResult)
            System.out.println(num);*/
    }
}
