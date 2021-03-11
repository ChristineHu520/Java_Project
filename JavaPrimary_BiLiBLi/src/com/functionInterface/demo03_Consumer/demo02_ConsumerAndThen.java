package com.functionInterface.demo03_Consumer;

import java.util.function.Consumer;

/**
 * @author ChristineHu
 * @date 2020-09-27 8:32
 */
public class demo02_ConsumerAndThen {
    public static void method1(String s, Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept(s);
        con2.andThen(con1).accept(s);
    }
    public static void main(String[] args) {
        method1("helloWorld!",
                (t)->{
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }
}
