package com.company.InputOutputExceptions;

// "assert" can be used for checking the condition. assert condition : String to print.
//                                              ex.: assert varIntN > 0 : "The varIntN < 0"
// To use the assert check, the "-ea" must be during the launching : java -ea InputOutputLearnAssert
// To use the assert check in a package, the "-da" must be during the launching: -da:MyPackage



public class InputOutputLearnAssert {
    static int value = 3;

    static int getValue() {
        return value --;
    }

    public static void main(String[] args) {
        int varIntN;
        for (int i = 0; i < 10 ; i++) {
            varIntN = getValue();

            assert varIntN > 0 : "WTF";
            System.out.println("varIntN == " + varIntN);
        }
    }
}
