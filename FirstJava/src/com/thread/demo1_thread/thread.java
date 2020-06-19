package com.thread.demo1_thread;

/**
 * @author Christine
 * @date 2020-05-18 20:32
 */

/**
 * 随机结果打印，线程的执行顺序不固定，每次都会有不同
 */

public class thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i=0;i<20;i++){
            System.out.println("main:" + i);
        }
    }
}
