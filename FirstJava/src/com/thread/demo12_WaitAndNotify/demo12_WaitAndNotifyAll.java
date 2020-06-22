package com.thread.demo12_WaitAndNotify;

/**
 * @author Christine
 * @date 2020-06-14 16:42
 */
public class demo12_WaitAndNotifyAll {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object object = new Object();

        //创建两个顾客线程
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    System.out.println("顾客1告知老板数量和种类");
                    try {
                        object.wait(5000);
                        System.out.println("顾客1开始吃包子");
                        System.out.println("------------------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    System.out.println("顾客2告知数量和种类");
                    try {
                        object.wait(5000);
                        System.out.println("顾客2开始吃包子");
                        System.out.println("-----------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    try {
                        Thread.sleep(5000);
                       // object.notify();  //随机唤醒一个
                        object.notifyAll();//唤醒所有的
                        System.out.println("包子做好了可吃了");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
