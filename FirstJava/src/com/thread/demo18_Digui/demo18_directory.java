package com.thread.demo18_Digui;

import java.io.File;

/**
 * @author ChristineHu
 * @date 2020-07-10 8:33
 */
public class demo18_directory {
    public static void main(String[] args) {
        File files = new File("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo18_Digui");
        getAllFile(files);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] file = dir.listFiles();
        for (File f : file){
            if (f.isDirectory()){
                getAllFile(f);
            }else
                System.out.println(f);
        }
    }
}
