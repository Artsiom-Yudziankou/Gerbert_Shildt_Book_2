package com.company.Threads;

public class ThreadLearnSynchronization {
    public static void main (String [] args) {
        Callme target = new Callme();
        Caller callerObjectOne = new Caller(target, "Welcome");
        Caller callerObjectTwo = new Caller(target, "to synchronized");
        Caller callerObjectThree = new Caller(target, "world");

        try {
            callerObjectOne.threadToCheck.join();
            callerObjectTwo.threadToCheck.join();
            callerObjectThree.threadToCheck.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
    }
}


class Callme {
    public synchronized void call(String message) {
        System.out.println("[" + message);
        System.out.println("]");
    }
}


class Caller implements Runnable {

    String message;
    Callme target;
    Thread threadToCheck;


    public Caller(Callme targ, String s) {
        target = targ;
        message = s;
        threadToCheck = new Thread(this);
        threadToCheck.start();
    }

    @Override
    public void run() {
        target.call(message);
    }
}