package com.thread.demo17_File;

import java.io.File;
import java.util.logging.FileHandler;

/**
 * @author ChristineHu
 * @date 2020-07-01 8:33
 */
public class demo17_File {
    public static void main(String[] args) {
        //与系统有关的路径分隔符，为了方便表示为一个字符串
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        //与系统有关的文件名称分隔符
        String separator = File.separator;
        System.out.println(separator);
    }
}
