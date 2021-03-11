package com.thread.demo20_OutputStream;

import java.io.FileOutputStream;
import java.lang.reflect.Field;

/**
 * @author ChristineHu
 * @date 2020-07-21 8:30
 */
public class demo20_FileOutputStream {
    public static void main(String[] args) throws Exception{
        //1、创建一个FileOutputStream对象
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo20_OutputStream\\b.txt");
        //2、调用FileOutputStream的方法write，将数据写入文件，一次写入一个字节的write
        fileOutputStream.write(56);

        //一次写入多个字节的write
        byte[] bytes = {65,66,67};
        fileOutputStream.write(bytes);

        //一次写入byte数组中一部分数据
        byte[] bytes1 = {-65,-66,-67};
        fileOutputStream.write(bytes1, 1,2);

        //可以用字符串的字节写入
        byte[] bytes2 = "你好".getBytes();
        fileOutputStream.write(bytes2);
        //3、释放资源
        fileOutputStream.close();
    }
}
