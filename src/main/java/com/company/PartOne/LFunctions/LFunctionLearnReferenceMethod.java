package com.company.PartOne.LFunctions;

interface InterfaceCheckMethodReference {
    String methodCheckMethodReference(String paramString);
}

class classWithNonStaticMethod {
    String methodNonStaticStringReverse(String paramString) {
        String result = "";
        for (int i = paramString.length() - 1; i >= 0 ; i--) {
            result += paramString.charAt(i);
        }
        return result;
    }
}


public class LFunctionLearnReferenceMethod {

    static String methodGetMethodReference(InterfaceCheckMethodReference paramInterface, String paramString ) {
        return paramInterface.methodCheckMethodReference(paramString);
    }

    public static void main(String[] args) {
        String objectStringIn = "L-Function boosts effect of Java.";
        String objectStringOut;

        classWithNonStaticMethod classObject = new classWithNonStaticMethod();

        objectStringOut = methodGetMethodReference(classObject::methodNonStaticStringReverse, objectStringIn);
        System.out.println("Source string: " + objectStringIn);
        System.out.println("Modified string: " + objectStringOut);
    }
}

