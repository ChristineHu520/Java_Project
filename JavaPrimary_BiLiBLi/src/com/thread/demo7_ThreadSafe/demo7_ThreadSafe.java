package com.thread.demo7_ThreadSafe;

/**
 * @author Christine
 * @date 2020-06-10 8:42
 */
public class demo7_ThreadSafe {
    public static void main(String[] args) {
        //创建Runnable接口实现类对象，调用Thread的构造函数传递实现类对象，调用Thread的start函数开启多线程
        RunnableImpl run = new RunnableImpl();
        //如果构造函数传递的run不是同一个，那么就不会发生访问共同的资源
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
