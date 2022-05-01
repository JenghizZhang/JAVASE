package com.atguigu.traffic;

public enum Color {
    RED("red"),
    GREEN("green"),
    YELLOW("yellow");
    private String tag;
    
    public String getTag() {
        return tag;
    }
    
    Color(String tag) {
        this.tag = tag;
    }
}
