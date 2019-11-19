package com.company.LFunctions;

interface GenericInterfaceUse <T> {
    T methodForGenericOperation(T paramT);
}


public class LFunctionLearnGenericL {
    public static void main(String[] args) {
        GenericInterfaceUse<Integer> interfaceIntegerObject;
        GenericInterfaceUse<String> interfaceStringObject;
        interfaceIntegerObject = paramT -> {
            int result = 1;
            for (int i = 1; i < paramT; i++) {
                result *= i;
            }
            return result;
        };

        interfaceStringObject = paramT -> {
            String result = "";
            for (int i = paramT.length()-1; i >=0 ; i--) {
                result += paramT.charAt(i);
            }
            return result;
        };

        System.out.println("Reverse of L-Function: "
                + interfaceStringObject.methodForGenericOperation("L-Function"));
        System.out.println("Factorial of 20: " + interfaceIntegerObject.methodForGenericOperation(20));
    }
}
