package com.thread.demo23_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-08-05 8:54
 */
public class demo23_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo23_IO\\c.txt"));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
