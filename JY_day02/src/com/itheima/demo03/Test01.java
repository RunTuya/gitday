package com.itheima.demo03;

import com.itheima.demo02.Fanxin02;

public class Test01<I> implements Fanxin03<I> {
    @Override
    public void abc(Object o) {
        System.out.println(o);
    }
}
