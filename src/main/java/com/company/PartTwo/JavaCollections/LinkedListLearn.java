package com.company.PartTwo.JavaCollections;

import java.util.LinkedList;

public class LinkedListLearn {
    public static void main(String[] args){
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("F");
        stringLinkedList.add("B");
        stringLinkedList.add("D");
        stringLinkedList.add("E");
        stringLinkedList.add("C");
        stringLinkedList.add("Z");
        stringLinkedList.add("A");
        stringLinkedList.add(1,"A2");
        System.out.println("Elements: " + stringLinkedList);
        stringLinkedList.remove(2);
        stringLinkedList.remove("F");
        System.out.println("Elements after removing: " + stringLinkedList);
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println("Elements after removing: " + stringLinkedList);
        String stringElement = stringLinkedList.get(2);
        stringLinkedList.set(2, stringElement + "changed");
        System.out.println("Elements after changing: " + stringLinkedList);

    }
}
