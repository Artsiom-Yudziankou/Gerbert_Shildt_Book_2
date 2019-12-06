package com.company.PartTwo.JavaCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableLearn {
    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        hashtable.put("John Snow", 3434.13);
        hashtable.put("Tom Smith", 123.23);
        hashtable.put("Jane Baker", 1378.00);
        hashtable.put("Tod Hall", 99.22);
        hashtable.put("Ralph Smith", -19.08);

        names = hashtable.keys();
        while(names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + hashtable.get(str));
        }
        System.out.println();
        bal = hashtable.get("John Snow");
        hashtable.put("John Snow", bal + 1000);
        System.out.println("New balance of John Snow: " + hashtable.get("John Snow"));

        System.out.println();

        Set<String> set = hashtable.keySet();
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            str = iter.next();
            System.out.println(str + ": " + hashtable.get(str));
        }



    }
}
