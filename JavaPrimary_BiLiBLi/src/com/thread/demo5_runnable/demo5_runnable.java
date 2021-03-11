package com.thread.demo5_runnable;

/**
 * @author Christine
 * @date 2020-06-08 9:01
 */
public class demo5_runnable {
    public static void main(String[] args) {
        //3.创建一个runnable实现类的对象
        RunnableImpl run = new RunnableImpl();
        //4.创建一个Thread类对象,将实现类对象传递给Thread的构造函数
        Thread t = new Thread(run);
        //5.调用start方法
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
