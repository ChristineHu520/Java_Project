package com.thread.demo23_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author ChristineHu
 * @date 2020-08-05 8:42
 */
public class demo23_BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\c.txt"));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("写入数据");
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
