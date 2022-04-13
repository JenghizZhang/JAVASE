package com.atguigu.javase.generic;

public class Financial extends Company{
    public Financial(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Financial{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
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
    
    @Override
    public void work() {
        System.out.println(name+" is working");
    }
}
