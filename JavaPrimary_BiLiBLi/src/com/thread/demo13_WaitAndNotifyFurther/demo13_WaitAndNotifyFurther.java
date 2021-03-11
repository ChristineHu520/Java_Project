package com.thread.demo13_WaitAndNotifyFurther;

/**
 * @author Christine
 * @date 2020-06-16 8:52
 */
public class demo13_WaitAndNotifyFurther {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new Customer(baoZi).start();
    }
}
