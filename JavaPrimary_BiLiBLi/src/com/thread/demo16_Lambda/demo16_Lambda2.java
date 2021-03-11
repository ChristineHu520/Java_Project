package com.thread.demo16_Lambda;

/**
 * @author ChristineHu
 * @date 2020-06-30 8:26
 */
public class demo16_Lambda2 {
    public static void main(String[] args) {

        /*
            匿名内部类实现接口中的抽象方法
         */
        invokeCalc(10,20,new Calculator(){
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        /*
            Lambda表达式实现接口抽象方法
         */
        invokeCalc(15,48,(int a, int b)->{
            return a+b;
        });
    }

    public static void invokeCalc  (int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
