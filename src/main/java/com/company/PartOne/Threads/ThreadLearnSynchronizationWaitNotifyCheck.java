package com.company.PartOne.Threads;

public class ThreadLearnSynchronizationWaitNotifyCheck {
    public static void main(String[] args) {
        Qeue qeueObject = new Qeue();
        new Sender(qeueObject);
        new Getter(qeueObject);
    }
}

class Qeue {
    int amount;
    boolean ifAmountSent = false;

    synchronized int get() {
        while(!ifAmountSent) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
        }
        System.out.println("Got: " + amount);
        ifAmountSent = false;
        notify();
        return  amount;
    }

    synchronized  void put(int amount) {
        while (ifAmountSent) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        this.amount = amount;
        ifAmountSent = true;
        System.out.println("Sent: " + amount);
        notify();
    }
}

class Sender implements Runnable{

    Qeue qeueObject;

    Sender(Qeue qeueObject) {
        this.qeueObject = qeueObject;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            qeueObject.put(i ++);
        }
    }
}

class Getter implements Runnable {

    Qeue qeueObject;

    Getter(Qeue qeueObject) {
        this.qeueObject = qeueObject;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true) {
            qeueObject.get();
        }
    }
}
