package com.company.PartOne.Generics;

interface MyGenericInterface<T extends Comparable<T>> {
    T methodToCheckMinValue();
    T methodToCheckMaxValue();
}

class MyGenericClass <T extends Comparable<T>> implements MyGenericInterface<T> {

    T[] arrayOfVars;
    MyGenericClass(T[] arrayOfVars) {
        this.arrayOfVars = arrayOfVars;
    }

    @Override
    public T methodToCheckMinValue() {
        T varToCompare = arrayOfVars[0];
        for (int i = 1; i < arrayOfVars.length; i++) {
            if (arrayOfVars[i].compareTo(varToCompare) < 0) varToCompare = arrayOfVars[i];
        }
        return varToCompare;
    }

    @Override
    public T methodToCheckMaxValue() {
        T varToCompare = arrayOfVars[0];
        for (int i = 1; i <arrayOfVars.length ; i++) {
            if (arrayOfVars[i].compareTo(varToCompare) > 0) varToCompare = arrayOfVars[i];
        }
        return varToCompare;
    }
}


public class GenericsLearnInterface {
    public static void main(String[] args) {
        Integer arrayOfIntegers[] = {3,6,2,8,6};
        Character arrayOfCharacters[] = {'b', 'r', 'p', 'w'};

        MyGenericClass<Integer> classObjectInteger = new MyGenericClass<>(arrayOfIntegers);
        MyGenericClass<Character> classObjectCharacter = new MyGenericClass<>(arrayOfCharacters);

        System.out.println("Max value in array of integers: " + classObjectInteger.methodToCheckMaxValue());
        System.out.println("Min value in array of integers: " + classObjectInteger.methodToCheckMinValue());

        System.out.println("Max value in array of chars: " + classObjectCharacter.methodToCheckMaxValue());
        System.out.println("Min value in array of chars: " + classObjectCharacter.methodToCheckMinValue());
    }
}
