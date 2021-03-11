package com.thread.demo24_ObjectStream;

import javafx.beans.binding.ObjectExpression;

import java.io.*;
import java.util.ArrayList;

/**
 * @author ChristineHu
 * @date 2020-08-18 8:42
 */
public class demo24_ArrayListObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("张三",13));
        arrayList.add(new Person("李四",23));
        arrayList.add(new Person("sinderala",18));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo24_ObjectStream\\ObjectList.txt"));
        objectOutputStream.writeObject(arrayList);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\thread\\demo24_ObjectStream\\ObjectList.txt"));
        Object persons = objectInputStream.readObject();
        ArrayList<Person> personArrayList = (ArrayList<Person>)persons;
        for (Person person : personArrayList) {
            System.out.println(person);
        }
        objectInputStream.close();
        objectOutputStream.close();
        
    }
}
