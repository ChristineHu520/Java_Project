package com.thread.demo21_InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-07-28 8:42
 */
public class demo21_FileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //1、创建一个字节输入流对象
        //2、创建一个字节输出流对象
        FileInputStream fileInputStream = new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo21_InputStream\\b.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo21_InputStream\\b1.txt");
        //3、一次读取一个字节或者一次读取多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes);
        }
        //关闭流资源，先关写的，在关读的
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("复制文件共计耗时：" + (end-start) + "毫秒");
    }
}
