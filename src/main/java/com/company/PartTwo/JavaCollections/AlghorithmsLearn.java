package com.company.PartTwo.JavaCollections;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlghorithmsLearn {
    public static void main(String [] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(-8);
        integers.add(20);
        integers.add(-20);
        integers.add(8);

        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(integers, comparator);
        System.out.println("Sorted array: " );
        for (Integer iter :
                integers) {
            System.out.print(iter + " ");
        }

        System.out.println();

        Collections.shuffle(integers);
        System.out.println("Shuffled array: ");

        for (Integer iter :
                integers) {
            System.out.print(iter + " ");
        }

        System.out.println();

        System.out.println("Min value: " + Collections.min(integers));
        System.out.println("Max value: " + Collections.max(integers));
    }
}
