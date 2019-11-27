package com.company.PartTwo.HandlingOfString;

// indexOf() - method that searches the first appearance of symbol or substring.
//                                                                  int indexOf( char charObject )
//                              where
//                                    charObject - char that will be looked for.
//
// overloaded method:
//                                                                  int indexOf( String objectString )
//                              where
//                                    objectString - substring that will be looked for.
//                                                                  int indexOf ( char charObject, int initialIndex )
//                              where
//                                    charObject - char that will be looked for.
//                                    initialIndex - index that will be search started from.
//                                                                  int indexOf ( String objectString, int initialIndex )
//                              where
//                                    objectString - substring that will be looked for.
//                                    initialIndex - index that will be search started from.
// In case of fail result: -1



// lastIndexOf() - method that searches the last appearance of symbol or substring.
//                                                                  int lastIndexOf( char charObject )
//                              where
//                                    charObject - char that will be looked for.
// overloaded method:
//                                                                  int lastIndexOf( String stringObject )
//                              where
//                                    stringObject - substring that will be looked for.
//                                                                  int lastIndexOf ( char charObject, int initialIndex )
//                              where
//                                    charObject - char that will be looked for.
//                                    initialIndex - index that will be search started from.
//                                                                  int lastIndexOf ( String objectString, int initialIndex )
//                              where
//                                    objectString - substring that will be looked for.
//                                    initialIndex - index that will be search started from.
// In case of fail result: -1



public class StringLearnSearch {
    public static void main(String[] args) {
        String stringObject = "Now is the time for all good men to come to the aid of their country.";
        System.out.println(stringObject);
        System.out.println("indexOf('t') = " + stringObject.indexOf('t'));
        System.out.println("lastIndexOf('t') = " + stringObject.lastIndexOf('t'));
        System.out.println("indexOf(the) = " + stringObject.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + stringObject.lastIndexOf("the"));
        System.out.println("indexOf('t',10) = " + stringObject.indexOf('t', 10));
        System.out.println("lastIndexOf('t', 60) = " + stringObject.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = " + stringObject.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = " + stringObject.lastIndexOf("the", 60));
    }
}