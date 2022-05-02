package com.atguigu.reflect01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
    
        Person person = new Person("1234");
        Class clazz = person.getClass();
    
        Class aClass = Class.forName("com.atguigu.reflect01.Person");
        Person p = (Person) aClass.newInstance();
        System.out.println(p.getName());
    
        Constructor c1 = clazz.getDeclaredConstructor();
        Person p2 = (Person) c1.newInstance();
        System.out.println(p2.getName());
    
        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class);
        Person p3 = (Person) c2.newInstance("qwe", 123);
        System.out.println(p3);
    }
}
