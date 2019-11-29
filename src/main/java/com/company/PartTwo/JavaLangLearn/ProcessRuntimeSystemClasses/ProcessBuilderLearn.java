package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Boolean class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// ProcessBuilder(List <String> arguments)
// ProcessBuilder(String... arguments)
//
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// List<String> command()                                   - Returns the reference to List which contains the name of pro-
//                                                            gram and it's arguments.
// ProcessBuilder command(List<String> arguments)           - Set the name of program and it's arguments. Returns the
//                                                            reference to calling object. Changes are related to calling
//                                                            object.
// ProcessBuilder command(String ... arguments)             - Set the name of program and it's arguments. Returns the re-
//                                                            ference to calling object.
// File directory()                                         - Returns the current work folder for calling object.
//                                                            null - in case the work folder = folder of java program.
// ProcessBuilder directory(File path)                      - Sets the current for calling object. Returns the reference
//                                                            to calling object.
// Map<String, String> environment                          - Returns the environment variables, connected with object.
// ProcessBuilder inheritIO()                               - Force the process to use the same source and address for
//                                                            standard IO streams as calling process.
// ProcessBuilder.Redirect redirectError()                  - Returns the address for standard error stream as object
//                                                            ProcessBuilder.Redirect
// ProcessBuilder redirectError(File f)                     - Sets the address for error stream to given File. Returns
//                                                            reference to calling object.
// ProcessBuilder redirectError(
//                      ProcessBuilder.Redirect address)    - Sets the address for error stream. Returns reference to ca-
//                                                            lling address.
// boolean redirectErrorStream()                            - checks if the error stream uses the same address like standard
//                                                            stream of data.
// ProcessBuilder redirectErrorStream(boolean merge)        - direct the error stream: merge = true - direction is the same
//                                                            as standard stream has.
//                                                                                     merge = false - different directions.
// ProcessBuilder.Redirect redirectInput()                  - Returns the source for standard input stream.
// ProcessBuilder redirectInput(File f)                     - Sets the source for standard input stream to given File.
// ProcessBuilder redirectInput(
//                        ProcessBuilder.Redirect source)   - sets the source for standard input stream.
// ProcessBuilder.Redirect redirectOutput()                 - Returns the source for standard output stream.
// ProcessBuilder redirectOutput(File f)                    - Sets the source for standard output stream to given File.
// ProcessBuilder redirectOutput(
//                        ProcessBuilder.Redirect source)   - sets the source for standard output stream.
// Process start() throws IOException                       - launches the process.
// static List<Process> startPipeline(
//           List<ProcessBuilder pbList) throws IOException - directs the processes to List pbList.
// static ProcessBuilder.Redirect to(File f)
// static ProcessBuilder.Redirect from(File f)
// static ProcessBuilder.Redirect appendTo(File f)
// File file()


public class ProcessBuilderLearn {
    public static void  main(String [] args) {
        try {
            ProcessBuilder process = new ProcessBuilder("notepad.exe", "testfile");
            process.start();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
