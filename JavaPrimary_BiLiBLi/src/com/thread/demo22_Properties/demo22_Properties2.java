package com.thread.demo22_Properties;

import jdk.jfr.events.FileReadEvent;

import javax.xml.bind.ValidationEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author ChristineHu
 * @date 2020-08-03 8:34
 */
public class demo22_Properties2 {
    public static void main(String[] args) throws IOException {
        //1、创建properties集合
        Properties properties = new Properties();
        //2、取文件中的键值对
        properties.load(new FileReader("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo22_Properties\\prop2.txt"));
        //3、遍历
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);

        }
        

    }
}
