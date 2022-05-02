package com.atguigu.reflect01;

public class Person {
    public String name = "asd";
    private int age=10;
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public Person() {
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Person(String name) {
        this.name = name;
    }
}
