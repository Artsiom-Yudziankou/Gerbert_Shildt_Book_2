package com.company.PartTwo.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratorLearn {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("C");
        strings.add("A");
        strings.add("E");
        strings.add("B");
        strings.add("D");
        strings.add("F");

        System.out.println("Array: " + strings);

        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            String currentString = stringIterator.next();
            System.out.print(currentString + " ");
        }

        System.out.println();

        ListIterator<String> stringListIterator = strings.listIterator();
        while (stringListIterator.hasNext()) {
            String currentString = stringListIterator.next();
            stringListIterator.set(currentString + " + ");
        }

        System.out.println("Array changed: " );
        stringIterator = strings.iterator();

        while (stringIterator.hasNext()) {
            String currentString = stringIterator.next();
            System.out.print(currentString + " ");
        }

        System.out.println();

        System.out.println("Changed Array back-to-front: ");
        while (stringListIterator.hasPrevious()) {
            String currentString = stringListIterator.previous();
            System.out.print(currentString + " ");
        }

        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        System.out.println("Source array: " + integerArrayList);

        for (int iter: integerArrayList
             ) {
            System.out.print(iter + " ");
        }

        System.out.println();

        int sumOfElements = 0;

        for (int iter :
                integerArrayList) {
            sumOfElements += iter;
        }
        System.out.println("Sum is : " + sumOfElements);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(1.0);
        doubleArrayList.add(2.0);
        doubleArrayList.add(3.0);
        doubleArrayList.add(4.0);
        doubleArrayList.add(5.0);

        System.out.println("Source array: " + doubleArrayList);

        Spliterator<Double> doubleSpliterator = doubleArrayList.spliterator();
        while(doubleSpliterator.tryAdvance((n)-> System.out.println(n)));

        doubleSpliterator = doubleArrayList.spliterator();
        ArrayList<Double> doubleSquares = new ArrayList<>();
        while (doubleSpliterator.tryAdvance((n)-> doubleSquares.add(Math.sqrt(n))));
        System.out.println("Sqrt array: ");
        doubleSpliterator = doubleSquares.spliterator();
        doubleSpliterator.forEachRemaining((n)-> System.out.println(n));
        System.out.println();
    }
}
