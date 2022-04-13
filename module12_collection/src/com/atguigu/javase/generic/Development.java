package com.atguigu.javase.generic;

public class Development extends Company{
    public Development(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Development{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    
    public void work(){
        System.out.println(name+" is working");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    private String name;
    private int id;
}
