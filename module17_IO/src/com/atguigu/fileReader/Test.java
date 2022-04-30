package com.atguigu.fileReader;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("out.txt");
        char[] arr = new char[1024];
        int r = 0;
        while((r = fr.read(arr))!=-1){
            System.out.println(new String(arr,0,r));
        }
        fr.close();
    }
}
