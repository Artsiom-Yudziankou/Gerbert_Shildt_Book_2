package com.company.PartTwo.JavaLangLearn.HandlingOfTypeShells;

//----------------------------------------------------------------------------------------------------------------------
//                                              Character class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Character(char symbol)
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// BYTES                - Length of char in bytes.
// MAX_RADIX            - Maximum base of system.
// MIN_RADIX            - Minimum base of system.
// MAX_VALUE            - Maximum value.
// MIN_VALUE            - Minimum value.
// TYPE                 - Object of Class type for type char.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// char charValue()                                         - method returns the symbol.
// static boolean isDefined(char symbol)                    - method checks if symbol is in Unicode.
// static boolean isDigit (char symbol)                     - method checks if symbol is digit.
// static boolean isIdentifierIgnorable(char symbol)        - method checks if symbol must be Ignored in Identifier.
// static boolean islSOControl (char symbol)                - method checks if symbol accorded to standard ISO.
// static boolean isJavaIdentifierPart(char symbol)         - method checks if symbol must be the part of Java Identifier
// static boolean isJavaIdentifierStart(char symbol)        - method checks if symbol may be first symbol of Java Ident.
// static boolean isLetter(char symbol)                     - method checks if symbol is letter.
// static boolean isLetterOrDigit(char symbol)              - method checks if symbol is letter or digit
// static boolean isLowerCase(char symbol)                  - method checks if symbol is lowerCase.
// static boolean isMirrored(char symbol)                   - method checks if symbol is mirror performed in Unicode.
// static boolean isSpaceChar(char symbol)                  - method checks if symbol is space symbol.
// static boolean isTitleCase(char symbol)                  - method checks if symbol is capital letter.
// static boolean isUnicodeIdentifierStart(char symbol)     - method checks if symbol may be the first symbol of Unicode id.
// static boolean isUnicodeIdentifierPart(char symbol)      - method checks if symbol must be the part of Unicode id.
// static boolean isUpperCase(char symbol)                  - method checks if symbol is upperCase.
// static boolean isWhiteSpace(char symbol)                 - method checks if symbol is space.
// static char toLowerCase(char symbol)                     - method returns the symbol in lowerCase.
// static char toTitleCase(char symbol)                     - method returns the symbol in TitleCase.
// static char toUpperCase(char symbol)                     - method returns the symbol in upperCase.
// static char forDigit(int value, int base)                - method returns the char of digit with int type (base).
// static int digit(char value, int base)                   - method returns the int of digit with char type (base).
// int compareTo(Character charObject)                      - method compares with the char value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                                                 >0 - value1 > charObject,
//                                                                                 <0 - value1 < charObject
//
//-------------------------------------
// 4. Methods for Code Points
//-------------------------------------
//
//
// static boolean isDigit(int codePoint)                    - method checks if codePoint is digit.
// static boolean isLetter(int codePoint)                   - method checks if codePoint is letter.
// static int toLowerCase(int codePoint)                    - method returns codePoints in loweCase.
// static int charCount(int codePoint)                      - method returns: 1 - if codePoint can be performed by 1 char
//                                                                            2 - if codePoint can be performed by 2 chars
// static int codePointAt(CharSequence chars, int position) - method returns the codePoint at the given position.
// static int codePointAt(char chars[], int position)       - method returns the codePoint at the given position.
// static int codePointBefore(CharSequence chars,
//                                            int position) - method returns the codePoint before the given position.
// static int codePointBefore(char chars[], int position)   - method returns the codePoint before the given position.
// static boolean isBmpCodePoint(int codePoint)             - method checks if codePoint is accorded to Bmp(основной многоязыковой плоскости)
// static boolean isHighSurrogate(char symbol)              - method checks if symbol contains high surrogate.
// static boolean isLowSurrogate(char symbol)               - method checks if symbol contains low surrogate.
// static boolean isSupplementaryCodePoint(int codePoint)   - method checks if codePoint is additional codePoint.
// static boolean isSurrogatePair(char highSurrogate,
//                                char lowSurrogate)        - method checks if two surrogates are pair.
// static boolean isValidCodePoint(int codePoint)           - method checks if codePoint is right.
// static char[] toChars(int codePoint)                     - method turns codePoint into char.
// static int toChars(int codePoint, char array[],
//                                           int position)  - method turns codePoint into char and saving the result to
//                                                            array[] at position.
// static int toCodePoint(char highSurrogate,
//                                      char lowSurrogate)  - method turns the highSurrogate and lowSurrogate to codePoint.

public class CharacterLearn {
    public static void main(String [] args) {
        char arrayChar[] = {'a', 'b', '5', '?', 'A', ' '};
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.isDigit(arrayChar[i]))
                System.out.println(arrayChar[i] + " - digit.");
            if (Character.isLetter(arrayChar[i]))
                System.out.println(arrayChar[i] + " - letter.");
            if (Character.isWhitespace(arrayChar[i]))
                System.out.println(arrayChar[i] + " - space.");
            if (Character.isUpperCase(arrayChar[i]))
                System.out.println(arrayChar[i] + " - uppercase.");
            if (Character.isLowerCase(arrayChar[i]))
                System.out.println(arrayChar[i] + " - lowercase.");
        }
        System.out.println(Character.getDirectionality('b'));
        System.out.println(Character.isTitleCase('B'));
        System.out.println(Character.isUpperCase('B'));
    }
}
