package com.itheima.demo01;
/*
java.util.collection接口
    所用单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

    共性方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      add.();
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      remove.();  返回的是布尔值 ,如果集合中有则删除返回true,反之返回false
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      contains.()返回的是布尔值 ,如果集合中有则删除返回true,反之返回false
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      size();
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {
    public static void main(String[] args) {
            //创建集合对象 可以使用多态
        Collection<String> coll = new ArrayList<>();
       // Collection<String> coll =new HashSet<>();
        System.out.println(coll); //重写了toString()方法
        /*
         public boolean add(E e)：  把给定的对象添加到当前集合中 。
         返回值是一个布尔值,一般返回的都是true,不用接收
         */
        boolean b2 = coll.add("一");
        System.out.println(b2);  //返回值是boolean类型 true /false
        System.out.println(coll); // [一 ]
        coll.add("二");
        coll.add("三");
        coll.add("四");
        System.out.println(coll); //[一,二,三,四]
        System.out.println("----remove(E e)----");
        /*
        public boolean remove(E e): 把给定的对象在当前集合中删除。
            返回值是一个boolean值,集合中存在元素,删除元素,返回true
            集合中不存在元素,删除失败,返回false
         */
        boolean b = coll.remove("三");
        System.out.println("b: " +b);
        System.out.println(coll);
        //如果集合中没有此元素,则删除失败 返回false
        boolean b3 = coll.remove("五");
        System.out.println("b3: " + b3);
        System.out.println(coll);
        System.out.println("-----contains(E e)------");
        /*
            public boolean contains(E e): 判断当前集合中是否包含给定的对象。
            包含返回true
            不包含返回false
        */
        boolean b4 = coll.contains("一");
        System.out.println("b4: " + b4);
        //如果集合中没有此元素, 返回false
        boolean b5 = coll.contains("五");
        System.out.println("b5: " +b5);
        System.out.println("----isEmpty()----");
        //判断集合是否为空
        boolean b6 = coll.isEmpty();
        System.out.println("b6: " +b6);
        System.out.println("----size()----");
        //返回集合元素的个数
        int size = coll.size();
        System.out.println("size: "+size);
        System.out.println("-----object[] toArray()----");
        //把集合中的元素,存储到数组中
        Object[] arr =coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----clear()------");
        //情况集合所有元素,但不是删除集合,集合还在,只是元素没了
        coll.clear();
        System.out.println(coll);  //[]
        //判断集合是否为空
        System.out.println(coll.isEmpty());  //true
    }
}
