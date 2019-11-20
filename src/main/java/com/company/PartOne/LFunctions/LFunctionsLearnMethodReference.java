package com.company.PartOne.LFunctions;

interface GenericFunctionInterface <T> {
    boolean methodFunction(T paramT, T paramT2);
}

class classKeepHighTemp {
    private int varHighTemp;

    public classKeepHighTemp(int varHighTemp) {
        this.varHighTemp = varHighTemp;
    }

    boolean methodEqualTemp (classKeepHighTemp objectHighTemp) {
        return varHighTemp == objectHighTemp.varHighTemp;
    }

    boolean methodLessTemp (classKeepHighTemp objectHighTemp) {
        return varHighTemp < objectHighTemp.varHighTemp;
    }
}

public class LFunctionsLearnMethodReference {
    static <T> int methodCountObjects(T[] paramTArray, GenericFunctionInterface<T> paramInterface, T paramT) {
        int varIntCount = 0;
        for (int i = 0; i < paramTArray.length; i++) {
            if (paramInterface.methodFunction(paramTArray[i], paramT)) varIntCount ++;
        }
        return varIntCount;
    }

    public static void main (String [] args) {
        classKeepHighTemp [] arrayWeekHighTemp = {
                new classKeepHighTemp(89), new classKeepHighTemp(82),
                new classKeepHighTemp(90), new classKeepHighTemp(89),
                new classKeepHighTemp(89), new classKeepHighTemp(91),
                new classKeepHighTemp(84), new classKeepHighTemp(83)
        };

        int varIntCounter;

        varIntCounter = methodCountObjects(
                arrayWeekHighTemp,
                classKeepHighTemp::methodEqualTemp,
                new classKeepHighTemp(89)
        );
        System.out.println("Quantity of days with temperature 89: " + varIntCounter);

        classKeepHighTemp[] arrayWeekHighTemp2 = {
                new classKeepHighTemp(32), new classKeepHighTemp(12),
                new classKeepHighTemp(24), new classKeepHighTemp(19),
                new classKeepHighTemp(18), new classKeepHighTemp(12),
                new classKeepHighTemp(-1), new classKeepHighTemp(13)
        };

        varIntCounter = methodCountObjects(
                arrayWeekHighTemp2,
                classKeepHighTemp::methodEqualTemp,
                new classKeepHighTemp(12)
        );
        System.out.println("Quantity of days with temperature 12: " + varIntCounter);

        varIntCounter = methodCountObjects(
                arrayWeekHighTemp,
                classKeepHighTemp::methodLessTemp,
                new classKeepHighTemp(89)
        );
        System.out.println("Quantity of days with temperature less than 89: " + varIntCounter);

        varIntCounter = methodCountObjects(
                arrayWeekHighTemp2,
                classKeepHighTemp::methodLessTemp,
                new classKeepHighTemp(19)
        );
        System.out.println("Quantity of days with temperature less than 19: " + varIntCounter);
    }
}
