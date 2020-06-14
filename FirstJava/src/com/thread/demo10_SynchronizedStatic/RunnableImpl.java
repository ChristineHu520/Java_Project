package com.thread.demo10_SynchronizedStatic;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.krb5.internal.Ticket;

/**
 * @author Christine
 * @date 2020-06-12 8:55
 */
public class RunnableImpl implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            saleTicketStatic();
            if(ticket<=0)
                break;
        }
    }

    private static synchronized int saleTicketStatic() {
        if (ticket>0){
            System.out.println(Thread.currentThread().getName() + "--》正在卖第" + ticket + "张票");
            ticket--;
        }
        return ticket;
    }
}
