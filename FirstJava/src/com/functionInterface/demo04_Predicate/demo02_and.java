package com.functionInterface.demo04_Predicate;

import java.util.function.Predicate;

/**
 * @author ChristineHu
 * @date 2020-10-14 8:46
 */
public class demo02_and {
    public static boolean checkstring(String s, Predicate<String> pre1, Predicate<String> pre2){
        //return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }
    public static void main(String[] args) {
        String str = "abcdef";
        Boolean b = checkstring(str,(String s)->{
            return str.length()>5;
        },(String s)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
