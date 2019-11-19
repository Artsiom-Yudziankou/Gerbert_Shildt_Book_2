package com.company.InputOutputExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputLearnTryWithRecources {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(new File("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\XXX.txt"));
             FileOutputStream fileOutputStream = new FileOutputStream((new File("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\YYY.txt")))){
            int IntValueOfChar;

            do {
                IntValueOfChar = fileInputStream.read();
                if (IntValueOfChar != -1) fileOutputStream.write((char) IntValueOfChar);
            } while (IntValueOfChar != -1);

        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}
