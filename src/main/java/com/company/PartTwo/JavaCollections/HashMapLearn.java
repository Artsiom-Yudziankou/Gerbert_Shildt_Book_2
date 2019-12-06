package com.company.PartTwo.JavaCollections;

import java.util.*;

public class HashMapLearn {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("John Snow", 3434.13);
        hashMap.put("Tom Smith", 123.23);
        hashMap.put("Jane Baker", 1378.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        for (Map.Entry<String, Double> iter:
        set){
            System.out.print(iter.getKey() + ": ");
            System.out.println(iter.getValue());
        }
        System.out.println();

        double balance = hashMap.get("John Snow");
        hashMap.put("John Snow", balance + 1000);
        System.out.println("New balance of John Snow: " + hashMap.get("John Snow"));


        System.out.println();

        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("John Snow", 3434.13);
        treeMap.put("Tom Smith", 123.23);
        treeMap.put("Jane Baker", 1378.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set1 = treeMap.entrySet();
        for (Map.Entry<String, Double> iter:
                set1
             ) {
            System.out.print(iter.getKey() + " ");
            System.out.println(iter.getValue());
        }
        System.out.println();

        double balance1 = treeMap.get("John Snow");
        treeMap.put("John Snow", balance1 + 1000);

        System.out.println("New balance of John Snow: " + treeMap.get("John Snow"));

        String xxx = " ";

    }
}
