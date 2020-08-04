package com.thread.demo23_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-08-04 9:12
 */
public class demo23_BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\b1.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int len = 0;//len是每次读取的有效字节个数
        byte[] bytes = new byte[1024];
        bufferedInputStream.read(bytes);
        System.out.println();

    }
}
