package com.ugo.java.multithreads.threads;

/**
 * MyThread variations. This version creates a Thread when its constructor is called
 * and stores it in an instance variable called thrd. It also sets the name of the
 * thread and provides a factory method to create and start a thread.
 */

public class MyThreadTwo implements Runnable {

    //A ref to the thread is stored in thrd.
    Thread thrd;

    //Construct a new thread using this Runnable and give it a name.
    public MyThreadTwo (String name) {
        thrd = new Thread(this, name);
    }

    //A factory method that creates and starts a thread.
    public static MyThreadTwo createAndStart(String name) {
        MyThreadTwo myThrd = new MyThreadTwo(name);

        //Start the thread
        myThrd.thrd.start();
        return myThrd;

    }

    //Entry point of thread.
    @Override
    public void run() {

    }
}
