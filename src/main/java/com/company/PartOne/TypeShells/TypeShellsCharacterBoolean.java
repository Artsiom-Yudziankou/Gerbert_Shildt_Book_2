package com.company.PartOne.TypeShells;

// For Initiating variables of Shells the valueOf method can be used :
//      Character charVariable = Character.valueOf(char symbol)
//      Boolean   booleanVariable = Boolean.valueOf(boolean value) / Boolean.valueOf(String value)
//      Integer   integerVariable = Integer.valueOf(int value) / Integer.valueOf(String value)


public class TypeShellsCharacterBoolean {
    public static void main(String[] args) {
        Boolean varBooleanShell = Boolean.valueOf(true);
        if (varBooleanShell) System.out.println("varBooleanShell is true");

        Character varCharacterShell = Character.valueOf('x');
        char varChar = varCharacterShell;
        System.out.println("varChar equal varCharacterShell " + varChar);
    }
}
