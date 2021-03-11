package com.thread.demo9_Synchronized;

/**
 * @author Christine
 * @date 2020-06-12 8:39
 */

/**
 * 同步方法
 */
public class demo9_Synchronized {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        System.out.println("run: -->" + run );
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
