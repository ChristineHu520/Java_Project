package com.thread.demo11_lock;

/**
 * @author Christine
 * @date 2020-06-14 11:09
 */
public class demo11_Lock {
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
