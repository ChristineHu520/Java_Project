package com.thread.demo23_IO;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ChristineHu
 * @date 2020-08-11 8:40
 */
public class demo23_OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\outputStreamWritergbk.txt"),"gbk");
        outputStreamWriter.write("你好gbk");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    private static void write_utf8() throws IOException {
        //1.创建OutputStreamwriter对象，传递字节输出流对象和字符编码格式
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\outputStreamWriter.txt"),"utf-8");
        //2.调用write方法写入数据
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
