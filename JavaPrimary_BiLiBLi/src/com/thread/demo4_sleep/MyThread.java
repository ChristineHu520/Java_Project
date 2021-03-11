package com.thread.demo4_sleep;

/**
 * @author Christine
 * @date 2020-05-18 20:36
 */

/*
    thread类的sleep方法,让程序休眠一秒钟,sleep方法的参数是毫秒
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
