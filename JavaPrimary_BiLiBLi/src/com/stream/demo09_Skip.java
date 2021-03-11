package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-11-04 8:49
 */
public class demo09_Skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜洋洋","美洋洋","懒洋洋","灰太狼","红太狼");
        Stream<String> skip = stream.skip(3);
        skip.forEach((String s)->{
            System.out.println(s);
        });
    }
}
