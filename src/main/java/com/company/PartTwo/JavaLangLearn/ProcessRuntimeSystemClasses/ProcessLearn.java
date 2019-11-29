package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Process class
//----------------------------------------------------------------------------------------------------------------------
//
//-------------------------------------
// 1. Abstract methods
//-------------------------------------
//
// Stream<ProcessHandle> children()                         - method returns the thread of data, that contains ProcessHandle
//                                                            objects, которые представляют прямых потомков вызывающего процесса.
// Stream<ProcessHandle> descendants()                      - method returns the thread of data, that contains ProcessHandle
//                                                            objects, которые представляют прямых потомков вызывающего процесса
//                                                            а также их собственных потомков.
// void destroy()                                           - method kills the process.
// Process destroyForcibly()                                - method kills process forcibly, returns the reference to process.
// int extValue()                                           - method returns code of the finishing of process.
// InputStream getInputStream()                             - method returns the input stream for reading the data from
//                                                            outputstream of calling object.
// OutputStream getOutputStream()                           - method returns the output stream for writing the data from
//                                                            inputstream of calling object.
// ProcessHandle.Info info()                                - method returns the info about process in ProcessHandle.Info
// boolean isAlive                                          - method checks if process is active.
// CompletableFuture <Process> onExit()                     - method returns object CompletableFuture for calling process
//                                                            to use for executing tasks for finishing this process.
// long pid()                                               - method returns id of calling process.
// boolean supportsNormalTermination()                      - method checks if destroy() is normal or forcible termination
//                                                            of process.
// ProcessHandle toHandle()                                 - method returns descriptor of calling process as ProcessHandle
//                                                            object.
// Int waitFor() throws InterruptException                  - method returns the code of process termination. Does not
//                                                            return the control before the process will be terminated.
// boolean watFor(long timeToWait, TimeUnit timeUnit)
//                              throws InterruptedException - method waits the process termination. The duration of waiting
//                                                            is timeToWait. Returns if the process was terminated.


public class ProcessLearn {

}
