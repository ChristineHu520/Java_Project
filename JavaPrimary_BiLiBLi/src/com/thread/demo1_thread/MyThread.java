package com.thread.demo1_thread;

/**
 * @author Christine
 * @date 2020-05-18 20:36
 */

/*
    线程的随机打印结果，抢占式调度
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("run:" + i);
        }
    }
}
