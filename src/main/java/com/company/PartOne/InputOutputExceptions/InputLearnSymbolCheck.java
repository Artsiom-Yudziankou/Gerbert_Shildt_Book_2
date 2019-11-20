package com.company.PartOne.InputOutputExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputLearnSymbolCheck {
    public static void main(String[] args) throws IOException {
        char symbolWait;
        BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the symbol.");
        System.out.println("Enter q for the end.");
        do {
           symbolWait =(char) bufferedReaderObject.read();
            System.out.println(symbolWait);
        } while (symbolWait != 'q');
    }
}
