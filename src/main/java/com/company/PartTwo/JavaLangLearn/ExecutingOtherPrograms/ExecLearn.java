package com.company.PartTwo.JavaLangLearn.ExecutingOtherPrograms;

public class ExecLearn {
    public static void main(String [] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec("Notepad");
            process.waitFor();
        } catch (Exception e) {
            System.out.println("Error.");
        }
        System.out.println("Exit value: " + process.exitValue());
    }
}
