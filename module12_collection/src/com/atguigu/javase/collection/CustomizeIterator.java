package com.atguigu.javase.collection;

import com.atguigu.javase.pojo.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomizeIterator {
    public static void main(String[] args) {
        Collection<Person> c = new ArrayList<>();
        c.add(new Person("san", 20));
        c.add(new Person("si", 21));
        c.add(new Person("wu", 21));
        
        Iterator<Person> it = c.iterator();
        
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p);
        }
    }
}
