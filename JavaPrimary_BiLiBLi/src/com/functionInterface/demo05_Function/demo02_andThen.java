package com.functionInterface.demo05_Function;

import java.util.function.Function;

/**
 * @author ChristineHu
 * @date 2020-10-16 8:43
 */
public class demo02_andThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,(String s1)->{
            return Integer.parseInt(s1) + 10;
        },(Integer in)->{
            return in + "";
        });
    }
}
