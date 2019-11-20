package com.company.PartOne.Generics;

public class GenericsLearnInheritance {
    public static void main(String[] args) {
        GenericSuperClass<Integer> superClassObjectInteger = new GenericSuperClass<Integer>(88);
        GenericInheritedClass<Integer> classObjectInteger = new GenericInheritedClass<Integer>(99);
        GenericInheritedClass<String> classObjectString = new GenericInheritedClass<String>("Test");

        // Check if classObjectInteger is the instance of GenericInheritedClass
        if (classObjectInteger instanceof GenericInheritedClass<?>)
            System.out.println("classObjectInteger is an Instance of GenericInheritedClass.");
        // Check if classObjectInteger can be typed to GenericSuperClass
        if (classObjectInteger instanceof GenericSuperClass<?>)
            System.out.println("classObjectInteger can be typed to type of GenericSuperClass.");
        // Check if the classObjectString is an Instance of GenericInheritedClass
        if (classObjectString instanceof GenericInheritedClass<?>)
            System.out.println("classObjectString is an Instance of GenericInheritedClass.");
        // Check if the classObjectString can be type to the type of GenericSuperClass
        if (classObjectString instanceof GenericSuperClass<?>)
            System.out.println("classObjectString can be typed to the type of GenericSuperClass.");
        // Check if the superClassObjectInteger is an Instance or can be typed to GenericInheritedClass.
        if (superClassObjectInteger instanceof GenericInheritedClass<?>)
            System.out.println("superClassObjectInteger is an Instance of GenericInheritedClass.");
        else System.out.println("superClassObjectInteger can not be type to the type of GenericInheritedClass.");
        // Check if the superClassObjectInteger is an Instance of GenericSuperClass
        if (superClassObjectInteger instanceof GenericSuperClass<?>)
            System.out.println("superClassObjectInteger is an Instance of GenericSuperClass.");
        // Such checks can not be produced due to impossibility of using the special types like Integer.
        // if (classObjectInteger instanceof GenericInheritedClass<Integer>)

    }
}


class GenericSuperClass <T> {
    T superClassObject;

    public GenericSuperClass(T classObject) {
        superClassObject = classObject;
    }

    public T getSuperClassObject() {
        return superClassObject;
    }
}

class GenericInheritedClass <T> extends GenericSuperClass<T> {

    public GenericInheritedClass(T classObject) {
        super(classObject);
    }
}

