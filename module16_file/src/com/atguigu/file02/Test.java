package com.atguigu.file02;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // fileMethod();
        
    }
    
    public static void fileMethod(){
        File f1 = new File("/Users/yunsongzhang/Desktop/test/java/Desktop/1");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getParentFile());
        // System.out.println(f1.getPath());
        // System.out.println(f1.getName());
    }
    
    public static void fileMethod2(){
        File f = new File("/Users/yunsongzhang/Desktop/test/java");
        File[] files = f.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }
    
}
