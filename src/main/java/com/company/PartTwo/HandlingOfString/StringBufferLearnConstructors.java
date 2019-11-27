package com.company.PartTwo.HandlingOfString;

// Available constructors:
//
//  StringBuffer()                     - reserve space for 16 symbols without the reallocation of memory.
//
//  StringBuffer(int size)             - 'size' will set the size of buffer.
//
//  StringBuffer(String stringObject)  - set the initial value of object and reserve the space for 16 symbols
//                                       without the reallocation of memory.
//
//  StringBuffer(CharSequence symbols) - creates the object with sequence of chars, reserving the space for 16
//                                       additional symbols.


// length() - method for StringBuffers to check the length of buffer.
//
// capacity() - method for StringBuffers to check the amount of the allocation of memory.
//
// ensureCapacity() - method for StringBuffers to allocate the memory in advamce.
//                                                                  void ensureCapacity(int minimalCapacity)
//                              where
//                                    minimalCapacity - minimal size of buffer.
//
// setLength() - method sets the length of StringBuffer.
//                                                                  void setLength(int lengthToSet)
//
// charAt() - method as in String to get the char at Index.
//                                                                  char charAt(int index)
//
// setCharAt() - method to set the char at index.
//                                                                  void setCharAt(int index, char symbol)
//
// getChars() - method as in String to get the substring.
//                                                                  void getChars(int initialIndex,
//                                                                                int endIndex,
//                                                                                char charArray,
//                                                                                int startAddress)
//                              where
//                                    initialIndex - index indicates where to start to get chars
//                                    endIndex     - index indicates where to end to get chars
//                                    charArray    - array, where to copy the chars
//                                    startAddress - position in new array, where to start copying the chars
//
// append() - method connects the String type of any type of data to StringBuffer.
//            method uses the static method String.valueOf()
//                                                                  StringBuffer append(String stringObject)
//                                                                  StringBuffer append(int intValue)
//                                                                  StringBuffer append(Object object)
//
// insert() - method pastes the Object to another String.
//                                                                  StringBuffer insert(int index, String stringObject)
//                                                                  StringBuffer insert(int index, char symbol)
//                                                                  StringBuffer insert(int index, Object object)
//
// reverse() - method returns the StringBuffer in opposite flow.
//
// delete() - method removes the substring.
//                                                                  StringBuffer delete(int initialIndex, int endIndex)
//                              where
//                                    initialIndex - index of the start of removing.
//                                    endIndex - index of the end of removing - 1.
//
// deleteCharAt() - method removes the char at Index.
//                                                                  StringBuffer deleteCharAt(int charIndex)
//                              where
//                                    charIndex - index of char to be removed.
//
// replace() - method returns the String with replacing the substring with another one.
//                                                                  StringBuffer replace(int initialIndex, int endIndex,
//                                                                                       String stringObject)
//                              where
//                                    initialIndex - index of the start of replacing of source string.
//                                    endIndex - index of the end of replacing of source string - 1.
//                                    stringObject - string that must be used as the replacement.
//
// substring() - method returns the substring from String.
//                                                                  String substring(int initialIndex)
//                                                                  String substring(int initialIndex, int endIndex)
//                              where
//                                    initialIndex - index of the start of getting the substring
//                                    endIndex - index of the end of getting the substring - 1.
//
// appendCodePoint() - method connects the code point to the end of String.
//                                                                  StringBuffer appendCodePoint(int symbol)
//
// codePointAt() - method returns the code point at the Index.
//                                                                  int codePointAt(int symbolIndex)
//
// codePointBefore() - method returns the code point at the Index - 1.
//                                                                  int codePointBefore(int symbolIndex)
//
// codePointCount() - method returns the amount of code points in substring.
//                                                                  int codePointCount(int initialIndex, int endIndex)
//
// indexOf() - method looks for the first usage of substring and returns the index.
//                                                                  int indexOf(String stringObject)
//                                                                  int indexOf(String stringObject, int initialIndex)
//
// lastIndexOf() - method looks for the last usage of substring and returns the index.
//                                                                  int lastIndexOf(String stringObject)
//                                                                  int lastIndexOf(String stringObject, int initialIndex)
//
// offsetByCodePoints() - method returns index of the symbol that is situated at offset.
//                                                                  int offsetByCodePoints(int initial index,
//                                                                                         int amountOfSteps)
//
// subSequence() - method returns the substring from string.
//                                                                  CharSequence subSequence(int initialIndex,
//                                                                                           int endIndex)
//
// trimToSize() - method squeezes the size of buffer to the content.
//                                                                  void trimToSize()
//





public class StringBufferLearnConstructors {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Buffer = " + stringBuffer);
        System.out.println("Length = " + stringBuffer.length());
        System.out.println("Capacity = " + stringBuffer.capacity());

        System.out.println("Buffer before modification = " + stringBuffer);
        System.out.println("Before using the setCharAt(1, 'i') = " + stringBuffer.charAt(1));
        stringBuffer.setCharAt(1, 'i');
        stringBuffer.setLength(2);
        System.out.println("Buffer after modification = " + stringBuffer);
    }
}
