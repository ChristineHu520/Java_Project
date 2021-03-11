package com.thread.demo2_getName;

/**
 * @author Christine
 * @date 2020-05-18 20:36
 */

/*
    获取线程名称getName（）
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        //直接用getName获取线程名
        String name = getName();
        System.out.println(name);
        //先获取当前线程，再获取名字
        //Thread[Thread-0,5,main],5表示的是优先级

        Thread t = Thread.currentThread();
        System.out.println(t);
        String name1 = t.getName();
        System.out.println(name1);
    }
}
