package com.thread.demo18_Digui;

/**
 * @author ChristineHu
 * @date 2020-07-09 8:56
 */
public class demo18_n {
    public static void main(String[] args) {
        System.out.println(restirction(5));
    }

    private static long restirction(int n) {
        if(n==1){
            return 1;
        }
        else
            return n * restirction(n-1);
    }

}
