package com.company.LFunctions;

interface InterfaceFunctionVarCapture {
    int methodVarCapture (int paramInteger);
}

public class LFunctionsLearnVariableCapture {
    public static void main(String[] args) {
        int varInteger = 10;
        InterfaceFunctionVarCapture functionL;
        functionL = paramInteger -> {
            int varInt = varInteger + paramInteger;
//            varInteger++;
            return varInt;
        };
//        varInteger ++;
    }
}
