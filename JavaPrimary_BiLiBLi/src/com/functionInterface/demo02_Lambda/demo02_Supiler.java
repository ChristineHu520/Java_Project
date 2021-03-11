package com.functionInterface.demo02_Lambda;

import javax.sound.midi.Soundbank;
import java.util.function.Supplier;

/**
 * @author ChristineHu
 * @date 2020-09-09 8:42
 */
public class demo02_Supiler {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String s1 = getString(()->{
            return "优化前的函数式接口";
        });
        System.out.println(s1);
        String s2 = getString(()->"优化后的函数式接口");
        System.out.println(s2);
    }
}
