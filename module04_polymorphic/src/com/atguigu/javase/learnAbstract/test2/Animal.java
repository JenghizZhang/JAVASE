package com.atguigu.javase.learnAbstract.test2;

public abstract class Animal {
    public String name;
    
    public String getName() {
        return name;
    }
    public Animal(){
        System.out.println("Animal constructor");
    }
    
    public Animal(String name) {
        System.out.println("(parameter)Animal constructor");
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void eat();
}
