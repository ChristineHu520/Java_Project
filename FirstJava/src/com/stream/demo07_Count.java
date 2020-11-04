package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-11-04 8:19
 */
public class demo07_Count {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Stream<Integer> stream = arrayList.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
