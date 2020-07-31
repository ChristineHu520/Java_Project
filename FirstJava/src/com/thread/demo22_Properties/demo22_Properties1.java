package com.thread.demo22_Properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author ChristineHu
 * @date 2020-07-31 8:33
 */
public class demo22_Properties1 {
    public static void main(String[] args) throws IOException {
        show1();
        show2();
    }

    private static void show2() throws IOException {
        //1、创建peoperties对象
        Properties properties = new Properties();
        properties.setProperty("赵丽颖","35");
        properties.setProperty("迪丽热巴","30");
        properties.setProperty("佟丽娅","32");
        //2、创建字符输出流对象，绑定要写入的目的地
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo22_Properties\\prop1.txt");
        FileWriter fileWriter = new FileWriter("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo22_Properties\\prop2.txt");
        properties.store(fileOutputStream,"bytes");
        properties.store(fileWriter,"char");
        fileOutputStream.close();
        fileWriter.close();
    }

    private static void show1() {
        Properties properties = new Properties();
        properties.setProperty("赵丽颖","35");
        properties.setProperty("迪丽热巴","30");
        properties.setProperty("佟丽娅","32");
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String values = properties.getProperty(key);
            System.out.println("key:" + key + "value:" + values);

        }

    }
}
