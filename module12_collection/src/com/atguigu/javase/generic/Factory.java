package com.atguigu.javase.generic;

public class Factory<QQ> {
    private QQ i;
    
    public Factory(QQ i) {
        this.i = i;
    }
    
    public QQ set(QQ i){
        this.i = i;
        return i;
    }
}
