package com.thread.demo5_runnable;

/**
 * @author Christine
 * @date 2020-06-08 9:02
 */

//1.创建一个runnable的实现类
public class RunnableImpl implements Runnable{
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
