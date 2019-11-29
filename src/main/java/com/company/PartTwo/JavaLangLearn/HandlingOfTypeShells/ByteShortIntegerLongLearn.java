package com.company.PartTwo.JavaLangLearn.HandlingOfTypeShells;

//----------------------------------------------------------------------------------------------------------------------
//                                              Byte Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Byte(byte value)
// Byte(String value) throws NumberFormatException
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// MIN_VALUE            - Minimal value.
// MAX_VALUE            - Maximum value.
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types Byte, Short, Long, Integer.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// byte byteValue()                                         - method returns the value as byte.
// static int compare(byte value1, byte value2)             - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Byte byteValue)                            - method compares with the byte value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > doubleValue,
//                                                            <0 - value1 < doubleValue
// static int compareUnsigned(byte value1, byte value2)     - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// static Byte decode(String value)
//                           throws NumberFormatException   - method returns object Byte.
// double doubleValue()                                     - method returns value as double.
// boolean equals(Object byteObject)                        - method checks if values are equal.
// float floatValue()                                       - method returns value as float.
// int hashCode()                                           - method returns hashCode of object.
// int hashCode(byte value)                                 - method returns hashCode of value.
// int intValue()                                           - method returns the value as int.
// long longValue()                                         - method returns the value as long.
// static byte parseByte(String string)
//                             trows NumberFormatException  - method parse the Byte from String (10).
// static byte parseByte(String string, int base)
//                             trows NumberFormatException  - method parse the Byte from String (base).
// short shortValue()                                       - method returns the value as short.
// String toString()                                        - method returns the value as String.
// static String toString(byte value)                       - method returns the value as String(10).
// static int toUnsignedInt(byte value)                     - method returns the value as unsigned int.
// static long toUnsignedLong(byte value)                   - method returns the value as unsigned long.
// static Byte valueOf(byte value)                          - method returns the Byte object.
// static Byte valueOf(String value)
//                            throws NumberFormatException  - method returns the Byte object.
// static Byte valueOf(String value, int base)
//                            throws NumberFormatException  - method returns the Byte object, checking the base.


//----------------------------------------------------------------------------------------------------------------------
//                                              Short Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Short(short value)
// Short(String value) throws NumberFormatException
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// MIN_VALUE            - Minimal value.
// MAX_VALUE            - Maximum value.
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types Byte, Short, Long, Integer.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// byte byteValue()                                         - method returns the value as byte.
// static int compare(short value1, short value2)           - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Short shortValue)                          - method compares with the short value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > doubleValue,
//                                                            <0 - value1 < doubleValue
// static int compareUnsigned(short value1, short value2)   - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// static Short decode(String value)
//                           throws NumberFormatException   - method returns object Short.
// double doubleValue()                                     - method returns value as double.
// boolean equals(Object shortObject)                       - method checks if values are equal.
// float floatValue()                                       - method returns value as float.
// int hashCode()                                           - method returns hashCode of object.
// int hashCode(short value)                                - method returns hashCode of value.
// int intValue()                                           - method returns the value as int.
// long longValue()                                         - method returns the value as long.
// static short parseShort(String string)
//                             trows NumberFormatException  - method parse the Short from String (10).
// static short parseShort(String string, int base)
//                             trows NumberFormatException  - method parse the Short from String (base).
// short shortValue()                                       - method returns the value as short.
// String toString()                                        - method returns the value as String.
// static String toString(short value)                      - method returns the value as String(10).
// static int toUnsignedInt(short value)                    - method returns the value as unsigned int.
// static long toUnsignedLong(short value)                  - method returns the value as unsigned long.
// static Short valueOf(short value)                        - method returns the Short object.
// static Short valueOf(String value)
//                            throws NumberFormatException  - method returns the Short object.
// static Short valueOf(String value, int base)
//                            throws NumberFormatException  - method returns the Short object, checking the base.
// static short reverseBytes(short value)                   - reverse bytes in value.



