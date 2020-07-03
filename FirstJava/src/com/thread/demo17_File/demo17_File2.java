package com.thread.demo17_File;

import java.io.File;
import java.util.logging.FileHandler;

/**
 * @author ChristineHu
 * @date 2020-07-01 8:51
 */
public class demo17_File2 {
    public static void main(String[] args) {

        show1();
        show2();
    }

    private static void show2() {
        /*
                File(String parent, String child)
         */
    }

    public static void show1(){
        File f1 = new File("D:\\HundSun\\bop2.2");
        System.out.println(f1);  //绝对路径以文件夹结尾，D:\HundSun\bop2.2,以文件夹结尾

        File f2 = new File("D:\\HundSun\\bop2.2\\b.txt");
        System.out.println(f2);  //绝对路径以文件结尾，D:\HundSun\bop2.2\b.txt

        File f3 = new File("b.txt");
        System.out.println(f3);  //相对路径，b.txt
    }
}
