package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-11-04 8:42
 */
public class demo08_Limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜洋洋","美洋洋","懒洋洋","灰太狼","红太狼");
        Stream<String> limit = stream.limit(3);
        limit.forEach((String s)->{
            System.out.println(s);
        });
    }
}
