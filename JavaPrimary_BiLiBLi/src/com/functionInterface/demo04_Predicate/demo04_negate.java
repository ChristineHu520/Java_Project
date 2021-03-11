package com.functionInterface.demo04_Predicate;

import java.util.function.Predicate;

/**
 * @author ChristineHu
 * @date 2020-10-15 8:33
 */
public class demo04_negate {
    public static boolean checkstring(String s, Predicate<String> pre1) {
        //return !pre1.test(s) ;
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abc";
        Boolean b = checkstring(s,(String str)->{
            //判断字符串的长度是否大于5
            return str.length()>5;
        });
        System.out.println(b);
    }
}
