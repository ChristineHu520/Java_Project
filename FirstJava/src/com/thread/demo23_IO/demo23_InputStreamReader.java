package com.thread.demo23_IO;

import com.sun.corba.se.spi.orbutil.fsm.InputImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ChristineHu
 * @date 2020-08-11 9:00
 */
public class demo23_InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        //默认ut-8读取gbk乱码
        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\outputStreamWritergbk.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\outputStreamWritergbk.txt"),"gbk");
        int len = 0;
        System.out.print("\r\n");
        while ((len = inputStreamReader.read())!=-1){
            System.out.print((char)len);
        }
        inputStreamReader.close();
    }

    private static void read_utf8() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\outputStreamWriter.txt"),"utf-8");
        int len = 0;
        while ((len = inputStreamReader.read())!=-1){
            System.out.print((char)len);
        }
        inputStreamReader.close();
    }
}
