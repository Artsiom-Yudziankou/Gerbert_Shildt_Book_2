package com.company.PartTwo.JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Beta");
        stringHashSet.add("Alpha");
        stringHashSet.add("Eta");
        stringHashSet.add("Gamma");
        stringHashSet.add("Epsilon");
        stringHashSet.add("Omega");
        System.out.println(stringHashSet);

        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("Beta");
        stringLinkedHashSet.add("Alpha");
        stringLinkedHashSet.add("Eta");
        stringLinkedHashSet.add("Gamma");
        stringLinkedHashSet.add("Epsilon");
        stringLinkedHashSet.add("Omega");
        System.out.println(stringLinkedHashSet);
    }
}
