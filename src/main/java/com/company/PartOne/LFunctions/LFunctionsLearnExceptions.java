package com.company.PartOne.LFunctions;

interface InterfaceForAverageValue {
    double methodArrayAverageSum (double [] paramDoubleArray) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array is empty.");
    }
}

public class LFunctionsLearnExceptions {
    public static void main(String[] args) throws EmptyArrayException {
        double arrayOfDouble [] = {1.0, 2.0, 3.0, 4.0, 5.0};
        InterfaceForAverageValue averageSumOfArray;
        averageSumOfArray = paramDoubleArray -> {
            double sumValue = 0.0;
            if (paramDoubleArray.length ==0)
                throw new EmptyArrayException();
            for (int i = 0; i < paramDoubleArray.length; i++) {
                sumValue += paramDoubleArray[i];
            }
            return sumValue/paramDoubleArray.length;
        };
        System.out.println("Average Sum is: " + averageSumOfArray.methodArrayAverageSum(arrayOfDouble));
        System.out.println("Average Sum is: " + averageSumOfArray.methodArrayAverageSum(new double[0]));
    }
}
