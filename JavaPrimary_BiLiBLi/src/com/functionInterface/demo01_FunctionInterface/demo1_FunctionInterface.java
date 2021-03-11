package com.functionInterface.demo01_FunctionInterface;

/**
 * @author ChristineHu
 * @date 2020-09-07 8:35
 */
public class demo1_FunctionInterface{
    /*
    接口的入参是一个函数式接口
     */
    private static void show1(MyFunctionInterface myFunctionInterface) {
        myFunctionInterface.method();
    }
    public static void main(String[] args) {
        //传递实现类对象
        show1(new MyFunctionInterfaceImpl());
        //传递匿名内部类
        show1(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("函数式接口的匿名内部类");
            }
        });
        //使用lambda表达式
        show1(()->{
            System.out.println("函数式接口的ambda表达式");
        });
    }
}
