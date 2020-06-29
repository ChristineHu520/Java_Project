package com.thread.demo16_Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ChristineHu
 * @date 2020-06-29 8:38
 */
public class demo16_Lambda {
    public static void main(String[] args) {
        Person[] arrays = {
                new Person("刘岩", 30),
                new Person("迪丽热巴", 19),
                new Person("古力娜扎", 18)
        };

        //对数组进行升序排列
        /*Arrays.sort(arrays, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Arrays.sort(arrays,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for (Person array : arrays) {
            System.out.println(array.toString());
        }
    }
}
