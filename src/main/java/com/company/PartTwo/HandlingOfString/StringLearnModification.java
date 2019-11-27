package com.company.PartTwo.HandlingOfString;

// substring() - method for taking the substring from String.
//                                                                  String substring(int initialIndex)
//                              where
//                                    initialIndex - Index that the substring starts to be taken from.
// overloaded method:
//                                                                  String substring(int initialIndex, int endIndex)
//                              where
//                                    initialIndex - Index that the substring starts to be taken from.
//                                    endIndex - Index that the substring ends to be taken from.
// In case the result failed : -1


// concat() - method for connect the substrings.
//                                                                  String concat( String objectString)
//                              where
//                                    objectString - String that must be connected to.


// replace() - method for replacing char or char sequence.
//                                                                  String replace(char sourceChar, char replaceChar)
//                              where
//                                    sourceChar - char that must be replaced.
//                                    replaceChar - char that must be replaced to.
// overloaded method:
//                                                                  String replace(CharSequence sourceCharSequence,
//                                                                                 CharSequence replaceCharSequence)
//                              where
//                                    sourceCharSequence - char sequence that must be replaced.
//                                    replaceCharSequence - char sequence that must be replaced to.


// trim() - method for removing the beginning and ending spaces.
//                                                                  String trim()
//


// valueOf() - method for turning the Type into String.
//                                                                  static String valueOf(double objectDouble)
//                                                                  static String valueOf(long objectLong)
//                                                                  static String valueOf(Object object)
//                                                                  static String valueOf(char objectChar)
// overloaded method:
//                                                                  static String valueOf(char charArray[],
//                                                                                        int initialIndex,
//                                                                                        int charsAmount)
//                              where
//                                    charArray [] - array of chars that must be converted to String.
//                                    initialIndex - index of char in array to start.
//                                    charsAmount  - the length of substring to convert.


// toLowerCase() - method to turning the substring into lower case.
// toUpperCase() - method to turning the substring into upper case.
//                                                                  String toLowerCase()
//                                                                  String toUpperCase()


// join() - method for connecting the Strings with separator.
//                                                                  static String join(CharSequence objectSeparator,
//                                                                                     CharSequence ... objectString)
//                              where
//                                    objectSeparator - separator that will be used.
//                                    objectString - ... strings, that must be connected.


// codePointAt() - method returns code point in Unicode to the position.
//                                                                  int codePointAt(int position)
//                              where
//                                    position - position where to return the code point.


// codePointBefore() - method returns code point in Unicode to the position before given.
//                                                                  int codePointBefore(int position)
//                              where
//                                    position - position where before to return te code point


// codePointCount() - method returns amount of code points in a part of symbol string from start to end positions.
//                                                                  int codePointCount(int startPosition, int endPosition)
//                              where
//                                    startPosition - position where to start to count.
//                                    endPosition - position where to end to count.


// contains() - method returns if object contains the stringObject.
//                                                                  boolean contains (CharSequence stringObject)
//                              where
//                                    stringObject - string to check if exists.


// contentEquals() - method returns if object contains the stringObject.
//                                                                  boolean contentEquals(CharSequence stringObject)
//                              where
//                                    stringObject - string to check if exists.
// overloaded method:
//
//                                                                  boolean contentEquals(StringBuffer stringObject)
//                              where
//                                    stringIbject - string buffer to check if exists.


// format() - method for formating the String.
//                                                                  static String format(String formatRule,
//                                                                                       Object ... arguments)
// overloaded method:
//                                                                  static String format(Locale region,
//                                                                                       String formatRule,
//                                                                                       Object ... arguments)


// isEmpty() - method checks if String is empty.
//                                                                  boolean isEmpty()

// matches() - method checks if String is accorded to regular expression.
//                                                                  boolean matches(String regularExpression)


// offsetByCodePoints - method returns index of the position where the Unicode symbol is.
//                                                                  int offsetByCodePoints (int initialIndex,
//                                                                                           int amountOfSteps)
//                              where
//                                    initialIndex - initial index where to start.
//                                    amountOfSteps - amount of steps to do.


// replaceFirst() - method returns string, where the first substring according to regular expression is replaced with
//                  new one.
//                                                                  String replaceFirst(String regularExpression,
//                                                                                      String stringObject)
//                              where
//                                    regularExpression - expression for which type of string the search produced.
//                                    stringObject - string, with which the searched sting must be replaced.

// replaceAll() - method returns string, where the all substrings according to regular expression are replaced with new
//                one.
//                                                                  String replaceAll(String regularExpression,
//                                                                                    String stringObject)
//                              where
//                                    regularExpression - expression for which type of string the search produced.
//                                    stringObject - string, with which the searched sting must be replaced.

// split() - method that returns the array of strings with separator performed as regular expression.
//                                                                  String [] split(String regularExpression)
//                              where
//                                    regularExpression - expression that indicates the separator (how to split)
// overloaded method:
//                                                                  String [] split(String regularExpression,
//                                                                                  int maximumParts)
//                              where
//                                    regularExpression - expression that indicates the separator (how to split)
//                                    maximumParts - maximum parts to split the string.

// subSequence() - method returns the substring from the started position till the end position.
//                 Method used for interface CharSequence.
//                                                                  CharSequence subSequence(int initialIndex,
//                                                                                           int endIndex)
//                              where
//                                    initialIndex - index where to start.
//                                    endIndex     - index where to end.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLearnModification {
    public static void main(String [] args) throws IOException {
        String stringObject = "This is a test. This is, too.";
        String stringToSearch = "is";
        String stringToPaste = "was";
        String stringResult = " ";
        int indexValue;
        do {
            System.out.println(stringObject);
            indexValue = stringObject.indexOf(stringToSearch);
            if (indexValue != -1) {
                stringResult = stringObject.substring(0, indexValue);
                stringResult += stringToPaste;
                stringResult += stringObject.substring(indexValue + stringToSearch.length());
                stringObject = stringResult;
            }
        } while (indexValue != -1);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringObjectForTrim;
        System.out.println("Enter stop to finish");
        System.out.println("Enter the Name of State:");
        do {
            stringObjectForTrim = bufferedReader.readLine();
            stringObjectForTrim = stringObjectForTrim.trim();
            if (stringObjectForTrim.equals("Illinois"))
                System.out.println("The capital is - SpringField");
            if (stringObjectForTrim.equals("Missure"))
                System.out.println("The capital is - Jefferson-City");
            if (stringObjectForTrim.equals("California"))
                System.out.println("The capital is - Sacramento");
            if (stringObjectForTrim.equals("Washington"))
                System.out.println("The capital is - Olympia");
        } while (!stringObjectForTrim.equals("stop"));

        String stringJoinResult = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(stringJoinResult);
        stringJoinResult = String.join(", ", "John", "ID#: 569", "e-mail: John@HerbShildt.com");
        System.out.println(stringJoinResult);
    }
}
