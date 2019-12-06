package com.company.PartTwo.JavaOtherServiceClasses;

import java.util.StringTokenizer;

public class StringTokenizerLearn {
    static String stringToCheck = "Title = Java. Full Guide.; Author = Shildt; Publisher= Oracle Press; Copyright = 2018";

    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer(stringToCheck, ";=");
        while(stringTokenizer.hasMoreElements()) {
            String key = stringTokenizer.nextToken();
            String val = stringTokenizer.nextToken();
            System.out.println(key + " " + val);
        }
    }

}
