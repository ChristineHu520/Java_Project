package com.stream.demo11;

/**
 * @author ChristineHu
 * @date 2020-11-05 9:01
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
