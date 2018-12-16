package com.itheima.demo02;

import java.util.ArrayList;
import java.util.Calendar;

public class TestFanxin {
    public static void main(String[] args) {
        Fanxin fx =new Fanxin();
        fx.setName("张三");
        Object ibj = fx.getName();
        System.out.println(ibj);

        Fanxin<Integer>  fx2 = new Fanxin<>();
        Integer name =123;
        System.out.println(name);


    }
}
