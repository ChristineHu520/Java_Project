package com.functionInterface.demo04_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author ChristineHu
 * @date 2020-10-15 8:52
 */
/*
    数组中存储了人员信息，需要将满足以下两个条件的信息筛选出来
        1、将性别是女的
        2、名字是四个字的
 */
public class demo06_arraylist {
    //定义一个方法，传递人员的数据，和两个predicate接口（因为有两个判断条件）
    public static ArrayList<String> filter (String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        //定义一个数组，将筛选后的数据存储进来
        ArrayList<String> list = new ArrayList<String>();
        //遍历数组
        for (String s : arr) {
            Boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","马尔扎哈,男","赵丽颖,女","古力娜扎,女"};
        ArrayList<String> list = filter(array,(String s)->{
            return s.split(",")[1].equals("女");
        },(String s)->{
            return s.split(",")[0].length()==4;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
