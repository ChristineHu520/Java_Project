package com.thread.demo24_ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author ChristineHu
 * @date 2020-08-17 8:37
 */
public class demo24_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo24_ObjectStream\\ObjectOutputStream.txt"));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(object);
    }
}
