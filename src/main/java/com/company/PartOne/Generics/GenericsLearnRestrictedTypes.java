package com.company.PartOne.Generics;

// Restriction of top boarder is done with 'extends' : class A <T extends MyClass & MyInterface> {...}
// The & is produced for merging the conditions.
// <?> - meta symbol that helps to provide to use 'Unknown Type' that is appropriate.
// <? extends Aclass> - any class, that appropriate in case the top border is Aclass.

public class GenericsLearnRestrictedTypes {
    public static void main(String[] args){
        Integer arrayOfIntegerNums [] = {1,2,3,4,5};
        GenericClassRestrictedType<Integer> classObjectInteger =
                new GenericClassRestrictedType<Integer>(arrayOfIntegerNums);
        double varDoubleV = classObjectInteger.methodSumCalculation();
        System.out.println("Sum value: " + varDoubleV);

        Double arrayOfDoubleNums [] = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericClassRestrictedType<Double> classObjectDouble =
                new GenericClassRestrictedType<Double>(arrayOfDoubleNums);
        double varDoubleW = classObjectDouble.methodSumCalculation();
        System.out.println("Sum2 value: " + varDoubleW);

        Float arrayOfFloatNums [] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        GenericClassRestrictedType<Float> classObjectFloat =
                new GenericClassRestrictedType<Float>(arrayOfFloatNums);
        double varDoubleU = classObjectFloat.methodSumCalculation();
        System.out.println("Sum3 value: " + varDoubleU);

        if (classObjectInteger.methodCheckIfSumEqual(classObjectDouble))
            System.out.println("Sum of Double and Integer objects is the same.");
        else
            System.out.println("Sum of Double and Integer objects is different.");

        if (classObjectInteger.methodCheckIfSumEqual(classObjectFloat))
            System.out.println("Sum of Float and Integer objects is the same.");
        else
            System.out.println("Sum of Float and Integer objects is different.");
    }
}

class GenericClassRestrictedType <T extends  Number> {
    T[] classObjectT;

    GenericClassRestrictedType(T[] classObjectT) {
        this.classObjectT = classObjectT;
    }

    double methodSumCalculation() {
        double classObjectTSum = 0.0;
        for (int i = 0; i < classObjectT.length; i++) {
            classObjectTSum += classObjectT[i].doubleValue();
        }
        return classObjectTSum;
    }

    boolean methodCheckIfSumEqual(GenericClassRestrictedType<?> classObject) {
        if (methodSumCalculation() == classObject.methodSumCalculation()) return true;
        else return false;
    }
}





