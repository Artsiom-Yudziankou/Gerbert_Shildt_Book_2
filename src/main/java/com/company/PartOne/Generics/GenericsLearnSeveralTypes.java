package com.company.PartOne.Generics;

public class GenericsLearnSeveralTypes {
    public static void main(String[] args){
        GenericClassWithSeveralTypes<Integer, String> classObject =
                new GenericClassWithSeveralTypes<Integer, String>(88, ": test");
        classObject.showTypes();

        int varIntI = classObject.getClassObjectT();
        System.out.println("Value: " + varIntI);

        String varStringS = classObject.getClassObjectV();
        System.out.println("Value: " + varStringS);
    }
}


class GenericClassWithSeveralTypes <T,V> {
    T classObjectT;
    V classObjectV;

    GenericClassWithSeveralTypes (T classObjectT, V classObjectV) {
        this.classObjectT = classObjectT;
        this.classObjectV = classObjectV;
    }

    void showTypes () {
        System.out.println("Type T: " + classObjectT.getClass().getName());
        System.out.println("Type V: " + classObjectV.getClass().getName());
    }

    T getClassObjectT() {
        return classObjectT;
    }

    V getClassObjectV() {
        return classObjectV;
    }
}