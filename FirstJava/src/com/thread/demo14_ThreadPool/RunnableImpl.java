package com.thread.demo14_ThreadPool;

/**
 * @author ChristineHu
 * @date 2020-06-23 8:19
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
    }
}
