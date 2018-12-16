package com.itheima.demo02;

public class Fanxin<E> {
    private E name;

    public Fanxin() {

    }

    public Fanxin(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
