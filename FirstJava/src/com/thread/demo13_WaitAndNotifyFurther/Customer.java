package com.thread.demo13_WaitAndNotifyFurther;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;

/**
 * @author Christine
 * @date 2020-06-16 8:38
 */
public class Customer extends Thread {
    private BaoZi baoZi;

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    //重写run方法设置线程任务
    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后，自动执行wait后面的内容，有包子的时候，顾客吃包子
                System.out.println("顾客正在吃" + baoZi.pi + baoZi.xian + "的包子");

                //吃完包子，修改包子的状态，唤醒包子铺线程
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("包子吃完了，包子铺生产包子");
                System.out.println("-------------");
            }
        }
    }
}
