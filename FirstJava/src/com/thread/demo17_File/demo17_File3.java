package com.thread.demo17_File;

import java.io.File;

import static com.thread.demo17_File.demo17_File2.show1;

/**
 * @author ChristineHu
 * @date 2020-07-07 8:53
 */
public class demo17_File3 {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        File file = new File("F:\\Java资料");
        String [] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

}
