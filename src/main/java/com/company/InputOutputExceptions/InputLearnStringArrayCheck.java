package com.company.InputOutputExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputLearnStringArrayCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
        String[] stringWait = new String[10];
        System.out.println("Enter some strings of text.");
        System.out.println("Enter 'stop' to finish.");
        for (int i = 0; i <stringWait.length ; i++) {
            stringWait[i] = bufferedReaderObject.readLine();
            if(stringWait[i].equals("stop")) break;
        }
        System.out.println("Printing the typed text:");
        for (int i = 0; i <stringWait.length ; i++) {
            System.out.println(stringWait[i]);
            if (stringWait[i].equals("stop")) break;
        }
    }
}
