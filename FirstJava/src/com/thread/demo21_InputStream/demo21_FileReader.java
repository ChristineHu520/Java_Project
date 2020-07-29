package com.thread.demo21_InputStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-07-29 8:57
 */
public class demo21_FileReader {
  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo21_InputStream\\b.txt");
    int len = 0;
    while((len = fileReader.read())!=-1){
      System.out.println((char)len);
    }
    fileReader.close();
  }
}
