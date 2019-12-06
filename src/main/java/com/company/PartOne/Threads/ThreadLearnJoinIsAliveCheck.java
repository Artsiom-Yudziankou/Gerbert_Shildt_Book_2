package com.company.PartOne.Threads;

import java.awt.*;

public class ThreadLearnJoinIsAliveCheck implements Runnable {

    String threadName;
    Thread threadToCheck;

    ThreadLearnJoinIsAliveCheck(String threadName) {
        this.threadName = threadName;
        threadToCheck = new Thread(this, this.threadName);
        System.out.println("New thread: " + threadToCheck);
        threadToCheck.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " Interrupted.");
        }
        System.out.println(threadName + "finished.");
    }
}

class DemoJoinIsAlive {
    public static void main (String[] args) {
        ThreadLearnJoinIsAliveCheck threadOne = new ThreadLearnJoinIsAliveCheck("First");
        ThreadLearnJoinIsAliveCheck threadTwo = new ThreadLearnJoinIsAliveCheck("Second");
        ThreadLearnJoinIsAliveCheck threadThree = new ThreadLearnJoinIsAliveCheck("Third");

        System.out.println("Thread" + threadOne.threadName + "is going: " + threadOne.threadToCheck.isAlive());
        System.out.println("Thread" + threadTwo.threadName + "is going: " + threadTwo.threadToCheck.isAlive());
        System.out.println("Thread" + threadThree.threadName + "is going: " + threadThree.threadToCheck.isAlive());

        try {
            System.out.println("Waiting for threads.");
            threadOne.threadToCheck.join();
            threadTwo.threadToCheck.join();
            threadThree.threadToCheck.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("Thread" + threadOne.threadName + "is going: " + threadOne.threadToCheck.isAlive());
        System.out.println("Thread" + threadTwo.threadName + "is going: " + threadTwo.threadToCheck.isAlive());
        System.out.println("Thread" + threadThree.threadName + "is going: " + threadThree.threadToCheck.isAlive());
        System.out.println("Main thread is finished.");
    }
}
