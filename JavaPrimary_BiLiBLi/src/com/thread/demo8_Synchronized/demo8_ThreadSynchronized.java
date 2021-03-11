package com.thread.demo8_Synchronized;

/**
 * @author Christine
 * @date 2020-06-11 10:08
 */

/**
 * 同步代码块
 */
public class demo8_ThreadSynchronized {
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
