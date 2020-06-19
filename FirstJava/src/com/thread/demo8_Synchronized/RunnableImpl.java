package com.thread.demo8_Synchronized;

/**
 * @author Christine
 * @date 2020-06-10 8:42
 */

/**
 * 创建runnable接口的实现类，重写run方法创建线程任务
 */
public class RunnableImpl implements Runnable{
    //设置总票数100张
    private int ticket = 100;
    //创建锁对象
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
           //同步代码块，增加锁对象
            synchronized (obj){
                //票存在的时候，可以买票
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票" );
                    ticket--;
                }else break;
            }
        }

    }
}
