package com.company.PartTwo.JavaCollections;

import java.util.Arrays;

public class ArraysLearn {
    public static void main(String [] args) {
        int array[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.println("Source array: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted array: ");
        display(array);
        Arrays.fill(array, 2, 6, -1);
        System.out.println("After filling: ");
        display(array);
        Arrays.sort(array);
        System.out.println("After second sorting: ");
        display(array);

        System.out.println("look for -9: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i :
                array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
