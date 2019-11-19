package com.company.LFunctions;

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private int varIntValue;

    public MyClass(int varIntValue) {
        this.varIntValue = varIntValue;
    }

    public int getVarIntValue() {
        return varIntValue;
    }
}


public class LFunctionsLearnCollections {
    static int methodCompare(MyClass paramObject, MyClass paramObject2) {
        return paramObject.getVarIntValue() - paramObject2.getVarIntValue();
    }

    public static void main(String[] args){
        ArrayList<MyClass> arrayListMyClass = new ArrayList<>();

        arrayListMyClass.add(new MyClass(1));
        arrayListMyClass.add(new MyClass(5));
        arrayListMyClass.add(new MyClass(9));
        arrayListMyClass.add(new MyClass(3));
        arrayListMyClass.add(new MyClass(7));

        MyClass maxValueOfArray = Collections.max(arrayListMyClass, LFunctionsLearnCollections::methodCompare);
        System.out.println("Max value of array is: " + maxValueOfArray.getVarIntValue());
    }
}
