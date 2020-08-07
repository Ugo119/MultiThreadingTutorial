package com.ugo.java.multithreads.main;

import com.ugo.java.multithreads.threads.MyThread;
import com.ugo.java.multithreads.threads.MyThreadTwo;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Main thread starting.");

        //Create a runnable object
        MyThread mt = new MyThread("Child #1");

        //Construct a thread from that object
        Thread newThrd = new Thread(mt);

        //Start execution of the thread
        newThrd.start();

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);

            }catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending."); */

        System.out.println("Main thread starting.");

        //Create and start a thread.
        MyThreadTwo mt = MyThreadTwo.createAndStart("Child #1");
        for(int i=0; i<50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }

}
