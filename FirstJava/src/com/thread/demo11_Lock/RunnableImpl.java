package com.thread.demo11_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Christine
 * @date 2020-06-14 11:04
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (ticket > 0){
            //可能出现安全问题的代码前面使用lock锁
            lock.lock();
            if(ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket +"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //无论是否有异常，都会将lock锁归还
                    lock.unlock();
                }
            }
        }
    }
}
