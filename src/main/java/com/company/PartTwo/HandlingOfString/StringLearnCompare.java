package com.company.PartTwo.HandlingOfString;

// getBytes - method to get the array of bytes instead of chars.
//                                                                  byte [] getBytes()
// It is useful in cases when String values are exported to environments, where 16-bit symbols are not supported.

// toCharArray - method to convert String to array of chars.
//                                                                  char [] toCharArray()


//  equals() - method for comparing the Strings.
//                                                                  boolean equals(Object stringObject )
//                              where
//                                    stringObject - String which must be compare to.
// The comparing produced including the Case (upper, lower).


// equalsIgnoreCase() - method for comparing Strings.
//                                                                  boolean equalsIgnoreCase(Object stringObject)
//                              where
//                                    stringObject - String which must be compare to.
// The comparing produced without checking the Case (upper, lower)


// regionMatches() - method for comparing the parts of String.
//                                                                  boolean regionMatches( int initialIndex,
//                                                                                         String objectString2,
//                                                                                         int initialIndex2,
//                                                                                         int amountOfChars)
//                              where
//                                    initialIndex -  index of symbol from 1st String to start comparing.
//                                    String objectString2 - string that must be compared to.
//                                    initialIndex2 - index of symbol from 2nd String to start comparing.
//                                    amountOfChars - amount of Chars to compare.
//
// overloaded method:
//                                                                  boolean regionMatches( boolean ifIgnoreCase,
//                                                                                         int initialIndex,
//                                                                                         String objectString2,
//                                                                                         int initialIndex2,
//                                                                                         int amountOfChars)


// startsWith() - method for checking if starts with given String
//                                                                  boolean startsWith(String stringObject)
//                              where
//                                    stringObject - string that must be started with.
// overloaded method:
//                                                                  boolean startsWith( String objectString,
//                                                                                      int initialIndex)
//                              where
//                                    stringObject - string that must be started with.
//                                    initialIndex - index of symbol to start to look for.


// endsWith() - method for checking if ends with given String
//                                                                  boolean endsWith(String stringObject)
//                              where
//                                    stringObject - string that must be ended with.


// compareTo() - method for comparing strings.
//                                                                  int compareTo( String objectString)
//                              where
//                                    objectString - string that must be compared to.
//  range of results:
//                                    < 0  - String1 < objectString
//                                    > 0  - String1 > objectString
//                                    = 0  - String1 = objectString
// overloaded method:
//                                                                  int compareToIgnoreCase( String stringObject)
//                              where
//                                    stringObject - string that must be compared to.



public class StringLearnCompare {
    public static void main (String [] args) {
        String stringObject1 = "Hello";
        String stringObject2 = "Hello";
        String stringObject3 = "Bye";
        String stringObject4 = "HELLO";

        System.out.println(stringObject1 + " equals to " + stringObject2 + " -> " + stringObject1.equals(stringObject2));
        System.out.println(stringObject1 + " equals to " + stringObject3 + " -> " + stringObject1.equals(stringObject3));
        System.out.println(stringObject1 + " equals to " + stringObject4 + " -> " + stringObject1.equals(stringObject4));
        System.out.println(stringObject1 + " equals without checking the Case to " + stringObject4 + " -> "
                + stringObject1.equalsIgnoreCase(stringObject4));


        String arrayOfString [] = {
                "Now", "is", "the", "time",
                "for", "all", "good", "men",
                "to", "come", "to", "the",
                "aid", "of", "their", "country"
        };

        for (int i = 0; i < arrayOfString.length ; i++) {
            for (int j = i + 1; j < arrayOfString.length; j++) {
                if ((arrayOfString[j].compareToIgnoreCase(arrayOfString[i])) < 0) {
                    String tempString = arrayOfString[i];
                    arrayOfString[i] = arrayOfString[j];
                    arrayOfString[j] = tempString;
                }
            }
            System.out.println(arrayOfString[i]);
        }
    }
}

