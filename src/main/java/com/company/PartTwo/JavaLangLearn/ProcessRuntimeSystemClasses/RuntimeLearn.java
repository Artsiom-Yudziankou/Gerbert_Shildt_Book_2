package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Process class
//----------------------------------------------------------------------------------------------------------------------
//
// It is impossible to create Runtime object, but the reference can be produced due to Runtime.getRuntime().
//
//-------------------------------------
// 1. Abstract methods
//-------------------------------------
//
// void addShutdownHook(Thread thread)                      - method register the thread that must be executed when the
//                                                            JVM is stopped.
// Process exec(String nameOfProgram) throws IOException    - method executes the program as separated process.
//                                                            Returns the Process object, describing the new process.
// Process exec(String nameOfProgram, String environment[])
//                                       throws IOException - method executes the program as separated process at the
//                                                            environment, returns the Process object, describing the new
//                                                            process.
// Process exec(String [] args) throws IOException           - method executes the args[] as separated process. Returns
//                                                            Process object, describing the new process.
// Process exec(String [] args, String environment)
//                                      throws IOException  - method executes the args[] as separated process at the envi-
//                                                            ronment. Returns the Process object, describing the new process.
// void exit(int exitCode)                                  - method terminates the executing and returns the code to
//                                                            parent process. 0 - normal termination, else - error.
// long freeMemory()                                        - returns the amount of the bytes of free memory, that is
//                                                            available for Java System.
// void gc()                                                - Initialize the trash collecting.
// static Runtime getRuntime()                              - returns the current Runtime object.
// void halt(int code)                                      - terminates JVM, no threads and methods of termination will
//                                                            be executed. Calling process will get the code.
// void load(String pathToFileOfLibrary)                    - loads the dynamic library file according to path.
// void loadLibrary(String libraryName)                     - loads the dynamic library.
// boolean removeShutdownHook(Thread thread)                - method removes the thread from the list, which are executed
//                                                            when the JVM stopped.
// void runFinalization()                                   - intialize methods finalize() for unuesed, but not returned
//                                                            objects.
// long totalMemory()                                       - returns the amount of bytes of memory available for program.
// static Runtime.Version version()                         - returns Java version.
//


public class RuntimeLearn {

}
