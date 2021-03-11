package com.functionInterface.demo02_Lambda;

import java.util.function.Supplier;

/**
 * @author ChristineHu
 * @date 2020-09-11 8:29
 */
public class demo02_ArraySupiler {
    //定义一个方法，用于获取int数组中的元素最大值
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] array1 = {100,0,-50,88,99,33,-30};
        int num =  getMax(()->{
            //获取数组中的最大值并返回
            int max = array1[0];
            for(int i:array1){
                if(i>max)
                    max = i;
            }
            return max;
        });
        System.out.println(num);
    }
}
