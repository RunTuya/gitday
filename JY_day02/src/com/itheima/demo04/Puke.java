package com.itheima.demo04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;

public class Puke {
    public static void main(String[] args) {
        //拥有一副扑克牌
        ArrayList<String> list = new ArrayList<>();
        list.add("大王");
        list.add("小王");
        String[] color ={"♠","♥","♦","♣"};
        String[] shuzi ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //将扑克存入一个集合中
        for (String c : color) {
            for (String s : shuzi) {
                list.add(c+s);
            }
        }
        //洗牌
        Collections.shuffle(list);
        //3个玩家 和一个底牌
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        ArrayList<String> a4 = new ArrayList<>();
        //发牌
        for (int i = 0; i < list.size(); i++) {
             if(i>=51){
                 a4.add(list.get(i));
            }else if (i%3 == 1){
                 a1.add(list.get(i));
            }else if (i%3 == 2){
                a2.add(list.get(i));
            }else if (i%3 == 0){
                a3.add(list.get(i));
            }
        }
        //打印输出玩家手上的牌
        System.out.println("玩家1:" + a1);
        System.out.println("玩家2:" + a2);
        System.out.println("玩家3:" + a3);
        System.out.println("底牌:" + a4);

    }
}


