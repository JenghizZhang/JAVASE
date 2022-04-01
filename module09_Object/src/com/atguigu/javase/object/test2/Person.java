package com.atguigu.javase.object.test2;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public boolean equals(Object obj){
        
        if(obj==null){
            return false;
        }
        
        if(this == obj){
            return true;
        }
        
        if(obj instanceof Person){
            return this.age == ((Person)obj).age;
        }
        
        return false;
    }
}
