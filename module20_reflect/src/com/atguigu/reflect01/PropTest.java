package com.atguigu.reflect01;

import java.lang.reflect.Field;

public class PropTest {
    public static void main(String[] args) throws Exception {
        Class person = Person.class;
        Person p = (Person) person.getDeclaredConstructor(String.class, int.class).newInstance("zhangsan", 123);
        
        Field[] fields = person.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> type = field.getType();
            System.out.println("name = " + name);
            System.out.println("type = " + type);
            // if (field.getModifiers() == 1) {
            //     Object o = field.get(p);
            //     System.out.println("para = " + o);
            // }
            
            field.setAccessible(true);
            Object o = field.get(p);
            System.out.println("para = " + o);
        }
    
        Field name = person.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"asdasdasd");
        System.out.println(p.getName());
    }
}
