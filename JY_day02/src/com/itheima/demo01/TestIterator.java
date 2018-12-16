package com.itheima.demo01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> list = new ArrayList<>();
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        list.add("一");
        //创建迭代器
        //  获取集合对应的迭代器，用来遍历集合中的元素的
        Iterator<String> it = list.iterator();

        //不知道集合中有多少元素 所用使用while循环

        while (it.hasNext()){
            //使用Iterator接口中的方法next判断是取出下一个元素
            String e = it.next();
            System.out.println(e);  // "一"
            //使用Iterator接口中的方法hasNext判断有没有下个元素
            boolean r = it.hasNext();
            System.out.println(r);  //true / false

        }
        //for循环遍历
        System.out.println("--------------------");
        for (Iterator<String> it2 = list.iterator();it2.hasNext();){
            String e =it2.next();
            System.out.println(e);

        }
    }
}
