package com.company.PartTwo.JavaCollections;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetLearn {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("C");
        stringTreeSet.add("A");
        stringTreeSet.add("B");
        stringTreeSet.add("E");
        stringTreeSet.add("F");
        stringTreeSet.add("D");
        System.out.println(stringTreeSet);
    }
}
