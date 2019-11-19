package com.company.InputOutputExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputLearnFileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStreamObject = new FileInputStream(new File("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\XXX.txt"));
        FileOutputStream fileOutputStreamObject = new FileOutputStream(new File ("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\YYY.txt"));

        int IntValueOfCharRead;

        do {
            IntValueOfCharRead = fileInputStreamObject.read();
            if (IntValueOfCharRead != -1 ) fileOutputStreamObject.write((char)IntValueOfCharRead);
        } while (IntValueOfCharRead != -1);

        fileInputStreamObject.close();
        fileOutputStreamObject.close();
    }
}
