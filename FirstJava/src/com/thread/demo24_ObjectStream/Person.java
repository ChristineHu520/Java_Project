package com.thread.demo24_ObjectStream;

import java.io.Serializable;

/**
 * @author ChristineHu
 * @date 2020-08-13 8:43
 */
public class Person implements Serializable {

    private String name;
    private int age;
    private static final long serialVersionUID = 245;
    int a = 1;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
