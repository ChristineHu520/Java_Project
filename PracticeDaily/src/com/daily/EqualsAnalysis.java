package com.daily;

/**
 * @author : ChristineHu
 * @date Date : 2021年05月19日 16:20
 */
public class EqualsAnalysis {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        Integer aa = new Integer(5);
        Integer bb = new Integer(5);
        System.out.println(String.valueOf(a == b));
        System.out.println(String.valueOf(aa == bb));
        System.out.println(aa.equals(bb));
    }
}
