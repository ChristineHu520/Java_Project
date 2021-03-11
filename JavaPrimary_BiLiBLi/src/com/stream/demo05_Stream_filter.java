package com.stream;

import java.util.stream.Stream;

/**
 * @author ChristineHu
 * @date 2020-10-27 8:40
 */
public class demo05_Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "赵敏", "张翠山", "周芷若", "张无忌");
        //返回过滤后的stream流
        Stream<String> stream2 = stream.filter((String name)->{return name.startsWith("张");});
        stream2.forEach(name->System.out.println(name));
        stream.forEach(name->System.out.println(name));
    }
}
