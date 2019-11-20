package com.company.PartOne.LFunctions;

import java.util.function.Function;

public class LFunctionLearnFunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = integer -> {
            int result = 1;
            for (int i = 1; i <= integer ; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 3 is: " + factorial.apply(3));
        System.out.println("Factorial of 5 is: " + factorial.apply(5));
    }
}
