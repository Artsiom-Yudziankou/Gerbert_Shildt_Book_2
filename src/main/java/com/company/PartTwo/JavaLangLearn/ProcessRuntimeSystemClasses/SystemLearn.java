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
// static void arraycopy(Object source, int sourceBegin,
//              Object address, int addressBegin, int size) - copies the array.
// static String clearProperty(String envVar)               - removes the environment variable. Returns the previous value
//                                                            of it.
// static Console console()                                 - Returns console.
// static long currentTimeMillis()                          - Returns current time in milliseconds from 1st January 1970
// static void exit(int exitCode)                           - Terminates executing and returns the exitCode to parent
//                                                            process.
// static void gc()                                         - initialize the trash collecting.
// static Map<String, String> getEnv()                      - returns Map <envVar, envValue>
// static String getEnv(String envVar)                      - returns value of envVar.
// static System.Logger getLogger(String logName)           - returns reference of object for logging.
// static System.Logger getLogger(String logName,
//                                      ResourceBundle rb)  - returns the reference to object for logging. rb - localization.
// static Properties getProperties()                        - returns properties, connected with Java system.
// static String getProperty(String envVar)                 - returns property connected with envVar. null in case of fail.
// static String getProperty(String envVar, String default) - returns property connected with envVar. default in case of fail.
// static SecurityManager getSecurityManager()              - returns the security manager. null in case of fail.
// static int identityHashCode(Object object)               - returns hashCode.
// static Channel inheritedChannel() throws IOException     - returns channel inherited by JVM. null in case channel not inherited.
// static String lineSeparator()                            - returns String with separators.
// static void load(String libFileName)                     - loads the dynamic library with the given filepath.
// static void loadLibrary(String libName)                  - loads the dynamic library with the given path.
// static void mapLibraryName(String library)               - returns all dependencies of given library.
// static long nanoTime()                                   - Gets the timer in nano-seconds
// static void runFinalization()                            - initialize methods finalize for unused objects.
// static void setErr(PrintStream errorStream)              - sets the given errorStream as standard errorStream.
// static void setIn(InputStream stream)                    - sets the given stream as standard InputStream.
// static void setOut(PrintStream outputStream)             - sets the given stream as standard OutputStream.
// static void setProperties(Properties systemProp)         - sets the current system property.
// static String setProperty(String envVar, String envValue)- sets the envVar to following envValue.
// static void setSecurityManager(SecurityManager secMan)   - sets given security manager.


public class SystemLearn {
    static void checkCurrentMilliSec () {
        long start, end;
        System.out.println("Check the time of getting 0 - 100000000");
        start = System.currentTimeMillis();
        for (int i = 0; i <100000000L ; i++) {
        }
        end = System.currentTimeMillis();
        System.out.println("Time of executing: " + (end - start));
    }

    static void checkArrayCopy() {
        byte array1 [] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
        byte array2 [] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

        System.out.println("array1 = " + new String(array1));
        System.out.println("array2 = " + new String(array2));
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("array1 = " + new String(array1));
        System.out.println("array2 = " + new String(array2));
        System.arraycopy(array1, 0, array1, 1, array1.length - 1);
        System.arraycopy(array2, 1, array2, 0, array2.length -1);
    }

    static void checkProperties() {
        System.out.println("User path: " + System.getProperty("user.dir"));
        System.out.println("Home path: " + System.getProperty("user.home"));
    }

    public static void main(String [] args) {
        checkCurrentMilliSec();
        checkArrayCopy();
        checkProperties();
    }
}
