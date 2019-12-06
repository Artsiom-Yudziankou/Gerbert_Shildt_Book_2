package com.company.PartTwo.JavaCollections;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertyLearn {
    public static void main(String[] args) throws IOException {
        Properties defList = new Properties();
        defList.put("Florida", "FortBoyard");

        Properties capitals = new Properties(defList);
        capitals.put("Illinoys", "SpringField");
        capitals.put("Missure", "Jefferson-City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianopolis");

        Set<?> states = capitals.keySet();

        for (Object iter :
                states) {
            System.out.println("The capital of " + iter + "is " + capitals.getProperty((String) iter));
        }
        System.out.println();

        String str = capitals.getProperty("Florida", "Not found");
        System.out.println("The capital of Florida is " + str);


        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fileIn = null;
        boolean ifchanged = false;

        try {
            fileIn = new FileInputStream("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\phoneBook.dat");
        } catch (FileNotFoundException e) {
            System.out.println("File wasn't found.");
        }

        try {
            if (fileIn != null) {
                ht.load(fileIn);
                fileIn.close();
            }
        }catch (IOException e) {
            System.out.println("Error during reading the File");
            }

        do {
            System.out.println("Enter name (enter exit to terminate): ");
            name = br.readLine();
            if (name.equals("exit")) continue;
            System.out.println("Enter number: ");
            number = br.readLine();
            ht.put(name, number);
            ifchanged = true;
        } while (!name.equals("exit"));

        if (ifchanged) {
            FileOutputStream fileOut = new FileOutputStream("Q:\\arty\\Java\\Gerbert_Shildt_Book_2\\src\\main\\resources\\phoneBook.dat");
            ht.store(fileOut, "Phone Book");
            fileOut.close();
        }

        do {
            System.out.println("Enter the name to look for (enter exit to terminate): ");
            name = br.readLine();
            if (name.equals("exit")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));

    }
}
