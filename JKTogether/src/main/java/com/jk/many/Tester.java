package com.jk.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        // Map : pairs:<key, value>
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "TSMC");
        stocks.put("2317", "FOXCONN");
        stocks.put("2330", "台積電");
        System.out.println(stocks);
        System.out.println(stocks.get("2317"));
        System.out.println("-----------------");
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
//        hashSet();
//        list();
    }

    /*
     * HashSet : no index, no repeat, no order
     */
    private static void hashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(8);
        hashSet.add(1);
        System.out.println(hashSet);
        for (int n : hashSet) {
            System.out.println(n);
        }
    }

    private static void list() {
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
