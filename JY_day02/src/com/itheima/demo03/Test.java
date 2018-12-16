package com.itheima.demo03;

import com.itheima.demo02.Fanxin02;

public class Test implements Fanxin03<String> {

    @Override
    public void abc(String s) {
        System.out.println(s);
    }
}
