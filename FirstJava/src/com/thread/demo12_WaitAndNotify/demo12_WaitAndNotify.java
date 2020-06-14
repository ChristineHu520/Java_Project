package com.thread.demo12_WaitAndNotify;

/**
 * @author Christine
 * @date 2020-06-14 12:18
 */
public class demo12_WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象，保证唯一
        Object object = new Object();

        //创建顾客线程
        new Thread(){
            //重写run方法

            @Override
            public void run() {
                //设置线程任务
                synchronized (object){
                    System.out.println("顾客买包子：告诉老板数量和种类");
                    try {
                        object.wait();
                        System.out.println("顾客开始吃包子");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        //创建老板线程
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println("包子做好了，可以吃了");
                        object.notify();
                    }
                }
            }
        }.start();
    }
}
