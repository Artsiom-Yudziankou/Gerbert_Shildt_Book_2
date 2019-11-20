package com.company.PartTwo.HandlingOfString.StringConstructorsLearn;

public class StringConstructorsLearn {
    public static void main(String[] args) {
        //______________________________________________________________________________________________________________
        // Initialize String without any chars.
        String objectString = new String();

        // Initialize String with array of chars.
        char arrayOfChars [] = { 'a', 'b', 'c' };
        String objectString2 = new String(arrayOfChars);

        // Initialize String with range of subarray of chars.
        // String (char charArray[], int initialIndex, int quantityOfChars)
        // In example below the String object will be initiated with "cde"
        char arrayOfChars2 [] = {'a', 'b', 'c', 'd', 'e', 'f' };
        String objectString3 = new String(arrayOfChars2, 2, 3);

        // Initialize String with another String object
        // String (String stringObject);
        char arrayOfChars3 [] = {'J', 'a', 'v', 'a'};
        String objectString4 = new String(arrayOfChars3); // String "Java"
        String objectString5 = new String(objectString4); // String "Java"

        // For sending via Internet the constructor with byte arrayOfChars is added.
        // String(byte charArray[]);
        // String(byte charArray[], int initialIndex, int quantityOfChars);
        byte arrayOfASCIIChars [] = { 65, 66, 67, 68, 69, 70 };
        String objectString6 = new String(arrayOfASCIIChars); // String "ABCDEF"
        String objectString7 = new String(arrayOfASCIIChars, 2,3); // String "CDE"

        //______________________________________________________________________________________________________________
        // Using of StringBuffer and StringBuilder :
        //
        // String(StringBuffer stringBufferObject);
        //
        // String(StringBuilder stringBuilderObject);
        //
        // String(int arrayOfUnicodeChars[], int initialIndex, int quantityOfChars);
        //
        // length() - method to get the length of String.

        char arrayOfChars4 [] = { 'a', 'b', 'c' };
        String objectString8 = new String(arrayOfChars4);
        System.out.println(objectString8.length());

        // Use of String literals
        //
        String objectString9 = "abc";
        "abc".length();                 // Such operation can be produced for literals.


        // Concantination of Strings
        String objectString10 = "This String is very long" + "very long string" + "very long";

        int objectInt = 9;
        String objectString11 = "He " + "is " + objectInt;
        String objectString12 = "4: " + 2 + 2; // 4: 2 2
        String objectString13 = "4: " + (2+2); // 4: 4

    }
}
