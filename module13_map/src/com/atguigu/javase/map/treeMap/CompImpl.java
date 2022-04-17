package com.atguigu.javase.map.treeMap;

import com.atguigu.javase.map.javabean.Person;

import java.util.Comparator;

public class CompImpl implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
