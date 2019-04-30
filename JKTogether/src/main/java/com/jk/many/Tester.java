package com.jk.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(2);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(2);
        System.out.println(n1 + ", " + n2);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(56, 12, 77, 95, 11);
        for (int score : scores){
            System.out.println(score);
        }
    }
}
