package com.functionInterface.demo04_Predicate;

import java.util.function.Predicate;

/**
 * @author ChristineHu
 * @date 2020-09-29 8:46
 */
public class demo01_checkString {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String str = "abcde";
        String str2 = "abcdefg";
        int num = 2345;
        boolean b = checkString(str,(String t)->{
            return t.length()>5;
        });
        System.out.println(b);
        boolean b2 = checkString(str2,(String t)->{
            return t.length()>5;
        });
        System.out.println(b2);
    }
}
