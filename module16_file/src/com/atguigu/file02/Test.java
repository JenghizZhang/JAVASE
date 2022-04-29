package com.atguigu.file02;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // fileMethod();
        fileMethod2();
    }
    
    public static void fileMethod(){
        File f1 = new File("/Users/yunsongzhang/Desktop/test/java/Desktop/1");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getParentFile());
        // System.out.println(f1.getPath());
        // System.out.println(f1.getName());
    }
    
    public static void fileMethod2(){
        File f = new File("/Users/yunsongzhang/Desktop/test/java/module01_array");
        // File f = new File("/Users/yunsongzhang/Desktop/test/java/module01_array/.DS_Store");
        File[] files = f.listFiles();
        deepFile(f);
        // for(File file:files){
        //     System.out.println(file);
        // }
    }
    
    public static void deepFile(File file){
        File[] files = file.listFiles();
    
        if(file == null||files==null){
            return;
        }
        // if(files.length == 0){
        //     return;
        // }
        
        for(File f:files){
            System.out.println(f);
            deepFile(f);
        }
        return;
    }
    
}
