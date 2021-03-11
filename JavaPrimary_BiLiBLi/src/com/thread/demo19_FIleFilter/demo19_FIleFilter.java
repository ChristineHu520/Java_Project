package com.thread.demo19_FIleFilter;

import java.io.File;

/**
 * @author ChristineHu
 * @date 2020-07-15 8:59
 */
public class demo19_FIleFilter {
    public static void main(String[] args) {
        File file = new File("F:\\Java资料");
        getAllFiles(file);
    }

    private static void getAllFiles(File dir) {
        //传递过滤器
        File[] files = dir.listFiles(new demo19_FileFilterImpl());
        for(File f : files){
            if(f.isDirectory())
                getAllFiles(f);
            else
                System.out.println(f);
        }
    }
}
