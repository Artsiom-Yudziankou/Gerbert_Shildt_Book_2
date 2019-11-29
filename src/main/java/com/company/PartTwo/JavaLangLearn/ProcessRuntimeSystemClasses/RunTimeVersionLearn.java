package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

// Runtime.version() - method to get the data about version of environment.
// Data consists of 3 parts :
//                              major version number,
//                              minor version number,
//                              security version number
//
// The data can be got with these methods:
// int major()
// int minor()
// int security()
//
// Additional methods for handling version data:
// build() - number of building.
// pre() - pre-release data.
//
//
// Other methods that can be used:
// compareTo()
// compareToIgnoreOptional()
// equals()
// equalsIgnoreOptional()


public class RunTimeVersionLearn {
    public static void main(String [] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Major version number: " + version.major());
        System.out.println("Minor version number: " + version.minor());
        System.out.println("Security version number: " + version.security());

        String str = Runtime.Version.parse(version.toString()).toString();
        System.out.println(str);
    }
}
