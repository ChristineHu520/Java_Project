package com.thread.demo3_setName;

/**
 * @author Christine
 * @date 2020-05-18 20:32
 */


public class thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("小强");
        myThread.start();
        new MyThread("旺财").start();
    }
}
