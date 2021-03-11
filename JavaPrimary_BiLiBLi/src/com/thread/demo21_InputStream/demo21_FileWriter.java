package com.thread.demo21_InputStream;

import sun.font.TrueTypeFont;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-07-29 8:57
 */
public class demo21_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo21_InputStream\\f.txt",true);
        char[] fw = {'a', 'b', 'c'};
        fileWriter.write(fw);
        fileWriter.write("黑马程序员",1,2);
        fileWriter.flush();
        fileWriter.close();
    }
}
