package com.thread.demo9_Synchronized;

import javax.sound.midi.Soundbank;
import java.text.BreakIterator;

/**
 * @author Christine
 * @date 2020-06-12 8:35
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    //重写run方法
    @Override
    public void run() {
        System.out.println("this:" + this);
        while (true){
           saleTicket();
           if (ticket<=0)
               break;
        }
    }

    public synchronized int saleTicket(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
        return ticket;
    }
}
