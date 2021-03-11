package com.thread.demo23_IO;

import java.io.*;
import java.lang.reflect.Array;
import java.util.HashMap;

/**
 * @author ChristineHu
 * @date 2020-08-06 8:37
 */
public class demo23_BufferedCopy {
    public static void main(String[] args) throws IOException {
        //1、创建一个字符缓冲输入流，字符缓冲输出流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\in.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\out.txt"));
       //创建hashmap，其中会对key自动排序
        HashMap<String,String> hashMap = new HashMap<>();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            String[] arrays = line.split("\\.");
            hashMap.put(arrays[0],arrays[1]);
        }
        for (String key: hashMap.keySet()){
            String value = hashMap.get(key);
            line = key + "." + value;
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
