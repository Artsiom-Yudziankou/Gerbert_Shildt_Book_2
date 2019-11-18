package com.company.Threads;

public class ThreadLearnRunnableInterfaceUse implements Runnable {
    Thread threadForCheck;

    ThreadLearnRunnableInterfaceUse() {
        threadForCheck = new Thread(this, "Demonstration Thread");
        System.out.println("Child thread created: " + threadForCheck);
        threadForCheck.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread was Interrupted.");
        }
        System.out.println("Child thread was finished.");
    }
}


class ThreadDemo {
    public static void main (String[] args) {
        new ThreadLearnRunnableInterfaceUse();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted.");
        }
        System.out.println("Main thread finished.");
    }
}
