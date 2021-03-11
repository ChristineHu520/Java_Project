package com.thread.demo15_Lambda;

/**
 * @author ChristineHu
 * @date 2020-06-24 8:26
 */

//
public class demo15_Lambda {
    public static void main(String[] args) {

        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();


        //使用Lambda表达式创建多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();

    }
}
