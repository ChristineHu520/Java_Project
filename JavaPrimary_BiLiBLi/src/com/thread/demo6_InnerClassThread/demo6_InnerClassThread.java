package com.thread.demo6_InnerClassThread;

import java.awt.*;

/**
 * @author Christine
 * @date 2020-06-09 8:44
 */
public class demo6_InnerClassThread {
    public static void main(String[] args) {

        //1.new MyThread = Thread(),Thread类的子类
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i + "--Thread内部类" );
                }
            }
        }.start();

        //2.runnable接口的实现   接口Runnable r=实现类 new RunnableImpl();（多态）
        new Thread(new Runnable(){
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i + "--Runnable内部类");
                }
            }
        }).start();

    }
}
