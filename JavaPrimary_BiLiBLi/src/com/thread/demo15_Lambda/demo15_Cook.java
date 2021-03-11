package com.thread.demo15_Lambda;

import javax.sound.midi.Soundbank;

/**
 * @author ChristineHu
 * @date 2020-06-24 8:49
 */
public class demo15_Cook {
    public static void main(String[] args) {
        //使用匿名内部列的方式实现
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda表达式实现
        invokeCook(()->{
            System.out.println("Lambda吃饭了");
        });
    }

    //定义一个方法，参数传递cook接口，内部调用cook接口中的抽象方法
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
