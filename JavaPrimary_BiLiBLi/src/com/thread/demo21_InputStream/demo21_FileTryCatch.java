package com.thread.demo21_InputStream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ChristineHu
 * @date 2020-07-30 9:00
 */
public class demo21_FileTryCatch {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("W:\\B.txt");){
            int len = 0;
            while ((len = fileInputStream.read())!=-1){
                System.out.println(len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
