package com.company.PartTwo.JavaCollections;

import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args){
        ArrayList<String> stringArrayList = new ArrayList<String>();
        System.out.println("Initial size: " + stringArrayList.size());
        stringArrayList.add("C");
        stringArrayList.add("A");
        stringArrayList.add("E");
        stringArrayList.add("B");
        stringArrayList.add("D");
        stringArrayList.add("F");
        stringArrayList.add(1,"A2");
        System.out.println("After adding size: " + stringArrayList.size());
        System.out.println("Elements: " + stringArrayList);
        stringArrayList.remove("F");
        stringArrayList.remove(2);
        System.out.println("After removing size: " + stringArrayList.size());
        System.out.println("Elements after removing: " +stringArrayList);
        String stringArray[] = new String[stringArrayList.size()];
        stringArray = stringArrayList.toArray(stringArray);
        System.out.println("Elements of simple array: " + stringArray);
    }
}
