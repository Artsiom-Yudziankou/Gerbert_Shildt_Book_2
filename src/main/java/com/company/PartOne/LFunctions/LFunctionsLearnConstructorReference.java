package com.company.PartOne.LFunctions;

interface InterfaceConstructorCheck {
    classConstructorCheck methodConstructorCheck(int paramInt);
}

class classConstructorCheck {
    private int varIntValue;

    public classConstructorCheck(int varIntValue) {
        this.varIntValue = varIntValue;
    }

    classConstructorCheck() {
        varIntValue = 0;
    }

    public int getVarIntValue() {
        return varIntValue;
    }
}


public class LFunctionsLearnConstructorReference {
    public static void main(String[] args) {
        InterfaceConstructorCheck constructor = classConstructorCheck::new;
        classConstructorCheck classObject = constructor.methodConstructorCheck(100);
        System.out.println("Value of classObject is: " + classObject.getVarIntValue());
    }
}
