package com.thread.demo4_sleep;

/**
 * @author Christine
 * @date 2020-05-18 20:32
 */


public class thread {
    public static void main(String[] args) {
       Thread myThread = new MyThread();
       myThread.start();
    }
}
