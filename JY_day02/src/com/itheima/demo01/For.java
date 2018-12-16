package com.itheima.demo01;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        //集合英增强for遍历
        ArrayList<Object> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        /*
        格式:
        for(元素的数据类型  变量 : Collection集合or数组){
  	            //写操作代码
            }
         */

        for (Object o : list) {
            System.out.println(o);
        }
        //数组用增强for遍历
        int[] arr ={12,123,1234,12345,12};
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
