package com.company.PartTwo.JavaLangLearn.HandlingOfTypeShells;

//----------------------------------------------------------------------------------------------------------------------
//                                              Float Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Float(double doubleValue)
// Float(float floatValue)
// Float(String stringValue) throws NumberFormatException
//
// NOTE: It is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2. Constants
//-------------------------------------
//
// BYTES                - The length of value float or double in bytes.
// MAX_EXPONENT         - The max exponent (степень).
// MAX_VALUE            - The max positive value.
// MIN_EXPONENT         - The min exponent (степень).
// MIN_NORMAL           - The min positive normal value.
// MIN_VALUE            - The min positive value.
// NAN                  - Not an number.
// POSITIVE_INFINITY    - Positive infinity. (бесконечность)
// NEGATIVE_INFINITY    - Negative infinity. (бесконечность)
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types float and double.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// byte byteValue()                                         - method returns the value as byte.
// static int compare(float floatValue1, float floatValue2) - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Float floatValue)                          - method compares with the float value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > floatValue,
//                                                            <0 - value1 < floatValue
// double doubleValue()                                     - method returns the value as double.
// boolean equals(Object floatObject)                       - method returns if the values are equal.
// static int floatToIntBits(float floatValue)              - method returns the int IEEE standard combination of 2-bit.
// static int floatToRawIntBits(floatValue)                 - method returns the int IEEE standard combination of 2-bit
//                                                            without NAN value.
// float floatValue()                                       - method returns the value as float.
// int hashCode()                                           - method returns the int hash-code value.
// int hashCode(float floatValue)                           - method returns the int hash-code value.
// static float intBitsToFloat(int intValue)                - method returns the float IEEE standard combination of 2-b.
// int intValue()                                           - method returns the value as Int.
// boolean isInfinite()                                     - method returns if the value is infinity.
// static boolean isInfinite(float floatValue)              - method returns if the value is infinity.
// boolean isNAN()                                          - method returns if the value is NAN.
// static boolean isNAN(float floatValue)                   - method returns if the value is NAN.
// long longValue()                                         - method returns the value as long.
// static float max(float value1, float value2)             - method returns the biggest of given numbers.
// static float min(float value1, float value2)             - method returns the smallest of given numbers.
// static float parseFloat(String value)
//                             throws NumberFormatException - method returns the float from string.
// short shortValue()                                       - method returns the value as short.
// static float sum(float value1, float value2)             - method returns the sum of given numbers value1 + value2.
// static String toHexString(float value)                   - method returns HEXString.
// String toString()                                        - method returns as the String value.
// static String toString(float value)                      - method returns as the String value.
// static Float valueOf(float value)                        - method returns the object with Float type.
// static Float valueOf(String value)
//                             throws NumberFormatException - method returns the object with Float type.






//----------------------------------------------------------------------------------------------------------------------
//                                              Double Class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Double(double doubleValue)
// Double(String stringValue) throws NumberFormatException
//
// NOTE: it is not a good practice to use these constructors -> use valueOf() instead of it.
//
//-------------------------------------
// 2. Constants
//-------------------------------------
//
// BYTES                - The length of value float or double in bytes.
// MAX_EXPONENT         - The max exponent (степень).
// MAX_VALUE            - The max positive value.
// MIN_EXPONENT         - The min exponent (степень).
// MIN_NORMAL           - The min positive normal value.
// MIN_VALUE            - The min positive value.
// NAN                  - Not an number.
// POSITIVE_INFINITY    - Positive infinity. (бесконечность)
// NEGATIVE_INFINITY    - Negative infinity. (бесконечность)
// SIZE                 - The size of the bit value in shell.
// TYPE                 - Object with type class for number types float and double.
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// byte byteValue()                                         - method returns the value as byte.
// static int compare(double value1, double value2)         - method compares two numbers and returns the int result of
//                                                            comparing them : 0 - equal,
//                                                                             >0 - value1 > value2 ,
//                                                                             <0 - value1 < value2
// int compareTo(Double doubleValue)                        - method compares with the double value and returns the int
//                                                            result of comparing : 0 - equal,
//                                                            >0 - value1 > doubleValue,
//                                                            <0 - value1 < doubleValue
// double doubleValue()                                     - method returns the value as double.
// boolean equals(Object doubleObject)                      - method returns if the values are equal.
// static int doubleToLongBits(double doubleValue)          - method returns the int IEEE standard combination of 2-bit.
// static int doubleToRawLongBits(doubleValue)              - method returns the int IEEE standard combination of 2-bit
//                                                            without NAN value.
// double doubleValue()                                     - method returns the value as double.
// int hashCode()                                           - method returns the int hash-code value.
// static double longBitsToDouble(long longValue)           - method returns the double IEEE standard combination of 2-b.
// int intValue()                                           - method returns the value as int.
// float floatValue()                                       - method returns the value as float.
// boolean isInfinite()                                     - method returns if the value is infinity.
// static boolean isInfinite(double doubleValue)            - method returns if the value is infinity.
// boolean isNAN()                                          - method returns if the value is NAN.
// static boolean isNAN(double doubleValue)                 - method returns if the value is NAN.
// long longValue()                                         - method returns the value as long.
// static double max(double value1, double value2)          - method returns the biggest of given numbers.
// static double min(double value1, double value2)          - method returns the smallest of given numbers.
// static double parseDouble(String value)
//                             throws NumberFormatException - method returns the float from string.
// short shortValue()                                       - method returns the value as short.
// static double sum(double value1, double value2)          - method returns the sum of given numbers value1 + value2.
// static String toHexString(double value)                  - method returns HEXString.
// String toString()                                        - method returns as the String value.
// static String toString(double value)                     - method returns as the String value.
// static Double valueOf(double value)                      - method returns the object with Float type.
// static Double valueOf(String value)
//                             throws NumberFormatException - method returns the object with Float type.






public class DoubleFloatLearn {
    public static void main(String [] args) {
        Double value1 = Double.valueOf(3.14159);
        Double value2 = Double.valueOf("314159E-5");
        System.out.println(value1 + " = " + value2 + " -> " + value1.equals(value2));

        Double value3 = Double.valueOf(1/0.);
        Double value4 = Double.valueOf(0/0.);

        System.out.println(value3 + " : " + value3.isInfinite() + " , " + value3.isNaN());
        System.out.println(value4 + " : " + value4.isInfinite() + " , " + value4.isNaN());
    }
}
