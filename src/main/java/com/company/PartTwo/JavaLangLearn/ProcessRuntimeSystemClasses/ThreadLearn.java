package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Thread class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// Thread()
// Thread(Runnable object)
// Thread(Runnable object, String threadName)
// Thread(String threadName)
// Thread(ThreadGroup threadGroup, Runnable object)
// Thread(ThreadGroup threadGroup, Runnable object, String threadName)
// Thread(ThreadGroup threadGroup, String threadName)
//
//
//-------------------------------------
// 2.  Constants
//-------------------------------------
//
// MAX_PRIORITY
// MIN_PRIORITY
// NORM_PRIORITY
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// static int activeCount()                                 - returns counts the amount of active threads in a group.
// void checkAccess()                                       - forces the security manager to check if thread has access.
// static Thread currentThread()                            - returns thread.
// static void dumpStack()                                  - prints the stack of calling the thread.
// static int enumerate(Thread threads[])                   - enumerates the threads to array.
// static Map<Thread, StackTraceElement[]> getAllStackTraces- returns traces for thread.
// ClassLoader getContextClassLoader()                      - returns the ClassLoader for thread.
// static Thread.UncaughtExceptionHandler
//                     getDefaultUncaughtExceptionHandler() - returns the handler of uncaught exceptions.
// long getID()                                             - returns the ID of thread.
// final String getName()                                   - returns the name of thread.
// final int getPriority()                                  - returns the priority of Thread.
// StackTraceElement[] getStackTrace()                      - returns array with stack trace.
// Thread.State getState()                                  - returns the state of Thread.
// final ThreadGroup getThreadGroup()                       - returns ThreadGroup of thread.
// static boolean holdsLock(Object thread)                  - checks if thread is blocked.
// void interrupt()                                         - interrupts the thread.
// static boolean interrupted()                             - checks if thread is interrupted.
// final Boolean isAlive()                                  - checks if thread is alive.
// final Boolean isDaemon()                                 - checks if thread is system thread of Java.
// boolean isInterrupted()                                  - checks if thread is interrupted.
// final void join() throws InterruptedException            - waits for terminating of thread.
// final void join(long millisecs)                          - waits time for terminating of thread.
// final void join(long millisecs, int nanosecs)            - waits time for terminating of thread.
// static void onSpinWait()                                 - marks the executing of thread in a circle of waiting giving
//                                                            access optimization during the executing.
// void run()                                               - starts the executing of thread.
// void setContextClassLoader(ClassLoader arg)              - sets the arg as the class loader.
// final void setDaemon(boolean state)                      - marks the thread as daemon.
// static void setDefaultUncaughtExceptionHandler
//                      (Thread.UncaughtExceptionHandler e) - sets e as default handler of uncaught exceptions.
// final void setName(String threadName)                    - sets threadName.
// final void setPriority(int priority)                     - sets priority for thread.
// void setUncaughtExceptionHandler
//                      (Thread.UncaughtExceptionHandler e) - sets e as handler of uncaught exceptions for calling thread.
// static void sleep(long millisecs)
//                              throws InterruptedException - interrupts the thread for time.
// static void sleep(long millisecs, int nanosecs)
//                              throws InterruptedException - interrupts the thread for time.
// void start()                                             - starts the thread.
// String toString()                                        - returns String of thread.
// static void yield()                                      - give the resource of CP to another thread.


//----------------------------------------------------------------------------------------------------------------------
//                                              ThreadGroup class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
// ThreadGroup(String threadGroupName)
// ThreadGroup(ThreadGroup parentObject, String threadGroupName)
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// int activeCount()                                        - returns counts the amount of active threads in a group.
// int activeGroupCount()                                   - returns the amount of groups, for that the calling thread is
//                                                            parent.
// void checkAccess()                                       - forces the security manager to check if thread has access.
// final void destroy()                                     - terminates treadgroup.
// int enumerate(Thread threads[])                          - enumerates the threads to array.
// int enumerate(Thread treads[], boolean all)              - enumerates the threads to array. If true - all subgroups.
// int enumerate(ThreadGroup threads[])                     - enumerates the threads to array.
// int enumerate(ThreadGroup treads[], boolean all)         - enumerates the threads to array. If true - all subgroups.
// final int getMaxPriority()                               - return max priority.
// final String getName()                                   - returns groupName.
// final ThreadGroup getParent()                            - returns parent.
// final void interrupt()                                   - forces interrupt() for all threads in group.
// final boolean isDaemon()                                 - checks if group is daemon.
// boolean isDestroyed()                                    - checks if group is destroyed.
// void list()                                              - prints the data about group.
// final void setDaemon(Boolean daemon)                     - if true marks group as daemon.
// final void setMaxPriority(int priority)                  - sets the max priority for group up.
// String toString()                                        - returns String
// void uncaughtException(Thread thread, Throwable e)       - method is called when the exception becomes uncaught.



public class ThreadLearn {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread thread1 = new NewThread("Thread One", groupA);
        NewThread thread2 = new NewThread("Thread Two", groupA);
        NewThread thread3 = new NewThread("Thread Third", groupB);
        NewThread thread4 = new NewThread("Thread Fourth", groupB);

        System.out.println("Print of list(): ");
        groupA.list();
        groupB.list();
        System.out.println("The groupA is terminated.");
        Thread threadArray[] = new Thread[groupA.activeCount()];
        groupA.enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            ((NewThread)threadArray[i]).mySuspend();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was terminated.");
        }
        System.out.println("Resume group A.");
        for (int i = 0; i <threadArray.length ; i++) {
            ((NewThread)threadArray[i]).myResume();
        }
        try{
            System.out.println("Waiting for terminating of all threads.");
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (Exception e) {
            System.out.println("Exception in Main Thread.");
        }
        System.out.println("Main thread is terminated.");
    }
}


class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup threadGroup) {
        super(threadGroup, threadName);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " terminates.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}