package com.thread.demo23_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-08-04 8:49
 */
public class demo23_BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\b1.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("字节输出缓冲流写入".getBytes());
        bufferedOutputStream.flush();
    }
}
