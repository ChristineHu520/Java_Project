package com.thread.demo3_setName;

/**
 * @author Christine
 * @date 2020-05-18 20:36
 */

/*
    设置线程名称etName（）
 */
public class MyThread extends Thread {

    public MyThread(){}
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);
    }
}
