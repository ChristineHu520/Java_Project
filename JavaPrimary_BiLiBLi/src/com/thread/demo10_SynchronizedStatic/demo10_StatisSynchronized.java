package com.thread.demo10_SynchronizedStatic;

/**
 * @author Christine
 * @date 2020-06-12 8:54
 */
public class demo10_StatisSynchronized {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
