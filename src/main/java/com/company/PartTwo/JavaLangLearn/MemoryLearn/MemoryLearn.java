package com.company.PartTwo.JavaLangLearn.MemoryLearn;

public class MemoryLearn {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        long memoryStat1, memoryStat2;
        Integer arrayInt [] = new Integer[1000];
        System.out.println("Total Memory " + runtime.totalMemory());

        memoryStat1 = runtime.freeMemory();
        System.out.println("Source Ffee memory: " + memoryStat1);

        runtime.gc();
        memoryStat1 = runtime.freeMemory();
        System.out.println("After cleaning the trash: " + memoryStat1);

        for (int i = 0; i < 1000; i++) {
            arrayInt[i] = new Integer(i);
        }
        memoryStat2 = runtime.freeMemory();
        System.out.println("Free memory after allocation: " + memoryStat2);
        System.out.println("Memory used for allocation: " + (memoryStat1 - memoryStat2));

        for (int i = 0; i < 1000; i++) {
            arrayInt[i] = null;
        }
        runtime.gc();
        memoryStat2 = runtime.freeMemory();
        System.out.println("Free memory after cleaning unused objects in array: " + memoryStat2);
    }
}
