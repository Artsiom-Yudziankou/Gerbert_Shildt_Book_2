package com.company.PartOne.Generics;

// To implement the generic method : <list_of_type_params> return_type method_name(list of params) {...}
//            ex. : <T extends Comparable<T>, V extends T> boolean myMethod (T element, V element) {...}

public class GenericsLearnMethods {
    static <T extends Comparable<T>, V extends T> boolean methodCheckIfIsIn(T element, V [] array) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer arrayOfInteger[] = {1,2,3,4,5};
        if (methodCheckIfIsIn(2, arrayOfInteger)) System.out.println("2 is in array.");
        if (!methodCheckIfIsIn(7,arrayOfInteger)) System.out.println("7 is not in array.");

        String arrayOfString[] = {"one", "two", "three", "four", "five"};
        if(methodCheckIfIsIn("two", arrayOfString)) System.out.println("Two is in array.");
        if (methodCheckIfIsIn("seven", arrayOfString)) System.out.println("Seven is not in array.");
    }
}