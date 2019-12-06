package com.company.PartTwo.JavaCollections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorLearn {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>(3, 2);

        System.out.println("Initial capacity: " + integers.capacity());
        System.out.println("Initial size: " + integers.size());

        integers.addElement(1);
        integers.addElement(2);
        integers.addElement(3);
        integers.addElement(4);

        System.out.println("Capacity after adding: " + integers.capacity());


        integers.addElement(5);
        System.out.println("current capacity after adding one more: " + integers.capacity());

        integers.addElement(6);
        integers.addElement(7);

        System.out.println("current capacity: " + integers.capacity());

        integers.addElement(9);
        integers.addElement(10);

        System.out.println("current capacity: " + integers.capacity());

        integers.addElement(11);
        integers.addElement(12);

        System.out.println("First element: " + integers.firstElement());
        System.out.println("Last element: " + integers.lastElement());

        if (integers.contains(3))
            System.out.println("3 in vector.");

        Enumeration<Integer> integerEnumeration = integers.elements();
        System.out.println("Vector elements: ");
        while(integerEnumeration.hasMoreElements())
            System.out.print(integerEnumeration.nextElement() + " ");

        System.out.println();

        for (Integer iter :
                integers) {
            System.out.print(iter + " ");
        }

        System.out.println();

    }
}
