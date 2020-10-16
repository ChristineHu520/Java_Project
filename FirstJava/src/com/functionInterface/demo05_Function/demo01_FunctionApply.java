package com.functionInterface.demo05_Function;

import java.util.function.Function;

/**
 * @author ChristineHu
 * @date 2020-10-16 8:30
 */
/*
    Function接口：将一个类型的数据转换为另一个类型的数据
        调用apply方法，Function<>包含一个前置泛型一个后置泛型
 */
public class demo01_FunctionApply {
    public static void change(String s, Function<String,Integer> function){
        Integer integer = function.apply(s);
        System.out.println(integer);
    }

    public static void main(String[] args) {
        String str = "12323";
        change(str,(String s)->{
            return Integer.parseInt(s);
        });
    }
}
