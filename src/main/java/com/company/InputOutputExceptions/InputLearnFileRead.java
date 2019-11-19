package com.company.InputOutputExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputLearnFileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fileInputStreamObject = new FileInputStream(new File("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\XXX.txt"));
        int IntValueOfCharRead;

        // read all symbols from file XXX till the end (-1).
        do {
            IntValueOfCharRead = fileInputStreamObject.read();
            if (IntValueOfCharRead != -1) System.out.println((char) IntValueOfCharRead);
        } while (IntValueOfCharRead != -1);
        // Close file reader
        fileInputStreamObject.close();
    }
}
