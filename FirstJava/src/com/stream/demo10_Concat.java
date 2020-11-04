package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-11-04 8:53
 */
public class demo10_Concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "赵敏", "张翠山", "周芷若", "张无忌");
        String[] arr = {"喜洋洋","美洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.println(name));
    }
}
