package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-10-26 8:45
 */
public class demo04_Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三" , "李四", "王五", "赵柳");
        stream.forEach(name->{
            System.out.println(name);
        });
    }
}
