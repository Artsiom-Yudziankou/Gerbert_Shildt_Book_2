package com.company.LFunctions;

// Interface for L-function to get info if one param is multiplier of the second.
interface InterfaceForCheckL {
    boolean methodForLFunction (int paramFirst, int paramSecond);
}

// Interface for L-function to get the factorial value.
interface InterfaceForFactorial {
    int methodForFactorial (int paramInteger);
}

// Interface for L-function to rebuild String back-to-forward.
interface InterfaceForStringOperation {
    String methodForStringOperation (String paramString);
}

public class LFunctionSingleLBlockL {
    public static void main(String[] args) {
        // First interface
        InterfaceForCheckL interfaceObject;
        interfaceObject = (paramFirst, paramSecond) -> (paramFirst % paramSecond) == 0;
        if(interfaceObject.methodForLFunction(10, 2))
            System.out.println("2 is a multiplier of 10.");
        if(!interfaceObject.methodForLFunction(10, 3))
            System.out.println("3 is not a multiplier of 10.");

        // Second interface
        InterfaceForFactorial interfaceForFactorialObject;
        interfaceForFactorialObject = paramInteger -> {
            int result = 1;
            for (int i = 1; i <= paramInteger; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of 3 is: " + interfaceForFactorialObject.methodForFactorial(3));
        System.out.println("Factorial of 5 is: " + interfaceForFactorialObject.methodForFactorial(5));

        // Third interface
        InterfaceForStringOperation interfaceForStringObject;
        interfaceForStringObject = paramString -> {
            String result = "";
            for (int i = paramString.length() -1; i >=0 ; i--) {
                result += paramString.charAt(i);
            }
            return result;
        };

        System.out.println("Back-To-Forward of L-Function: "
                + interfaceForStringObject.methodForStringOperation("L-Function"));
        System.out.println("Back-To-Forward of Sentence: "
                + interfaceForStringObject.methodForStringOperation("Sentence"));
    }
}
