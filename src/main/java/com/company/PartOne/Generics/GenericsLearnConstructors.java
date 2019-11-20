package com.company.PartOne.Generics;

public class GenericsLearnConstructors {
    private double varDoubleValue;

    <T extends Number> GenericsLearnConstructors(T argumentParam) {
        varDoubleValue = argumentParam.doubleValue();
    }

    void methodShowDoubleValue() {
        System.out.println("Value: " + varDoubleValue);
    }

    public static void main(String[] args) {
        GenericsLearnConstructors classObject1 = new GenericsLearnConstructors(100);
        GenericsLearnConstructors classObject2 = new GenericsLearnConstructors(123.5F);
        classObject1.methodShowDoubleValue();
        classObject2.methodShowDoubleValue();
    }
}
