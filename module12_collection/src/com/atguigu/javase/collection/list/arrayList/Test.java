package com.atguigu.javase.collection.list.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("a");
        l.add("a1");
        l.add("a2");
        System.out.println(l.pop());
        System.out.println(l);
    }
}
