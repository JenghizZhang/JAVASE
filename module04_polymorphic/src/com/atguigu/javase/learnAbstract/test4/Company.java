package com.atguigu.javase.learnAbstract.test4;

public abstract class Company {
    private String name;
    private String id;
    
    public String getName()  {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public abstract void work();
}
