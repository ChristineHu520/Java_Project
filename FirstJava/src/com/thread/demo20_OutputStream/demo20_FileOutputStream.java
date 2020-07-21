package com.thread.demo20_OutputStream;

import java.io.FileOutputStream;
import java.lang.reflect.Field;

/**
 * @author ChristineHu
 * @date 2020-07-21 8:30
 */
public class demo20_FileOutputStream {
    public static void main(String[] args) throws Exception{
        //1、创建一个FileOutputStream对象
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo20_OutputStream\\b.txt");
        //2、调用FileOutputStream的方法write，将数据写入文件
        fileOutputStream.write(56);
        //3、释放资源
        fileOutputStream.close();
    }
}
