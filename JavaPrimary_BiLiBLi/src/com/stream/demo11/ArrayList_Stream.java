package com.stream.demo11;

/**
 * @author ChristineHu
 * @date 2020-11-05 9:02
 */

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 传统的集合处理方式需要很多次的for循环
 * 1、第一个集合只要名字是3个字的成员
 * 2、第一个队伍只要前3个人
 * 3、第二个队伍只要姓张的成员
 * 4、第二个队伍筛选之后不要前2个人
 * 5、将两个队伍合并成一个队伍
 * 6、根据姓名创建对象，并存储到新的集合中
 * 7、遍历person对象
 */
public class ArrayList_Stream {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("迪丽热巴");
        arrayList1.add("宋远桥");
        arrayList1.add("苏星河");
        arrayList1.add("石破天");
        arrayList1.add("石中玉");
        arrayList1.add("老子");
        arrayList1.add("庄子");
        arrayList1.add("洪七公");

        //利用filter进行过滤，limit进行截取前几个数据
        Stream<String> oneStream = arrayList1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("古力娜扎");
        arrayList2.add("张无忌");
        arrayList2.add("赵丽颖");
        arrayList2.add("张三丰");
        arrayList2.add("尼古拉斯巴拉啦");
        arrayList2.add("张天爱");
        arrayList2.add("张柏芝");

        //利用filter进行过滤，skip进行截取，跳过前几个数据
        Stream<String> twoStream = arrayList2.stream().filter(name -> name.startsWith("张")).skip(2);

        //利用Stream的静态方法concat，将两个流进行合并，利用map进行映射将string映射成person类，foreach进行输出
        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(p-> System.out.println(p));

    }
}