//----------------------------------------------------------------------------------------------------------------------
//                                              Integer Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Integer(int value)
// Integer(String value) throws NumberFormatException
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// MIN_VALUE            - Minimal value.
// MAX_VALUE            - Maximum value.
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types Byte, Short, Long, Integer.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// static int bitCount(int value)                           - method returns the count of bits in value.
// byte byteValue()                                         - method returns the value as byte.
// static int compare(int value1, int value2)               - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Integer shortValue)                        - method compares with the int value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > doubleValue,
//                                                            <0 - value1 < doubleValue
// static int compareUnsigned(int value1, int value2)       - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// static Integer decode(String value)
//                           throws NumberFormatException   - method returns object Integer.
// double doubleValue()                                     - method returns value as double.
// static int divideUnsigned(int value1, int value2)        - method returns value1 / value2 without checking sign.
// boolean equals(Object integerObject)                     - method checks if values are equal.
// float floatValue()                                       - method returns value as float.
// static Integer getInteger(String propertyName)           - method returns Integer with propertyName, if fail - null.
// static Integer getInteger(String propertyName,
//                                            int default)  - method returns Integer with propertyName, if fail - default.
// int hashCode()                                           - method returns hashCode of object.
// int hashCode(int value)                                  - method returns hashCode of value.
// static int highestOneBit(int value)                      - method returns the position of the highest bit.
// int intValue()                                           - method returns the value as int.
// long longValue()                                         - method returns the value as long.
// static int lowestOneBit(int value)                       - method returns the position of the lowest bit.
// static int max(int value1, int value2)                   - method returns the biggest value of given.
// static int min(int value1, int value2)                   - method returns the smallest value of given.
// static int numberOfLeadingZeros(int value)               - method returns the number of elder bits set to 0.
// static int number of TrailingZeros(int value)            - method returns the number of younger bits set to 0.
// static int parseInt(String string)
//                             trows NumberFormatException  - method parse the int from String (10).
// static int parseInt(String string, int base)
//                             trows NumberFormatException  - method parse the int from String (base).
// static int parseUnsignedInt(CharSequence chars,
//                             int initialIndex,
//                             int endIndex,
//                             int base)
//                            throws NumberFormatException  - method parse the int from String without check sign.
// static int parseUnsignedInt(String string)
//                             trows NumberFormatException  - method parse the int from String (10) without sign.
// static int parseUnsignedInt(String string, int base)
//                             trows NumberFormatException  - method parse the int from String (base) without sign.
// static int remainderUnsigned(int value1, int value2)     - method returns the value1 mod value2.
// static int reverseBytes(int value)                       - reverse bytes in value.
// static int reverse(int value)                            - reverse the bits in value.
// static int rotateLeft(int value, int steps)              - shifts the value to left.
// static int rotateRight(int value, int steps)             - shifts the value to right.
// static int signum(int value)                             - returns: -1 if value is negative,
//                                                                      0 if value is 0,
//                                                                      1 if value is positive.
// static int sum(int value1, int value2)                   - method returns the value1 + value2
// short shortValue()                                       - method returns the value as short.
// String toString()                                        - method returns the value as String.
// static String toString(int value)                        - method returns the value as String(10).
// static String toString(int value, int base)              - method returns the value as String(base).
// static String toBinaryString(int value)                  - method returns the value as String(2).
// static String toHexString(int value)                     - method returns the value as String(16).
// static String toOctalString(int value)                   - method returns the value as String(8).
// static String toUnsignedString(int value)                - method returns the value as unsigned String.
// static String toUnsignedString(int value, base)          - method returns the value as unsigned String(base).
// static long toUnsignedLong(int value)                    - method returns the value as unsigned long.
// static Integer valueOf(int value)                        - method returns the Integer object.
// static Integer valueOf(String value)
//                            throws NumberFormatException  - method returns the Integer object.
// static Integer valueOf(String value, int base)
//                            throws NumberFormatException  - method returns the Integer object, checking the base.



