package com.company.Threads;

public class ThreadLearnThreadClassExtension  extends Thread{
    ThreadLearnThreadClassExtension () {
        super("Demonstration thread");
        System.out.println("Child thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Child thread finished");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new ThreadLearnThreadClassExtension();
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted.");
        }
        System.out.println("Main thread finished.");
    }
}
