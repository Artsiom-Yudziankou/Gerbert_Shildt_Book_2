package com.company.PartTwo.HandlingOfString;

// method 'char charAt(index)' used for getting the char at the Index.
// method 'void getChars(int sourceBegin, int sourceEnd, char arrayWhereToCopy, addressBegin);
// sourceBegin - where to start parse the chars from String.
// sourceEnd - where to end (-1 index) parse the chars from String.
// arrayWhereToCopy - where to copy these chars to.
// addressBegin - where to start to copy in array.

public class StringLearnGetChars {
    public static void main(String[] args){
        String objectString = "This is a Demonstration of method getChars()";
        int sourceBegin = 10;
        int sourceEnd = 14;
        char arrayOfChars [] = new char[sourceEnd - sourceBegin];
        objectString.getChars(sourceBegin, sourceEnd, arrayOfChars, 0);
        System.out.println(arrayOfChars);
    }
}




