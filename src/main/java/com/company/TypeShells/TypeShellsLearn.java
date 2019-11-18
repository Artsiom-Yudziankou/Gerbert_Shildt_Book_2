package com.company.TypeShells;

// For Initiating variables of Shells the valueOf method can be used :
//      Character charVariable = Character.valueOf(char symbol)
//      Boolean   booleanVariable = Boolean.valueOf(boolean value) / Boolean.valueOf(String value)
//      Integer   integerVariable = Integer.valueOf(int value) / Integer.valueOf(String value)



public class TypeShellsLearn {
    public static void main(String [] args) {
        Integer varIntegerShell = Integer.valueOf(100);
        Integer var2IntegerShell;
        int varInt;

        System.out.println("Initial value of varIntegerShell: " + varIntegerShell.toString());
        // Automatic unpacking of Integer Shell before ++ operand and then Automatic pack to Object.
        ++ varIntegerShell;
        System.out.println("After ++ operator the value of varIntegerShell: " + varIntegerShell.toString());
        // Automatic unpacking of Integer Shell before expression and packing it for Object.
        var2IntegerShell = varIntegerShell + (varIntegerShell/3);
        System.out.println("The value of var2IntegerShell: " + var2IntegerShell.toString());
        // Automatic unpacking of Integer Shell before expression and no packing as the varInt is primitive.
        varInt = varIntegerShell + (varIntegerShell/3);
        System.out.println("The value of varInt: " + varInt);
    }
}
