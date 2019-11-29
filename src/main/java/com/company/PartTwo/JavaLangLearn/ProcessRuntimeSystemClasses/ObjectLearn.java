package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Boolean class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
//
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// Object clone() throws CloneNotSupportedException         - Creates new object as the calling object.
// boolean equals(Object object)                            - Checks if values are equal.
// void finalize() throws Throwable                         - method is default called before removing unused object.
// final Class <?> getClass()                               - Gets object of Class type that describes the object.
// int hashcode()                                           - returns the hashcode.
// final void notify()                                      - terminates the thread executing that waits for calling object.
// final void notifyAll()                                   - terminates the all threads, that wait calling object.
// String toString()                                        - returns the symbol String, that describes an object.
// final void wait() throws InterruptedException            - waits for terminating of another thread.
// final void wait(long milliTime)
//                              throws InterruptedException - waits for terminating of another thread for time in millisecs.
// final void wait(long milliTime, int nanoTime)
//                             throws InterruptedException  - waits for terminating of another thread for tim in milli + nano.
//

public class ObjectLearn implements Cloneable {
    int intValue;
    double doubleValue;

    ObjectLearn checkClone() {
        try {
            return (ObjectLearn) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone rejected.");
            return this;
        }
    }

    public static void main(String [] args) {
        ObjectLearn object1 = new ObjectLearn();
        ObjectLearn object2;
        object1.intValue = 10;
        object1.doubleValue = 20.98;
        object2 = object1.checkClone();
        System.out.println("object1: " + object1.intValue + object1.doubleValue);
        System.out.println("object2: " + object2.intValue + object2.doubleValue);
    }
}
