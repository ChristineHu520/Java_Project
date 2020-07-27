package com.thread.demo21_InputStream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-07-27 9:04
 */
public class demo21_FileInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo21_InputStream\\b.txt");
        int len = fileInputStream.read();
        System.out.println(len);
    }
}
