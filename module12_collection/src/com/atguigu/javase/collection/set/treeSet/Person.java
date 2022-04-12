package com.atguigu.javase.collection.set.treeSet;



class Person{
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    
    public Person(int age, String name) {
        this.age = age;
        
        this.name = name;
    }
}
