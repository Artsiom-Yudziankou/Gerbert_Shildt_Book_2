package com.company.PartOne.LFunctions;

interface InterfaceGenericConstructorCheck <T> {
    ClassGenericConstructorCheck<T>  methodGenericConstructor(T paramT);
}

class ClassGenericConstructorCheck <T>{
    private T varTvalue;

    public ClassGenericConstructorCheck(T varTvalue) {
        this.varTvalue = varTvalue;
    }

    ClassGenericConstructorCheck() {
        varTvalue = null;
    }

    public T getVarTvalue() {
        return varTvalue;
    }
}

public class LFunctionsLearnGenericConstructor {
    public static void main(String[] args) {
        InterfaceGenericConstructorCheck<Integer> genericConstructor = ClassGenericConstructorCheck<Integer>::new;
        ClassGenericConstructorCheck<Integer> classObject = genericConstructor.methodGenericConstructor(100);
        System.out.println("Value is: " + classObject.getVarTvalue());
    }
}
