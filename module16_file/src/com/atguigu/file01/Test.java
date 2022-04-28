package com.atguigu.file01;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("/Users/yunsongzhang/Desktop/1.txt");
        System.out.println(f1);
        
        File f2 = new File("/Users/yunsongzhang/Desktop","/test/java");
        System.out.println(f2);
    
        File f3 = new File(new File("/Users/yunsongzhang/Desktop"), "test/java");
        System.out.println(f3);
        
        fileMethod4();
    }
    
    public static void fileMethod1(File f){
        try {
            boolean newFile = f.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void fileMethod2(File f){
        boolean d = f.mkdirs();
    }
    
    public static void fileMethod3(File f){
        boolean delete = f.delete();
        System.out.println(delete);
    }

    public static void fileMethod4(){
        File file = new File("/Users/yunsongzhang/Desktop/1.txt");
        System.out.println(file.exists());
        
    }
}
