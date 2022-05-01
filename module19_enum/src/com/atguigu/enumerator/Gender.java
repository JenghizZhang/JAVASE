package com.atguigu.enumerator;

public enum Gender {
    MALE("男"),
    FEMALE("女");
    
    private String tag;
    
    public String getTag() {
        return tag;
    }
    
    Gender(String tag) {
        this.tag = tag;
    }
}
