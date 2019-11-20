package com.company.Modules.ModulesLearn1.appsrc.appfuncs.appfuncs.simplefuncs;

public class ModuleLearnSimpleFunctions {
    public static boolean methodCheckIfMultiplier(int paramInt, int paramInt2) {
        if ((paramInt2 % paramInt) == 0)
            return true;
        return false;
    }

    // method returns the lowest mulyiplier for both.
    public static int methodReturnSmallestMultiplier (int paramInt, int paramInt2) {
        paramInt = Math.abs(paramInt);
        paramInt2 = Math.abs(paramInt2);

        int varIntMinMultiplier = paramInt < paramInt2 ? paramInt : paramInt2;
        for (int i = 2; i <= varIntMinMultiplier/2; i++) {
            if (methodCheckIfMultiplier(i, paramInt) && methodCheckIfMultiplier(i, paramInt2))
                return i;
        }
        return 1;
    }

    public static int methodReturnLargestMultiplier (int paramInt, int paramInt2) {
        paramInt = Math.abs(paramInt);
        paramInt2 = Math.abs(paramInt2);

        int varIntMaxMultiplier = paramInt < paramInt2 ? paramInt : paramInt2;
        for (int i = varIntMaxMultiplier/2; i >= 2 ; i--) {
            if (methodCheckIfMultiplier(i, paramInt) && methodCheckIfMultiplier(i, paramInt2))
                return i;
        }
        return 1;
    }
}
