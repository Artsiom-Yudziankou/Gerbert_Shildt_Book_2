package com.company.LFunctions;

interface InterfaceCheckStaticMethodRef {
    String methodCheckStaticMethodRef(String paramString);
}

class classWithStaticMethod {
    static String methodStaticStringReverse(String paramString) {
        String result = "";
        for (int i = paramString.length() - 1; i >= 0 ; i--) {
            result += paramString.charAt(i);
        }
        return result;
    }
}


public class LFunctionsLearnStaticReferenceMethod {

    static String methodGetStaticMethodReference(InterfaceCheckMethodReference paramInterface, String paramString ) {
        return paramInterface.methodCheckMethodReference(paramString);
    }

    public static void main(String[] args) {
        String objectStringIn = "L-Function boosts effect of Java.";
        String objectStringOut;

        objectStringOut = methodGetStaticMethodReference(classWithStaticMethod::methodStaticStringReverse, objectStringIn);
        System.out.println("Source string: " + objectStringIn);
        System.out.println("Modified string: " + objectStringOut);
    }
}
