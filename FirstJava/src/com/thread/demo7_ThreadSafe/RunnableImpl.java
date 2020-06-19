package com.thread.demo7_ThreadSafe;

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
    @Override
    public void run() {
        while (true){
            //票存在的时候，可以买票
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票" );
                ticket--;
            }
        }

    }
}
