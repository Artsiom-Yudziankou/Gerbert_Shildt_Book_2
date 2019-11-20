package com.company.PartOne.InputOutputExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputLearnStringCheck {
    public static void main(String[] args) throws IOException {
        String stringWait;

        BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something");
        System.out.println("Enter 'stop' to finish.");
        do {
            stringWait = bufferedReaderObject.readLine();
            System.out.println(stringWait);
        } while (!stringWait.equals("stop"));
    }
}
