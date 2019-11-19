package com.company.InputOutputExceptions;

// Use "instanceOf" to check if the variable/element is an example of class or can be typed to its type.
//                                                              ex.: boolean varIndicator = objectA instanceOf Aclass;
// Use "transient" to show not to save the data of this variable.
//                                                              ex.: transient int a;
// Use "volatile" to show to use this value as actual value, for example a lot of threads reach the variable.
//                                                              ex.: volatile int a;
// Use "strictfp" to show to use the previous model of alphanumeric operations for float and double types.
//                                                              ex.: strictpf MyClass { ... }
// Use "native" declare the platform-oriented method not declaring the body of it:
//                                                              ex.: public native int myMethod();


class Aclass {
    int varIntI, varIntJ;
}

class Bclass {
    int varIntI, varIntJ;
}

class Cclass extends Aclass {
    int varIntK;
}

class Dclass extends Aclass {
    int varIntK;
}


public class InputOutputLearnInstanceOf {
    public static void main(String[] args) {
        // Declare objects of each class
        Aclass objectA = new Aclass();
        Bclass objectB = new Bclass();
        Cclass objectC = new Cclass();
        Dclass objectD = new Dclass();

        if(objectA instanceof Aclass) System.out.println("Object a is an instance of A class");
        if(objectB instanceof Bclass) System.out.println("Object b is an instance of B class");
        if(objectC instanceof Cclass) System.out.println("Object c is an instance of C class");
        if(objectC instanceof Aclass) System.out.println("Object c can be typed to A class");
        if(objectA instanceof Cclass) System.out.println("Object a can be typed to C class");

        // Comparing inherited types

        Aclass objectA2;
        objectA2 = objectD;
        System.out.println("Second object A is a reference to object of D");
        if (objectA2 instanceof Dclass) System.out.println("Second object A is an example of class D");

        objectA2 = objectC;
        System.out.println("Second object A is a reference to object of C");
        if(objectA2 instanceof Dclass) System.out.println("Second object A can be typed to D class");
        else System.out.println("Second object A cannot be typed to D class");

        if(objectA2 instanceof Aclass) System.out.println("Second object A can be typed to A class");

        if(objectA instanceof Object) System.out.println("Object A can be typed to Object class");
        if(objectB instanceof Object) System.out.println("Object B can be typed to Object class");
        if(objectC instanceof Object) System.out.println("Object C can be typed to Object class");
        if(objectD instanceof Object) System.out.println("Object D can be typed to Object class");
    }
}
