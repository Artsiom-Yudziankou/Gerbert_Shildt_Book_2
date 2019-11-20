package com.company.PartOne.LFunctions;

interface GenericInterface2 <T> {
    int methodGeneric (T[] paramTArray, T paramT);
}


class ClassArrayOperations {
    static <T> int methodCountArrayElements (T[] paramTArray, T paramT) {
        int varIntCount = 0;
        for (int i = 0; i < paramTArray.length; i++) {
            if (paramTArray[i] == paramT) varIntCount++;
        }
        return varIntCount;
    }
}

public class LFunctionsLearnGenericMethodRef {
    static <T> int methodGetGenericReference (GenericInterface2<T> paramInterface, T[] paramTArray, T paramT) {
        return paramInterface.methodGeneric(paramTArray, paramT);
    }

    public static void main(String[] args) {
        Integer [] arrayOfInteger = {1,2,3,4,5,6,3,3,4,5,6};
        String [] arrayOfString = {"One", "Two", "Three", "Two"};
        int varIntCount;
        varIntCount = methodGetGenericReference(
                ClassArrayOperations::<Integer>methodCountArrayElements,
                arrayOfInteger,
                4
        );
        System.out.println("Quantity of 4 in array: " + varIntCount);

        varIntCount = methodGetGenericReference(
                ClassArrayOperations::<String>methodCountArrayElements,
                arrayOfString,
                "Two"
        );
        System.out.println("Quantity of 'Two' in array: " + varIntCount);
    }
}
