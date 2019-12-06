package com.company.PartTwo.JavaCollections;

import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String [] args){

        ArrayDeque<String> strings = new ArrayDeque<>();

        strings.addFirst("A");
        strings.addFirst("B");
        strings.addFirst("D");
        strings.addFirst("E");
        strings.addFirst("F");
        System.out.println("Stack: " );
        while (strings.peek() != null) {
            System.out.print(strings.pop() + " ");
        }
    }
}
