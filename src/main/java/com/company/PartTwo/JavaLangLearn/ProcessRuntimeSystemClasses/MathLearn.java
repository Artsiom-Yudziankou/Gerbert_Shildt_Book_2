package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Character class
//----------------------------------------------------------------------------------------------------------------------
// 3. Methods
//-------------------------------------
//
// static double sin(double argument)                       - returns the sinus. Argument is performed in radians.
// static double cos(double argument)                       - returns the cosinus. Argument is performed in radians.
// static double tan(double argument)                       - returns the tangens. Argument is performed in radians.
//
// static double asin(double argument)                      - returns the corner.
// static double acos(double argument)                      - returns the corner.
// static double atan(double argument)                      - returns the corner.
// static double atan2(double sin, double cos)              - returns the corner. (sin/cos)
//
// static double sinh(double argument)                      - returns hyperbolic sinus. Argument in radians.
// static double cosh(double argument)                      - returns hyperbolic cosinus. Argument in radians.
// static double tanh(double argument)                      - returns hyperbolic sinus. Argument in radians.
//
// static double cbrt(double argument)                      - returns cube root of argument.
// static double exp(double argument)                       - returns exponent of argument. (e^argument)
// static double expm1(double argument)                     - returns exponent of argument - 1. (e^argument - 1)
// static double log(double argument)                       - returns natural logaryphm.
// static double log10(double argument)                     - returns logaryphm based 10.
// static double log1p(double argument)                     - returns natural logaryphm + 1.
// static double pow(double argument, double exponent)      - returns argument^exponent.
// static double scalb(double argument, int exponent)       - returns argument * 2^exponent.
// static float scalb(float argument, int exponnet)         - returns argument * 2^exponent.
// static double sqrt(double argument)                      - returns square root of argument.
//
// static int abs(int argument)                             - returns absolute value of argument.
// static long abs(long argument)                           - returns absolute value of argument.
// static float abs(float argument)                         - returns absolute value of argument.
// static double abs(double argument)                       - returns absolute value of argument.
// static double ceil(double argument)                      - returns the smallest number that >= argument.
// static double floor(double argument)                     - returns the biggest number that <= argument.
// static int floorDiv(int x, int y)                        - returns the x/y.
// static long floorDiv(long x, long y)                     - returns the x/y.
// static long floorDiv(long x, int y)                      - returns the x/y.
// static int floorMod(int x, int y)                        - returns the x mod y.
// static int floorMod(long x, long y)                      - returns the x mod y.
// static int floorMod(long x, int y)                       - returns the x mod y.
// static long floorMod(long x, int y)                      - returns the x mod y.
// static int max(int x, int y)                             - returns the biggest value.
// static long max(long x, long y)                          - returns the biggest value.
// static float max(float x, float y)                       - returns the biggest value.
// static double max(double x, double y)                    - returns the biggest value.
// static int min(int x, int y)                             - returns the smallest value.
// static long min(int x, int y)                            - returns the smallest value.
// static float min (float x, float y)                      - returns the smallest value.
// static double min (double x, double y)                   - returns the smallest value.
// static double nextAfter(double arg, double direction)    - returns next value in direction, if arg == direction, returns
//                                                            direction.
// static float nextAfter(float arg, double direction)      - returns next value in direction, if arg == direction, returns
//                                                            direction.
// static double nextDown(double value)                     - returns nex value that less than given.
// static float nextDown(float value)                       - returns nex value that less than given.
// static double nextUp(double arg)                         - returns next value in a positive direction.
// static float nextUp(float arg)                           - returns next value in a positive direction.
// static double rint(double arg)                           - returns the closest value.
// static int round(float arg)                              - returns rounded value.
// static long round(double arg)                            - returns rounded value.
// static float ulp(float arg)                              - returns amount of 1 in a last sign.
// static double(double arg)                                - returns amount of 1 in a last sign.
//
// methods that contains Exact in name - throws exception ArithmeticException.
// static int addExact(int arg, int arg2)                   - returns arg + arg2.
// static long addExact(long arg, int arg2)                 - returns arg + arg2.
// static double copySign(double arg, double sign)          - returns arg with sign.
// static float copySign(flaot arg, float sign)             - returns arg with sign.
// static int decrementExact(int arg)                       - returns arg - 1.
// static long decrementExact(long arg)                     - returns arg - 1.
// static double fma(double arg, double arg2, double arg3)  - returns arg3 + (arg * arg2).
// static float fma(float arg, float arg2, float arg3)      - returns arg3 + (arg * arg2).
// static int getExponent(double arg)                       - returns exponent of 2.
// static int getExponent(float arg)                        - returns exponent of 2.
// static hypot(double a, double b)                         - returns hypotenuza.
// static double IEEEremainder(double x, y)                 - returns x mod y.
// static int incrementExact(int arg)                       - returns arg + 1.
// static long incrementExact(long arg)                     - returns arg + 1.
// static int multiplyExact(int x, int y)                   - returns x*y.
// static long multiplyExact(long x, long y)                - returns x*y.
// static long multiplyExact(long x, int y)                 - returns x*y.
// static long multiplyFull(int x, int y)                   - returns x*y.
// static long multiplyHigh(long x, long y)                 - returns elder bytes of multiplication.
// static int negateExact(int arg)                          - returns - arg.
// static long negateExact(long arg)                        - returns - arg.
// static double random()                                   - returns random 0-1.
// static float signum(double arg)                          - determines the sign of value.
// static float signum(float arg)                           - determines the sign of value.
// static int subtractExact(int arg, int arg2)              - returns arg - arg2.
// static long subtractExact(int arg, long arg2)            - returns arg - arg2.
// static double toDegree(double corner)                    - radians to degrees.
// static int toIntExact(long arg)                          - convert to Int.
// static double toRadians(double corner)                   - convert to radians.
//
//




public class MathLearn {
    public static void main(String [] args) {
        double firstCorner = 120.0;
        System.out.println(firstCorner + " degrees = " + Math.toRadians(firstCorner) + " radians");
        firstCorner = 1.312;
        System.out.println(firstCorner + " radians = " + Math.toDegrees(firstCorner) + " degrees");
    }
}