//----------------------------------------------------------------------------------------------------------------------
//                                              Long Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Long(long value)
// Long(String value) throws NumberFormatException
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// MIN_VALUE            - Minimal value.
// MAX_VALUE            - Maximum value.
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types Byte, Short, Long, Integer.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// static int bitCount(long value)                          - method returns the count of bits in value.
// byte byteValue()                                         - method returns the value as byte.
// static int compare(long value1, long value2)             - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Long shortValue)                           - method compares with the int value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > doubleValue,
//                                                            <0 - value1 < doubleValue
// static int compareUnsigned(long value1, long value2)     - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// static Long decode(String value)
//                           throws NumberFormatException   - method returns object Integer.
// double doubleValue()                                     - method returns value as double.
// static long divideUnsigned(long value1, long value2)     - method returns value1 / value2 without checking sign.
// boolean equals(Object longObject)                        - method checks if values are equal.
// float floatValue()                                       - method returns value as float.
// static Long getLong(String propertyName)                 - method returns Long with propertyName, if fail - null.
// static Long getLong(String propertyName,
//                                            Long default) - method returns Long with propertyName, if fail - default.
// int hashCode()                                           - method returns hashCode of object.
// int hashCode(long value)                                 - method returns hashCode of value.
// static int highestOneBit(long value)                     - method returns the position of the highest bit.
// int intValue()                                           - method returns the value as int.
// long longValue()                                         - method returns the value as long.
// static int lowestOneBit(long value)                      - method returns the position of the lowest bit.
// static long max(long value1, long value2)                - method returns the biggest value of given.
// static long min(long value1, long value2)                - method returns the smallest value of given.
// static int numberOfLeadingZeros(long value)              - method returns the number of elder bits set to 0.
// static int number of TrailingZeros(long value)           - method returns the number of younger bits set to 0.
// static long parseLong(String string)
//                             trows NumberFormatException  - method parse the long from String (10).
// static long parseLong(String string, int base)
//                             trows NumberFormatException  - method parse the long from String (base).
// static long parseLong(CharSequence chars,
//                             int initialIndex,
//                             int endIndex,
//                             int base)
//                            throws NumberFormatException  - method parse the long from String.
// static long parseUnsignedLong(CharSequence chars,
//                             int initialIndex,
//                             int endIndex,
//                             int base)
//                            throws NumberFormatException  - method parse the long from String without check sign.
// static long parseUnsignedLong(String string)
//                             trows NumberFormatException  - method parse the long from String (10) without sign.
// static long parseUnsignedLong(String string, int base)
//                             trows NumberFormatException  - method parse the long from String (base) without sign.
// static long remainderUnsigned(int value1, int value2)    - method returns the value1 mod value2.
// static long reverseBytes(long value)                     - reverse bytes in value.
// static long reverse(long value)                          - reverse the bits in value.
// static long rotateLeft(long value, int steps)            - shifts the value to left.
// static long rotateRight(long value, int steps)           - shifts the value to right.
// static int signum(int value)                             - returns: -1 if value is negative,
//                                                                      0 if value is 0,
//                                                                      1 if value is positive.
// static long sum(long value1, long value2)                - method returns the value1 + value2
// short shortValue()                                       - method returns the value as short.
// String toString()                                        - method returns the value as String.
// static String toString(long value)                       - method returns the value as String(10).
// static String toString(long value, int base)             - method returns the value as String(base).
// static String toBinaryString(long value)                 - method returns the value as String(2).
// static String toHexString(long value)                    - method returns the value as String(16).
// static String toOctalString(long value)                  - method returns the value as String(8).
// static String toUnsignedString(long value)               - method returns the value as unsigned String.
// static String toUnsignedString(long value, base)         - method returns the value as unsigned String(base).
// static Long valueOf(long value)                          - method returns the Integer object.
// static Long valueOf(String value)
//                            throws NumberFormatException  - method returns the Integer object.
// static Long valueOf(String value, int base)
//                            throws NumberFormatException  - method returns the Integer object, checking the base.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteShortIntegerLongLearn {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringObject;
        System.out.println("Enter 0 to finish.");
        int i;
        int sum = 0;
        do {
            stringObject = bufferedReader.readLine();
            try {
                i = Integer.parseInt(stringObject);
            } catch (NumberFormatException e) {
                System.out.println("Format error.");
                i = 0;
            }
            sum += i;
            System.out.println("Sum = " + sum);
        } while (i != 0);

        int number = 19648;
        System.out.println("Number in 2-bit system: " + Integer.toBinaryString(number));
        System.out.println("Number in 8-bit system: " + Integer.toOctalString(number));
        System.out.println("Number in 16-bit system: " + Integer.toHexString(number));

    }

}
