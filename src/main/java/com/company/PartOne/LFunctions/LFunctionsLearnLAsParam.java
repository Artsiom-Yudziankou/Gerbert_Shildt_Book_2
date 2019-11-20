package com.company.PartOne.LFunctions;

interface InterfaceLAsParam {
    String methodLAsParam(String paramString);
}


public class LFunctionsLearnLAsParam {
    static String methodForCheckLAsParam(InterfaceLAsParam paramInterface, String paramString) {
        return paramInterface.methodLAsParam(paramString);
    }

    public static void main(String[] args) {
        String objectString = "L-Function boosts the effect of Java.";
        String objectStringOut;
        System.out.println("This is source string: " + objectString);
        objectStringOut = methodForCheckLAsParam(paramString -> paramString.toUpperCase(), objectString);
        System.out.println("This is modified string: " + objectStringOut);
        objectStringOut = methodForCheckLAsParam(paramString -> {
            String result = "";
            for (int i = 0; i < paramString.length() - 1; i++) {
                if (paramString.charAt(i) != ' ')
                    result += paramString.charAt(i);
            }
            return result;
        }, objectString);
        System.out.println("String without spaces: " + objectStringOut);
        InterfaceLAsParam interfaceLAsParamObject;
        interfaceLAsParamObject = paramString -> {
            String result = "";
            for (int i = paramString.length()-1; i >=0 ; i--) {
                result += paramString.charAt(i);
            }
            return result;
        };
        System.out.println("This string is modified: " + methodForCheckLAsParam(interfaceLAsParamObject, objectString));
    }
}
