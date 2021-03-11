package com.thread.demo25_PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author ChristineHu
 * @date 2020-08-19 8:43
 */
public class demo25_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo25_PrintStream\\PrintStream.txt");
        printStream.write(97);
        printStream.println(97);
        printStream.println('h');
        printStream.println("啦啦啦");
        System.out.println("控制台输出");
        //改变打印目的地
        System.setOut(printStream);
        System.out.println("文件输出");
        printStream.close();
    }
}
