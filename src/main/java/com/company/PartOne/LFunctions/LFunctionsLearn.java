package com.company.PartOne.LFunctions;

interface InterfaceFabricConstructorCheck <R, T> {
    R methodFabricConstructor(T paramT);
}

class ClassFabricConstructorCheck <T> {
    private T varTValue;

    public ClassFabricConstructorCheck(T varTValue) {
        this.varTValue = varTValue;
    }

    ClassFabricConstructorCheck() {
        varTValue = null;
    }

    public T getVarTValue() {
        return varTValue;
    }
}

class ClassFabricConstructorCheck2 {
    String varStringValue;

    public ClassFabricConstructorCheck2(String varStringValue) {
        this.varStringValue = varStringValue;
    }

    ClassFabricConstructorCheck2() {
        varStringValue = "";
    }

    public String getVarStringValue() {
        return varStringValue;
    }
}

public class LFunctionsLearn {
    static <R, T> R methodClassFactory(InterfaceFabricConstructorCheck<R, T> paramInterface, T paramT) {
        return paramInterface.methodFabricConstructor(paramT);
    }

    public static void main(String[] args) {
        InterfaceFabricConstructorCheck<ClassFabricConstructorCheck<Double>, Double> classConstructor =
                ClassFabricConstructorCheck<Double>::new;

        ClassFabricConstructorCheck<Double> classObject = methodClassFactory(classConstructor, 100.1);
        System.out.println("Value of classObject is: " + classObject.getVarTValue());

        InterfaceFabricConstructorCheck<ClassFabricConstructorCheck2, String> classConstructor2 =
                ClassFabricConstructorCheck2::new;
        ClassFabricConstructorCheck2 classObject2 = methodClassFactory(classConstructor2, "He-He");
        System.out.println("Value of classObject2 is: " + classObject2.getVarStringValue());
    }
}
