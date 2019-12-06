package com.company.PartTwo.JavaCollections;

import java.util.*;

public class ComparatorLearn {
    public static void main(String[] args){
        new ComparatorLearn().checkReverseCompare();
        new ComparatorLearn().checkSurnameCompare();
    }

    void checkLCompare() {

        Comparator <String> xxx = (String s,String t1) -> {
            int indexOfS = s.lastIndexOf(' ');
            int indexOft1 = t1.lastIndexOf(' ');
            return s.substring(indexOfS).compareTo(t1.substring(indexOft1));
        };

        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(
                xxx.thenComparing( (s, t1) -> {return s.compareTo(t1);}));
    }

    void checkSurnameCompare() {
        TreeMap<String, Double> treemap = new TreeMap<>(new SurnameComparator());
        treemap.put("John Snow", new Double(3000.00));
        treemap.put("Tom Smith", new Double(150.00));
        treemap.put("Jane Baker", new Double(1400.00));
        treemap.put("Tod Hall", new Double(100.00));
        treemap.put("Ralph Smith", new Double(-20.00));

        Set<Map.Entry<String, Double>> entrySet = treemap.entrySet();

        for (Map.Entry<String, Double> entryIter :
                entrySet) {
            System.out.print(entryIter.getKey() + ": ");
            System.out.println(entryIter.getValue());
        }

        System.out.println();

        double balance = treemap.get("John Snow");
        treemap.put("John Snow", balance + 1000);
        System.out.println("John Snow's balance: " + treemap.get("John Snow"));
    }

    void checkReverseCompare() {
        TreeSet<String> treeSet = new TreeSet<>((new StringReverseComparator()).reversed());

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        for (String element :
                treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        TreeSet<String> treeSet1 = new TreeSet<String>((o, t1) -> t1.compareTo(o));

        treeSet1.add("C");
        treeSet1.add("A");
        treeSet1.add("B");
        treeSet1.add("E");
        treeSet1.add("F");
        treeSet1.add("D");

        for (String element :
                treeSet1) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// String reverse comparator.

class StringReverseComparator implements Comparator<String> {
    @Override
    public int compare(String o, String t1) {
        return t1.compareTo(o);
    }
}

class SurnameComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        int indexOfS = s.lastIndexOf(' ');
        int indexOfT1 = t1.lastIndexOf(' ');
        // Compare surnames.
        int surnameCompare = s.substring(indexOfS).compareTo(t1.substring(indexOfT1));
        // If surnames are equal, check with name.
        if(surnameCompare == 0)
            return s.compareTo(t1);
        else
            return surnameCompare;
    }
}
