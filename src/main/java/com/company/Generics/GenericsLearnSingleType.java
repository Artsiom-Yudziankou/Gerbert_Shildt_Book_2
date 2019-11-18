package com.company.Generics;

public class GenericsLearnSingleType {
    public static void main(String[] args) {
        GenericClassWithSingleType <Integer> classIntegerObject = new GenericClassWithSingleType<Integer>(88);
        classIntegerObject.showTypes();

        int varIntI = classIntegerObject.getClassObject();
        System.out.println("Value: " + varIntI);

        GenericClassWithSingleType <String> classStringObject = new GenericClassWithSingleType<String>("Test");
        classStringObject.showTypes();

        String varStringS = classStringObject.getClassObject();
        System.out.println("Value: " + varStringS);
    }
}


class GenericClassWithSingleType <T> {
    T classObject;

    GenericClassWithSingleType (T classObject) {
        this.classObject = classObject;
    }

    void showTypes () {
        System.out.println("Type T: " + classObject.getClass().getName());
    }

    T getClassObject() {
        return classObject;
    }
}