package com.company.PartTwo.HandlingOfString;

public class StringLearnToString {
    public static void main(String[] args) {
        ClassBox classObject = new ClassBox(10,12,14);
        String objectString = "Object classObject : " + classObject; // concantination with classObject
        System.out.println(classObject);
        System.out.println(objectString);
    }
}



class ClassBox {
    double varDoubleWidth;
    double varDoubleHeight;
    double varDoubleDepth;

    public ClassBox(double varDoubleWidth, double varDoubleHeight, double varDoubleDepth) {
        this.varDoubleWidth = varDoubleWidth;
        this.varDoubleHeight = varDoubleHeight;
        this.varDoubleDepth = varDoubleDepth;
    }

    public String toString() {
        return "Size : " + varDoubleWidth + " X " + varDoubleHeight + " X " + varDoubleDepth;
    }
}