package com.company.PartOne.Generics;

public class GenericsLearnRedefinitionOfMethods {
    public static void main(String[] args){

        GenericSuperClass1<Integer> superClassObjectInteger = new GenericSuperClass1<Integer>(88);
        GenericInheritedClass1<Integer> classObjectInteger = new GenericInheritedClass1<Integer>(99);
        GenericInheritedClass1<String> classObjectString = new GenericInheritedClass1<String>("Test");
        System.out.println(superClassObjectInteger.getClassObject());
        System.out.println(classObjectInteger.getClassObject());
        System.out.println(classObjectString.getClassObject());
    }
}


class GenericSuperClass1 <T> {
    T classObject;

    public GenericSuperClass1(T classObject) {
        this.classObject = classObject;
    }

    public T getClassObject() {
        System.out.println("Method getClassObject() from GenericSuperClass1");
        return classObject;
    }
}

class GenericInheritedClass1 <T> extends GenericSuperClass1<T> {
    public GenericInheritedClass1(T classObject) {
        super(classObject);
    }

    @Override
    public T getClassObject() {
        System.out.println("Method getClassObject() from GenericInheritedClass1");
        return super.getClassObject();
    }
}