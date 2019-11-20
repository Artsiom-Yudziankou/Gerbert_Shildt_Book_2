package com.company.PartOne.LFunctions;

interface MyFunctionalInterface {
    double getValue();
}

interface MyFunctionalInterface2 {
    boolean test(int n);
}

public class LFunctionsLearnSomeExamples {
    public static void main(String[] args) {
        MyFunctionalInterface interfaceObject;
        interfaceObject = () -> 123.45;
        System.out.println("Fixed value: " + interfaceObject.getValue());
        interfaceObject = () -> Math.random() * 100;

        System.out.println("Random value: " + interfaceObject.getValue());
        System.out.println("One more random value: " + interfaceObject.getValue());


        MyFunctionalInterface2 objectIsEven;
        objectIsEven = (n) -> (n%2) == 0;
        if(objectIsEven.test(10)) System.out.println("10 is Even.");
        if (!objectIsEven.test(9)) System.out.println("9 is not Even.");

        MyFunctionalInterface2 objectIsNonNegative;
        objectIsNonNegative = (n) -> n >= 0;
        if(objectIsNonNegative.test(1)) System.out.println("1 is positive.");
        if(!objectIsNonNegative.test(-1)) System.out.println("-1 is negative.");
    }
}
