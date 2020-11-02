package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-11-02 8:44
 */
public class demo06_Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","4");
        //使用map方法，将string类型映射成int类型
        Stream<Integer> stream1 = stream.map((String s)->{
            return Integer.parseInt(s);
        });
        stream1.forEach((Integer i)->{
            System.out.println(i);
        });
    }
}
