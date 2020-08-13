package com.thread.demo24_ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ChristineHu
 * @date 2020-08-13 8:48
 */
public class demo24_ObejctOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo24_ObjectStream\\ObjectOutputStream.txt"));
        Person person = new Person("husj",24);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }
}
